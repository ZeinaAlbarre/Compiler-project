package VisitorParseTree;

import Antlr.ParserAng;
import Antlr.ParserAngBaseVisitor;
import AstClasses.*;
import ErrorHandler.ComponentErrorHandler;
import ErrorHandler.ImportErrorHandler;
import ErrorHandler.LoopErrorHandler;
import SymbolTable.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Visitor extends ParserAngBaseVisitor {

    private final ImportSymbolTable importSymbolTable = new ImportSymbolTable();
    private LoopSymbolTable loopSymbolTable = new LoopSymbolTable();

    @Override
    public Object visitProgramDef(ParserAng.ProgramDefContext ctx) {
        ProgramDef prog = new ProgramDef();
        if (ctx.sourceElement() != null) {
            SourceElement se = (SourceElement) visit(ctx.sourceElement());
            prog.setSourceElement(se);
        }
        return prog;
    }

    @Override
    public Object visitSourceElementDef(ParserAng.SourceElementDefContext ctx) {
        SourceElementDef sourceElement = new SourceElementDef();

        for (ParserAng.StatementContext stmtCtx : ctx.statement()) {
            Statement statement = (Statement) visit(stmtCtx);
            sourceElement.addStatement(statement);
        }

        return sourceElement;
    }

    @Override
    public Object visitStmImport(ParserAng.StmImportContext ctx) {
        StmImport stmImport = new StmImport();

        ImportStatement imp = (ImportStatement) visit(ctx.importStatement());
        if (imp != null) {
            stmImport.addImportStatement(imp);
        }

        return stmImport;
    }



    @Override
    public Object visitStmtInterface(ParserAng.StmtInterfaceContext ctx) {
        StmtInterface stmtInterface = new StmtInterface();
        InterfaceDeclaration interfaceDeclaration = (InterfaceDeclaration) visit(ctx.interfaceDeclaration());
        if (interfaceDeclaration != null) {
            stmtInterface.setInterfaceDeclarations(interfaceDeclaration);
        }
        return stmtInterface;
    }

    @Override
    public Object visitStmtClass(ParserAng.StmtClassContext ctx) {
        StmtClass stmtClass = new StmtClass();
        ClassDeclaration classDeclaration = (ClassDeclaration) visit(ctx.classDeclaration());
        if (classDeclaration != null) {
            stmtClass.setClassDeclarations(classDeclaration);
        }
        return stmtClass;
    }

    @Override
    public Object visitStmtComponent(ParserAng.StmtComponentContext ctx) {
        StmtComponent stmtComponent = new StmtComponent();
        ComponentDeclaration componentDeclaration = (ComponentDeclaration) visit(ctx.componentDeclaration());
        if (componentDeclaration != null) {
            stmtComponent.setComponentDeclaration(componentDeclaration);
        }
        return stmtComponent;
    }

    @Override
    public Object visitStmtExport(ParserAng.StmtExportContext ctx) {
        StmtExport stmtExport = new StmtExport();
        ExportStatement exportStatement = (ExportStatement) visit(ctx.exportStatement());
        if (exportStatement != null) {
            stmtExport.setExportStatements(exportStatement);
        }
        return stmtExport;
    }


    @Override
    public Object visitStmtExpression(ParserAng.StmtExpressionContext ctx) {
        StmtExpression stmtExpression = new StmtExpression();
        ExpressionStatement expressionStatement = (ExpressionStatement) visit(ctx.expressionStatement());
        if (expressionStatement != null) {
            stmtExpression.setExpressionStatements(expressionStatement);
        }
        return stmtExpression;
    }


    @Override
    public Object visitStmtIf(ParserAng.StmtIfContext ctx) {
        StmtIf stmtIf = new StmtIf();
        IfStatementDefinition ifStatement = (IfStatementDefinition) visit(ctx.ifStatement());
        if (ifStatement != null) {
            stmtIf.setIfStatementDefinition(ifStatement);
        }
        return stmtIf;
    }


    @Override
    public Object visitStmtFor(ParserAng.StmtForContext ctx) {
        StmtFor stmtFor = new StmtFor();
        ForStatementDefinition forStatement = (ForStatementDefinition) visit(ctx.forStatement());
        if (forStatement != null) {
            stmtFor.setForStatement(forStatement);
        }
        return stmtFor;
    }

    @Override
    public Object visitForStatementDefinition(ParserAng.ForStatementDefinitionContext ctx) {
        ForInitializer initializer = null;
        if (ctx.forInitializer() != null) {
            initializer = (ForInitializer) visit(ctx.forInitializer());
        }

        Expression condition = null;
        if (ctx.expression(0) != null) {
            condition = (Expression) visit(ctx.expression(0));
        }

        Expression increment = null;
        if (ctx.expression(1) != null) {
            increment = (Expression) visit(ctx.expression(1));
        }

        Statement singleStatement = null;
        List<Statement> blockStatements = null;

        if (ctx.statement() != null) {
            singleStatement = (Statement) visit(ctx.statement());
        } else if (ctx.sourceElement() != null) {
            SourceElementDef sourceElement = (SourceElementDef) visit(ctx.sourceElement());
            blockStatements = sourceElement.statements;
        }


        String loopVarName = "unknown";

        if (initializer instanceof ForAssignInitializer) {
            loopVarName = ((ForAssignInitializer) initializer).identifier;
        } else if (initializer instanceof ForVariableInitializer) {
            VariableDeclaration var = ((ForVariableInitializer) initializer).getVariableDeclarations().get(0);
            loopVarName = var.getVariableDeclarationDefinition().identifier;

        }


        boolean hasCondition = condition != null;
        boolean hasIncrement = increment != null;


        loopSymbolTable.addLoop(loopVarName, hasCondition, hasIncrement);


        if (!hasCondition && !hasIncrement) {
            LoopErrorHandler.getInstance().log("Loop '" + loopVarName + "' is potentially infinite: missing both condition and increment.");
        } else if (!hasCondition) {
            LoopErrorHandler.getInstance().log("Loop '" + loopVarName + "' may be infinite: missing condition.");
        } else if (!hasIncrement) {
            LoopErrorHandler.getInstance().log("Loop '" + loopVarName + "' may be infinite: missing increment.");
        }

        return new ForStatementDefinition(initializer, condition, increment, singleStatement, blockStatements);
    }


    @Override
    public Object visitForAssignInitializer(ParserAng.ForAssignInitializerContext ctx) {
        String kind = ctx.getChild(0).getText();
        String identifier = ctx.IDENTIFIER().getText();

        Expression initExpr = null;
        if (ctx.expression() != null) {
            initExpr = (Expression) visit(ctx.expression());
        }

        ForAssignInitializer initializer = new ForAssignInitializer();
        initializer.kind = kind;
        initializer.identifier = identifier;
        initializer.initExpression = initExpr;

        return initializer;
    }

    @Override
    public Object visitStmtReturn(ParserAng.StmtReturnContext ctx) {
        StmtReturn stmtReturn = new StmtReturn();
        ReturnStatement returnStatement = (ReturnStatement) visit(ctx.returnStatement());
        if (returnStatement != null) {
            stmtReturn.setReturnStatement(returnStatement);
        }
        return stmtReturn;
    }


    @Override
    public Object visitStmtVariable(ParserAng.StmtVariableContext ctx) {
        StmtVariable stmtVariable = new StmtVariable();
        VariableStatement variableStatement = (VariableStatement) visit(ctx.variableStatement());
        if (variableStatement != null) {
            stmtVariable.setVariableStatement(variableStatement);
        }
        return stmtVariable;
    }


    @Override
    public Object visitDefaultImportStatement(ParserAng.DefaultImportStatementContext ctx) {
        DefaultImportStatement imp = new DefaultImportStatement();

        for (TerminalNode idNode : ctx.IDENTIFIER()) {
            String importedName = idNode.getText();
            String fromPath = ctx.STRING_LITERAL().getText();

            boolean added = importSymbolTable.addImport(importedName, fromPath);

            if (!added) {
                int line = ctx.getStart().getLine();
                ImportErrorHandler.getInstance().log(line, "Duplicate import '" + importedName + "'");
                return null;
            }

            imp.addIdentifier(importedName);
        }

        String raw = ctx.STRING_LITERAL().getText();
        imp.setFromString(unquote(raw));

        return imp;
    }

    private static String unquote(String s) {
        if (s == null || s.length() < 2) return s;
        char first = s.charAt(0), last = s.charAt(s.length() - 1);
        if ((first == '"' && last == '"') || (first == '\'' && last == '\'')) {
            return s.substring(1, s.length() - 1);
        }
        return s;
    }

    @Override
    public Object visitExportDeclaration(ParserAng.ExportDeclarationContext ctx) {
        ASTNode decl = null;

        if (ctx.classDeclaration() != null) {
            decl = (ASTNode) visit(ctx.classDeclaration());
        } else if (ctx.interfaceDeclaration() != null) {
            decl = (ASTNode) visit(ctx.interfaceDeclaration());
        } else if (ctx.functionDeclaration() != null) {
            decl = (ASTNode) visit(ctx.functionDeclaration());
        } else if (ctx.methodDeclaration() != null) {
            decl = (ASTNode) visit(ctx.methodDeclaration());
        }

        return new ExportDeclaration(decl);
    }

    @Override
    public Object visitInterfaceDefinition(ParserAng.InterfaceDefinitionContext ctx) {
        String name = ctx.IDENTIFIER(0).getText();
        String superInterface = (ctx.EXTENDS() != null) ? ctx.IDENTIFIER(1).getText() : null;

        InterfaceDefinition interfaceDefinition = new InterfaceDefinition(name, superInterface, null);

        java.util.List<String> props = new java.util.ArrayList<>();
        for (ParserAng.InterfacePropertyContext pctx : ctx.interfaceProperty()) {
            if (pctx instanceof ParserAng.InterfacePropertyDefinitionContext) {
                ParserAng.InterfacePropertyDefinitionContext def =
                        (ParserAng.InterfacePropertyDefinitionContext) pctx;

                String propName = def.IDENTIFIER().getText();
                props.add(propName);

                InterfaceProperty ip = (InterfaceProperty) visit(def);
                if (ip != null) {
                    interfaceDefinition.setInterfaceProperty(ip);
                }
            }
        }

        String objectName = lcFirst(name);

        java.util.Set<String> all = new java.util.HashSet<>(props);
        if (superInterface != null) {
            String superObj = lcFirst(superInterface);
            java.util.Set<String> parent =
                    SymbolTable.ObjectPropertySymbolTable.getInstance().getProperties(superObj);
            if (parent != null) all.addAll(parent);
        }

        SymbolTable.ObjectPropertySymbolTable.getInstance().addObjectProperties(objectName, all);

        return interfaceDefinition;
    }

    private static String lcFirst(String s) {
        if (s == null || s.isEmpty()) return s;
        char c0 = Character.toLowerCase(s.charAt(0));
        return (s.length() == 1) ? String.valueOf(c0) : c0 + s.substring(1);
    }
    @Override
    public Object visitInterfacePropertyDefinition(ParserAng.InterfacePropertyDefinitionContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        TypeAnnotation type = (TypeAnnotation) visit(ctx.typeAnnotation());
        return new InterfacePropertyDefinition(name, type);
    }

    @Override
    public Object visitClassDefinition(ParserAng.ClassDefinitionContext ctx) {
        String name = ctx.IDENTIFIER(0).getText();

        String superClass = null;
        String interfaceName = null;

        if (ctx.EXTENDS() != null && ctx.IDENTIFIER().size() > 1) {
            superClass = ctx.IDENTIFIER(1).getText();
        }
        if (ctx.IMPLEMENTS() != null) {
            int index = (superClass != null) ? 2 : 1;
            if (ctx.IDENTIFIER().size() > index) {
                interfaceName = ctx.IDENTIFIER(index).getText();
            }
        }

        ClassDefinition node = new ClassDefinition(name, superClass, interfaceName);

        for (ParserAng.DecoratorContext dctx : ctx.decorator()) {
            node.addDecorator((Decorator) visit(dctx));
        }

        for (ParserAng.ClassMemberContext mctx : ctx.classMember()) {
            node.addMember((ClassMember) visit(mctx));
        }

        return node;
    }


    @Override
    public Object visitClassProperty(ParserAng.ClassPropertyContext ctx) {
        ClassProperty classProperty = new ClassProperty();

        List<Decorator> decorators = new ArrayList<>();
        for (ParserAng.DecoratorContext decoratorCtx : ctx.decorator()) {
            Decorator decorator = (Decorator) visit(decoratorCtx);
            if (decorator != null) {
                decorators.add(decorator);
            }
        }
        classProperty.setDecorators(decorators);

        PropertyDeclaration propertyDeclaration = (PropertyDeclaration) visit(ctx.propertyDeclaration());
        classProperty.setDeclaration(propertyDeclaration);

        if (propertyDeclaration != null && propertyDeclaration.getPropertyDefinition() != null) {
            PropertyDefinition def = propertyDeclaration.getPropertyDefinition();
            String objectName = def.getIdentifier();

            Expression expr = def.getExpression();
            if (expr != null && expr.primaryExpr != null) {
                PrimaryExpr primaryExpr = expr.primaryExpr;
                if (primaryExpr.primaryExpression != null && primaryExpr.primaryExpression.objectExpr != null) {
                    ObjectExpr objectExpr = primaryExpr.primaryExpression.objectExpr;
                    ObjectLiteral objectLiteral = objectExpr.getObjectLiteral();
                    if (objectLiteral instanceof ObjectLiteralDefinition) {
                        ObjectLiteralDefinition objDef = (ObjectLiteralDefinition) objectLiteral;
                        for (PropertyAssignment assignment : objDef.properties) {
                            if (assignment instanceof PropertyAssignmentDefinition) {
                                PropertyAssignmentDefinition pad = (PropertyAssignmentDefinition) assignment;
                                ObjectPropertySymbolTable.getInstance().addObjectProperty(objectName, pad.getKey());
                            }
                        }
                    }
                }
            }
        }

        return classProperty;
    }


    @Override
    public Object visitClassMethod(ParserAng.ClassMethodContext ctx) {
        ClassMethod classMethod = new ClassMethod();

        List<Decorator> decorators = new ArrayList<>();
        for (ParserAng.DecoratorContext decoratorCtx : ctx.decorator()) {
            Decorator decorator = (Decorator) visit(decoratorCtx);
            if (decorator != null) {
                decorators.add(decorator);
            }
        }
        classMethod.setDecorators(decorators);

        MethodDeclaration methodDeclaration = (MethodDeclaration) visit(ctx.methodDeclaration());
        if (methodDeclaration != null) {
            classMethod.setDeclaration(methodDeclaration);
        }

        return classMethod;
    }


    @Override
    public Object visitClassConstructor(ParserAng.ClassConstructorContext ctx) {
        ClassConstructor classConstructor = new ClassConstructor();
        
        List<Decorator> decorators = new ArrayList<>();
        for (ParserAng.DecoratorContext decoratorCtx : ctx.decorator()) {
            Decorator decorator = (Decorator) visit(decoratorCtx);
            if (decorator != null) {
                decorators.add(decorator);
            }
        }
        classConstructor.setDecorators(decorators);
        
        ConstructorDeclaration constructorDeclaration = (ConstructorDeclaration) visit(ctx.constructorDeclaration());
        if (constructorDeclaration != null) {
            classConstructor.setConstructor(constructorDeclaration);
        }
        
        return classConstructor;
    }

    @Override
    public Object visitAllparenExpr(ParserAng.AllparenExprContext ctx) {
        return new AllparenExpr();
    }

    @Override
    public Object visitConstructorDefinition2(ParserAng.ConstructorDefinition2Context ctx) {
        ConstructorDefinition2 constructor = new ConstructorDefinition2();

        List<Statement> stmts = new ArrayList<>();
        for (ParserAng.StatementContext stmtCtx : ctx.statement()) {
            Statement stmt = (Statement) visit(stmtCtx);
            if (stmt != null) {
                stmts.add(stmt);
            }
        }

        constructor.setStatements(stmts);
        return constructor;
    }


    @Override
    public Object visitFunctionDefinition(ParserAng.FunctionDefinitionContext ctx) {
        FunctionDefinition func = new FunctionDefinition();
        func.setFunctionType("function");
        func.setArrowFunction(false);

        if (ctx.PUBLIC() != null) func.setAccessModifier("public");
        else if (ctx.PRIVATE() != null) func.setAccessModifier("private");
        else if (ctx.PROTECTED() != null) func.setAccessModifier("protected");

        func.setIdentifier(ctx.IDENTIFIER().getText());

        if (ctx.parameterList() != null) {
            ParameterList paramList = (ParameterList) visit(ctx.parameterList());
            func.setParameterList(paramList);
        }

        if (ctx.typeAnnotation() != null) {
            TypeAnnotation typeAnn = (TypeAnnotation) visit(ctx.typeAnnotation());
            func.setTypeAnnotation(typeAnn);
        }

        List<Statement> stmts = new ArrayList<>();
        for (ParserAng.StatementContext stmtCtx : ctx.statement()) {
            Statement stmt = (Statement) visit(stmtCtx);
            stmts.add(stmt);
        }
        func.setBodyStatements(stmts);

        return func;
    }


    @Override
    public Object visitArrowFunctionDefinition(ParserAng.ArrowFunctionDefinitionContext ctx) {
        FunctionDefinition arrowFunc = new FunctionDefinition();
        arrowFunc.setArrowFunction(true);

        if (ctx.PUBLIC() != null) arrowFunc.setAccessModifier("public");
        else if (ctx.PRIVATE() != null) arrowFunc.setAccessModifier("private");
        else if (ctx.PROTECTED() != null) arrowFunc.setAccessModifier("protected");

        arrowFunc.setIdentifier(ctx.IDENTIFIER().getText());

        if (ctx.parameterList() != null) {
            ParameterList paramList = (ParameterList) visit(ctx.parameterList());
            arrowFunc.setParameterList(paramList);
        }

        if (ctx.typeAnnotation() != null) {
            TypeAnnotation typeAnn = (TypeAnnotation) visit(ctx.typeAnnotation());
            arrowFunc.setTypeAnnotation(typeAnn);
        }

        if (!ctx.statement().isEmpty()) {
            List<Statement> stmts = new ArrayList<>();
            for (ParserAng.StatementContext stmtCtx : ctx.statement()) {
                Statement stmt = (Statement) visit(stmtCtx);
                stmts.add(stmt);
            }
            arrowFunc.setBodyStatements(stmts);
        } else if (ctx.expression() != null) {
            Expression expr = (Expression) visit(ctx.expression());
            arrowFunc.setExpressionBody(expr);
        }

        return arrowFunc;
    }



    @Override
    public Object visitDecoratorObjectArgument(ParserAng.DecoratorObjectArgumentContext ctx) {
        DecoratorObjectArgument arg = new DecoratorObjectArgument();
        ObjectLiteral objectLiteral = (ObjectLiteral) visit(ctx.objectLiteral());
        if (objectLiteral != null) {
            arg.setObjectLiteral(objectLiteral);
        }
        return arg;
    }

    @Override
    public Object visitDecoratorExpressionArgument(ParserAng.DecoratorExpressionArgumentContext ctx) {
        DecoratorExpressionArgument arg = new DecoratorExpressionArgument();
        Expression expression = (Expression) visit(ctx.expression());
        if (expression != null) {
            arg.setExpression(expression);
        }
        return arg;
    }

    @Override
    public Object visitComponentDefinition(ParserAng.ComponentDefinitionContext ctx) {
        ComponentPropertySymbolTable.getInstance().reset();
        ComponentDefinition componentDefinition = new ComponentDefinition();
        ComponentMetadata metadata = (ComponentMetadata) visit(ctx.componentMetadata());
        if (metadata != null) {
            componentDefinition.setComponentMetadata(metadata);
        }
        return componentDefinition;
    }


    @Override
    public Object visitComponentMetadataContent(ParserAng.ComponentMetadataContentContext ctx) {
        ComponentMetadataContent metadataContent = new ComponentMetadataContent();

        Set<String> allowedDuplicates = new HashSet<>();
        allowedDuplicates.add("Expression");

        for (ParserAng.ComponentPropertyContext propertyCtx : ctx.componentProperty()) {
            ComponentProperty property = (ComponentProperty) visit(propertyCtx);
            if (property != null) {
                String propName = property.getKey();

                if (!allowedDuplicates.contains(propName)) {
                    if (!ComponentPropertySymbolTable.getInstance().addProperty(propName)) {
                        int line = ctx.getStart().getLine();
                        ComponentErrorHandler.getInstance()
                                .log(line, "Property '" + propName + "' is repeated.");
                    }
                }

                metadataContent.setComponentProperties(property);
            }
        }

        return metadataContent;
    }

    @Override
    public Object visitComponentSelector(ParserAng.ComponentSelectorContext ctx) {
        ComponentSelector componentSelector = new ComponentSelector();
        SelectorProperty selectorProperty = (SelectorProperty) visit(ctx.selectorProperty());
        if (selectorProperty != null) {
            componentSelector.setSelectorProperty(selectorProperty);
        }
        return componentSelector;
    }

    @Override
    public Object visitComponentTemplate(ParserAng.ComponentTemplateContext ctx) {
        ComponentTemplate componentTemplate = new ComponentTemplate();
        TemplateProperty templateProperty = (TemplateProperty) visit(ctx.templateProperty());
        if (templateProperty != null) {
            componentTemplate.setTemplateProperty(templateProperty);
        }
        return componentTemplate;
    }

    @Override
    public Object visitComponentStyle(ParserAng.ComponentStyleContext ctx) {
        StyleProperty prop = (StyleProperty) visit(ctx.styleProperty());
        return new ComponentStyle(prop);
    }

    @Override
    public Object visitEx(ParserAng.ExContext ctx) {
        Expression expr = (Expression) visit(ctx.expression());
        return new Ex(expr);
    }

    @Override
    public Object visitSelectorDefinition(ParserAng.SelectorDefinitionContext ctx) {
        String selectorValue = ctx.STRING_LITERAL().getText();
        // Remove quotes from the string literal
        selectorValue = selectorValue.substring(1, selectorValue.length() - 1);
        return new SelectorDefinition(selectorValue);
    }

    @Override
    public Object visitTemplateDefinition(ParserAng.TemplateDefinitionContext ctx) {
        TemplateDefinition node = new TemplateDefinition();
        TemplateString ts = (TemplateString) visit(ctx.templateString());
        if (ts != null) node.setTemplateString(ts);
        return node;
    }

    @Override
    public Object visitStyleUrlsDefinition(ParserAng.StyleUrlsDefinitionContext ctx) {
        StyleUrlsDefinition node = new StyleUrlsDefinition();
        for (TerminalNode t : ctx.STRING_LITERAL()) {
            String url = t.getText();
            url = url.substring(1, url.length() - 1);
            node.addUrl(url);
        }
        return node;
    }

    @Override
    public Object visitStyleUrlsDefinition2(ParserAng.StyleUrlsDefinition2Context ctx) {
        StyleUrlsDefinition2 node = new StyleUrlsDefinition2();
        for (ParserAng.StyleContentContext c : ctx.styleContent()) {
            StyleContent content = (StyleContent) visit(c);
            node.addContent(content);
        }
        return node;
    }

    @Override
    public Object visitStyleContentDefinition(ParserAng.StyleContentDefinitionContext ctx) {
        StringBuilder selector = new StringBuilder();
        selector.append(ctx.IDENTIFIER(0).getText())
                .append("-")
                .append(ctx.IDENTIFIER(1).getText());

        for (int i = 2; i < ctx.IDENTIFIER().size(); i++) {
            selector.append(ctx.IDENTIFIER(i).getText());
        }

        StyleContentDefinition node = new StyleContentDefinition(selector.toString());

        for (ParserAng.ExpressionStatementContext sctx : ctx.expressionStatement()) {
            ExpressionStatement stmt = (ExpressionStatement) visit(sctx);
            node.addStatement(stmt);
        }

        return node;
    }


    private String currentObjectName = null;

    @Override
    public Object visitPropertyDefinition(ParserAng.PropertyDefinitionContext ctx) {
        PropertyDefinition property = new PropertyDefinition();

        if (ctx.PUBLIC() != null) property.setAccessModifier("public");
        else if (ctx.PRIVATE() != null) property.setAccessModifier("private");
        else if (ctx.PROTECTED() != null) property.setAccessModifier("protected");

        String objectName = ctx.IDENTIFIER().getText();
        property.setIdentifier(objectName);

        if (ctx.typeAnnotation() != null) {
            property.setTypeAnnotation((TypeAnnotation) visit(ctx.typeAnnotation()));
        }

        if (ctx.expression() != null) {
            currentObjectName = objectName;

            Expression expr = (Expression) visit(ctx.expression());
            property.setExpression(expr);

        }

        return property;
    }



    @Override
    public Object visitMethodDefinition(ParserAng.MethodDefinitionContext ctx) {
        MethodDefinition method = new MethodDefinition();

        if (ctx.PUBLIC() != null) method.setAccessModifier("public");
        else if (ctx.PRIVATE() != null) method.setAccessModifier("private");
        else if (ctx.PROTECTED() != null) method.setAccessModifier("protected");

        method.setIdentifier(ctx.IDENTIFIER().getText());

        ClickMethodSymbolTable.getInstance().addComponentMethod(ctx.IDENTIFIER().getText());

        List<ParameterList> params = new ArrayList<>();
        if (ctx.parameterList() != null) {
            ParameterList paramList = (ParameterList) visit(ctx.parameterList());
            params.add(paramList);
        }
        method.setParameterList(params);

        if (ctx.typeAnnotation() != null) {
            method.setTypeAnnotation((TypeAnnotation) visit(ctx.typeAnnotation()));
        }

        List<Statement> stmts = new ArrayList<>();
        for (ParserAng.StatementContext stmtCtx : ctx.statement()) {
            Statement stmt = (Statement) visit(stmtCtx);
            if (stmt != null) stmts.add(stmt);
        }
        method.setStatements(stmts);

        return method;
    }


    @Override
    public Object visitConstructorDefinition(ParserAng.ConstructorDefinitionContext ctx) {
        ConstructorDefinition constructor = new ConstructorDefinition();

        List<ParameterList> params = new ArrayList<>();
        if (ctx.parameterList() != null) {
            ParameterList paramList = (ParameterList) visit(ctx.parameterList());
            params.add(paramList);
        }
        constructor.setParameterList(params);

        List<Statement> stmts = new ArrayList<>();
        for (ParserAng.StatementContext stmtCtx : ctx.statement()) {
            Statement stmt = (Statement) visit(stmtCtx);
            if (stmt != null) stmts.add(stmt);
        }
        constructor.setStatements(stmts);

        return constructor;
    }


    @Override
    public Object visitTemplateStringDefinition(ParserAng.TemplateStringDefinitionContext ctx) {
        TemplateStringDefinition node = new TemplateStringDefinition();

        if (ctx.templateContent() != null) {
            TemplateContent tc = (TemplateContent) visit(ctx.templateContent());
            if (tc != null) node.setTemplateContents(tc);
        }
        if (ctx.htmlTemplate() != null) {
            HtmlTemplate ht = (HtmlTemplate) visit(ctx.htmlTemplate());
            if (ht != null) node.setHtmlTemplates(ht);
        }
        return node;
    }

    @Override
    public Object visitMultiplicativeExpr(ParserAng.MultiplicativeExprContext ctx) {
        Expression left = (Expression) visit(ctx.expression(0));
        Expression right = (Expression) visit(ctx.expression(1));
        String operator = ctx.getChild(1).getText();
        return new MultiplicativeExpr(left, operator, right);
    }


    @Override
    public Object visitColonExpr(ParserAng.ColonExprContext ctx) {
        Expression left = (Expression) visit(ctx.expression(0));
        Expression right = (Expression) visit(ctx.expression(1));
        return new ColonExpr(left, right);
    }


    @Override
    public Object visitFunctionExpr(ParserAng.FunctionExprContext ctx) {
        Expression callee = (Expression) visit(ctx.expression(0));
        Expression arg = (Expression) visit(ctx.expression(1));
        Expression body = (Expression) visit(ctx.expression(2));
        return new FunctionExpr(callee, arg, body);
    }

    @Override
    public Object visitArrowExpr(ParserAng.ArrowExprContext ctx) {
        ArrowFunction arrowFunction = (ArrowFunction) visit(ctx.arrowFunction());
        return new ArrowExpr(arrowFunction);
    }

    @Override
    public Object visitOnExpr(ParserAng.OnExprContext ctx) {
        OnExpression onExpression = (OnExpression) visit(ctx.onExpression());
        return new OnExpr(onExpression);
    }

    @Override
    public Object visitOnCall(ParserAng.OnCallContext ctx) {
        String actionName = ctx.IDENTIFIER().getText();
        ArrowFunction handler = (ArrowFunction) visit(ctx.arrowFunction());
        return new OnCall(actionName, handler);
    }

    @Override
    public Object visitArrowFunctionDefinition2(ParserAng.ArrowFunctionDefinition2Context ctx) {
        List<ArrowParam> params = new ArrayList<>();
        if (ctx.arrowParams() != null) {
            if (ctx.arrowParams() instanceof ParserAng.ArrowParamListContext) {
                ParserAng.ArrowParamListContext paramsCtx = (ParserAng.ArrowParamListContext) ctx.arrowParams();
                for (ParserAng.ArrowParamContext paramCtx : paramsCtx.arrowParam()) {
                    ArrowParam paramNode = (ArrowParam) visit(paramCtx);
                    params.add(paramNode);
                }
            }
        }
        ArrowBody body = null;
        if (ctx.arrowBody() != null) {
            body = (ArrowBody) visit(ctx.arrowBody());
        }

        return new ArrowFunctionDefinition2(params, body);
    }

    @Override
    public Object visitArrowParamList(ParserAng.ArrowParamListContext ctx) {
        List<ArrowParam> params = new ArrayList<>();
        for (ParserAng.ArrowParamContext p : ctx.arrowParam()) {
            params.add((ArrowParam) visit(p));
        }
        return params;
    }

    @Override
    public Object visitArrowIdentifierParam(ParserAng.ArrowIdentifierParamContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        TypeAnnotation type = null;
        if (ctx.typeAnnotation() != null) {
            type = (TypeAnnotation) visit(ctx.typeAnnotation());
        }
        return new ArrowIdentifierParam(name, type);
    }

    @Override
    public Object visitArrowDestructuredParam(ParserAng.ArrowDestructuredParamContext ctx) {
        DestructuredObjectDefinition objDef = (DestructuredObjectDefinition) visit(ctx.destructuredObject());
        return new ArrowDestructuredParam(objDef.getProperties());
    }

    @Override
    public Object visitDestructuredObjectDefinition(ParserAng.DestructuredObjectDefinitionContext ctx) {
        DestructuredObjectDefinition obj = new DestructuredObjectDefinition();
        for (ParserAng.DestructuredPropertyContext p : ctx.destructuredProperty()) {
            DestructuredProperty prop = (DestructuredProperty) visit(p);
            obj.addProperty(prop);
        }
        return obj;
    }

    @Override
    public Object visitDestructuredPropertyDefinition(ParserAng.DestructuredPropertyDefinitionContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        TypeAnnotation type = null;
        if (ctx.typeAnnotation() != null) {
            type = (TypeAnnotation) visit(ctx.typeAnnotation());
        }
        return new DestructuredPropertyDefinition(name, type);
    }

    @Override
    public Object visitArrowObjectBody(ParserAng.ArrowObjectBodyContext ctx) {
        ObjectLiteral obj = (ObjectLiteral) visit(ctx.objectLiteral());
        return new ArrowObjectBody(obj);
    }

    @Override
    public Object visitArrowParenObjectBody(ParserAng.ArrowParenObjectBodyContext ctx) {
        ObjectLiteral obj = (ObjectLiteral) visit(ctx.objectLiteral());
        return new ArrowParenObjectBody(obj);
    }

    @Override
    public Object visitArrowExpressionBody(ParserAng.ArrowExpressionBodyContext ctx) {
        Expression expr = (Expression) visit(ctx.expression());
        return new ArrowExpressionBody(expr);
    }

    @Override
    public Object visitSpreadProperty(ParserAng.SpreadPropertyContext ctx) {
        String id = ctx.IDENTIFIER().getText();
        return new SpreadProperty(id);
    }
    @Override
    public Object visitAssignArrayExpr(ParserAng.AssignArrayExprContext ctx) {
        Expression target = (Expression) visit(ctx.expression(0));
        String identifier = ctx.IDENTIFIER().getText();
        Expression value = (Expression) visit(ctx.expression(1));
        return new AssignArrayExpr(target, identifier, value);
    }

    @Override
    public Object visitAdditiveExpr(ParserAng.AdditiveExprContext ctx) {
        Expression left = (Expression) visit(ctx.expression(0));
        Expression right = (Expression) visit(ctx.expression(1));
        String operator = ctx.getChild(1).getText();
        return new AdditiveExpr(left, operator, right);
    }


    @Override
    public Object visitComparisonExpr(ParserAng.ComparisonExprContext ctx) {
        Expression left  = (Expression) visit(ctx.expression(0));
        Expression right = (Expression) visit(ctx.expression(1));

        String op;
        if (ctx.EQUALS() != null)            op = ctx.EQUALS().getText();            // "=="
        else if (ctx.NOT_EQUALS() != null)   op = ctx.NOT_EQUALS().getText();        // "!="
        else if (ctx.STRICT_EQUALS() != null)      op = ctx.STRICT_EQUALS().getText();      // "==="
        else if (ctx.STRICT_NOT_EQUALS() != null)  op = ctx.STRICT_NOT_EQUALS().getText();  // "!=="
        else if (ctx.LESS_THAN() != null)    op = ctx.LESS_THAN().getText();         // "<"
        else if (ctx.GREATER_THAN() != null) op = ctx.GREATER_THAN().getText();      // ">"
        else op = ctx.getChild(1).getText();

        return new ComparisonExpr(left, op, right);
    }

    @Override
    public Object visitPrimaryExpr(ParserAng.PrimaryExprContext ctx) {
        PrimaryExpression pe = (PrimaryExpression) visit(ctx.primaryExpression());
        return new PrimaryExpr(pe);
    }

    @Override
    public Object visitCallExpr(ParserAng.CallExprContext ctx) {
        Expression callee = (Expression) visit(ctx.expression());

        List<Expression> args = new ArrayList<>();

        if (ctx.argumentList() != null) {
            ArgumentListDefinition argList = (ArgumentListDefinition) visit(ctx.argumentList());
            args.addAll(argList.getExpressions());
        }

        TypeArguments typeArgs = null;
        if (ctx.typeArguments() != null) {
            typeArgs = (TypeArguments) visit(ctx.typeArguments());
        }

        return new CallExpr(callee, args, typeArgs);
    }


    @Override
    public Object visitAssignmentExpr(ParserAng.AssignmentExprContext ctx) {
        Expression left  = (Expression) visit(ctx.expression(0));
        Expression right = (Expression) visit(ctx.expression(1));
        return new AstClasses.AssignmentExpr(left, right);
    }


    @Override
    public Object visitDotExpr(ParserAng.DotExprContext ctx) {
        Expression target = (Expression) visit(ctx.expression());
        String property = ctx.IDENTIFIER().getText();

        boolean optionalBefore = false;
        boolean optionalAfter  = false;
        boolean callAfter      = !ctx.ALLPAREN().isEmpty();

        int idIndex = -1;
        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree ch = ctx.getChild(i);
            if (ch instanceof TerminalNode) {
                Token t = ((TerminalNode) ch).getSymbol();
                if (t.getType() == ParserAng.IDENTIFIER) { idIndex = i; break; }
            }
        }


        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree ch = ctx.getChild(i);
            if (ch instanceof TerminalNode) {
                Token t = ((TerminalNode) ch).getSymbol();
                int type = t.getType();
                if (type == ParserAng.OPTIONAL_CHAIN) {
                    if (idIndex == -1 || i < idIndex) optionalBefore = true;
                    else optionalAfter = true;
                }
            }
        }

        return new DotExpr(target, property, optionalBefore, optionalAfter, callAfter);
    }


    @Override
    public Object visitLogicalExpr(ParserAng.LogicalExprContext ctx) {
        Expression left  = (Expression) visit(ctx.expression(0));
        Expression right = (Expression) visit(ctx.expression(1));

        String op;
        if (ctx.AND() != null)      op = "&&";
        else if (ctx.OR() != null)  op = "||";
        else                        op = "&&";

        return new AstClasses.LogicalExpr(left, op, right);
    }

    @Override
    public Object visitIndexExpr(ParserAng.IndexExprContext ctx) {
        Expression array = (Expression) visit(ctx.expression(0));
        Expression index = (Expression) visit(ctx.expression(1));
        return new IndexExpr(array, index);
    }


    @Override
    public Object visitIdentifierExpr(ParserAng.IdentifierExprContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        int optionalCount = ctx.OPTIONAL_CHAIN().size();
        return new IdentifierExpr(name, optionalCount);
    }


    @Override
    public Object visitLiteralExpr(ParserAng.LiteralExprContext ctx) {
        LiteralExpr literalExpr = new LiteralExpr();
        Literal literal = (Literal) visit(ctx.literal());
        if (literal != null) {
            literalExpr.setLiteral(literal);
        }
        return literalExpr;
    }

    @Override
    public Object visitArrayExpr(ParserAng.ArrayExprContext ctx) {
        return visit(ctx.arrayLiteral());
    }

    @Override
    public Object visitObjectExpr(ParserAng.ObjectExprContext ctx) {
        ObjectExpr objectExpr = new ObjectExpr();
        ObjectLiteral objectLiteral = (ObjectLiteral) visit(ctx.objectLiteral());
        if (objectLiteral != null) {
            objectExpr.setObjectLiteral(objectLiteral);
        }
        return objectExpr;
    }


    @Override
    public Object visitTemplateExpr(ParserAng.TemplateExprContext ctx) {
        TemplateExpr templateExpr = new TemplateExpr();
        
        if (ctx.templateString() != null) {
            TemplateString templateString = (TemplateString) visit(ctx.templateString());
            if (templateString != null) {
                templateExpr.setTemplateString(templateString);
            }
        }
        
        return templateExpr;
    }

    @Override
    public Object visitParenExpr(ParserAng.ParenExprContext ctx) {
        boolean hasArrow = (ctx.ARROW() != null);
        ParenExpr node = new ParenExpr(hasArrow);

        if (!ctx.expression().isEmpty()) {
            // أول واحد
            Expression first = (Expression) visit(ctx.expression(0));
            node.addExpression(first, false);
        }

        int exprIndexFromCtx = 1;
        int i = 0;
        while (exprIndexFromCtx < ctx.expression().size()) {
            Expression e = (Expression) visit(ctx.expression(exprIndexFromCtx));
            boolean hasSemi = false;
            node.addExpression(e, hasSemi);
            exprIndexFromCtx++;
            i++;
        }

        node.setSemiBeforeRparen(ctx.RPAREN() != null && ctx.SEMICOLON().size() > 0
                && ctx.getText().contains(");") == false );

        node.setSemiAfterRparen(ctx.getText().trim().endsWith(";"));

        return node;
    }

    @Override
    public Object visitPareceExpr(ParserAng.PareceExprContext ctx) {
        boolean hasArrow = ctx.ARROW() != null;
        PareceExpr node = new PareceExpr(hasArrow);

        java.util.List<org.antlr.v4.runtime.tree.ParseTree> kids = ctx.children;
        for (int i = 0; i < kids.size(); i++) {
            org.antlr.v4.runtime.tree.ParseTree ch = kids.get(i);
            if (ch instanceof ParserAng.ExpressionContext) {
                Expression e = (Expression) visit(ch);
                boolean hasSemi = false;
                if (i + 1 < kids.size()
                        && kids.get(i + 1) instanceof org.antlr.v4.runtime.tree.TerminalNode
                        && ((org.antlr.v4.runtime.tree.TerminalNode) kids.get(i + 1))
                        .getSymbol().getType() == ParserAng.SEMICOLON) {
                    hasSemi = true;
                }
                node.addExpression(e, hasSemi);
            }
        }
        return node;
    }

    @Override
    public Object visitStringLiterial1(ParserAng.StringLiterial1Context ctx) {
        int count = ctx.OPTIONAL_CHAIN().size();

        String raw = ctx.STRING_LITERAL().getText();

        if (raw.length() >= 2 && (raw.startsWith("\"") || raw.startsWith("'"))) {
            raw = raw.substring(1, raw.length() - 1);
        }

        return new StringLiterial1(raw, count);
    }

    @Override
    public Object visitPropExpr(ParserAng.PropExprContext ctx) {
        PropertyAssignment prop = (PropertyAssignment) visit(ctx.propertyAssignment());
        return new PropExpr(prop);
    }

    @Override
    public Object visitIdentifierExpr2(ParserAng.IdentifierExpr2Context ctx) {
        String name = ctx.IDENTIFIER().getText();

        String raw = ctx.HTML_TAG_OPEN().getText();
        String firstArg = raw;
        if (firstArg.startsWith("<")) firstArg = firstArg.substring(1);
        if (firstArg.endsWith(">"))   firstArg = firstArg.substring(0, firstArg.length() - 1);

        String secondArg = null;
        if (ctx.STRING_LITERAL() != null) {
            secondArg = ctx.STRING_LITERAL().getText();
        }

        IdentifierExpr2 node = new IdentifierExpr2(name, firstArg);
        if (secondArg != null) node.setSecondArg(secondArg);
        return node;
    }
    @Override
    public Object visitConstExpr(ParserAng.ConstExprContext ctx) {
        Expression expr = (Expression) visit(ctx.expression());
        return new ConstExpr(expr);
    }

    @Override
    public Object visitSimpleType(ParserAng.SimpleTypeContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        return new SimpleType(name);
    }

    @Override
    public Object visitArrayType(ParserAng.ArrayTypeContext ctx) {
        String base = ctx.IDENTIFIER().getText();
        return new ArrayType(base);
    }

    @Override
    public Object visitRoundType(ParserAng.RoundTypeContext ctx) {
        String t = ctx.IDENTIFIER().getText();
        return new RoundType(t, true);
    }

    @Override
    public Object visitTypeArguments(ParserAng.TypeArgumentsContext ctx) {
        TypeArguments typeArgs = new TypeArguments();
        for (ParserAng.TypeAnnotationContext taCtx : ctx.typeAnnotation()) {
            TypeAnnotation ta = (TypeAnnotation) visit(taCtx);
            typeArgs.addTypeAnnotation(ta);
        }
        return typeArgs;
    }

    @Override
    public Object visitRoundType2(ParserAng.RoundType2Context ctx) {
        String typeName = ctx.IDENTIFIER().getText();
        boolean nullable = ctx.NULL() != null;
        return new RoundType2(typeName, nullable);
    }

    @Override
    public Object visitVariableStatementDefinition2(ParserAng.VariableStatementDefinition2Context ctx) {
        String kind = ctx.VAR() != null ? "var" : ctx.LET() != null ? "let" : "const";
        String name = ctx.IDENTIFIER().getText();

        TypeAnnotation type = null;
        if (ctx.typeAnnotation() != null) {
            type = (TypeAnnotation) visit(ctx.typeAnnotation());
        }

        VariableStatementDefinition2 stmt = new VariableStatementDefinition2(kind, name, type);

        stmt.addExpression((Expression) visit(ctx.expression(0)));

        for (int i = 1; i < ctx.expression().size(); i++) {
            stmt.addExpression((Expression) visit(ctx.expression(i)));
        }

        return stmt;
    }

    @Override
    public Object visitNull(ParserAng.NullContext ctx) {
        return new Null();
    }


    @Override
    public Object visitStringLiteral(ParserAng.StringLiteralContext ctx) {
        String raw = ctx.STRING_LITERAL().getText();
        if (raw == null || raw.length() < 2) {
            return new StringLiteral(raw != null ? raw : "", '"');
        }
        char qc = raw.charAt(0);
        String val = raw.substring(1, raw.length() - 1);
        return new StringLiteral(val, qc);
    }

    @Override
    public Object visitNo(ParserAng.NoContext ctx) {
        String id = ctx.IDENTIFIER().getText();
        return new No(id);
    }

    @Override
    public Object visitNumberLiteral(ParserAng.NumberLiteralContext ctx) {
        return new NumberLiteral(ctx.DECIMAL_LITERAL().getText());
    }

    @Override
    public Object visitBooleanLiteral(ParserAng.BooleanLiteralContext ctx) {
        String text = ctx.BOOLEAN_LITERAL().getText();
        return new BooleanLiteral(Boolean.parseBoolean(text));
    }

    @Override
    public Object visitNullLiteral(ParserAng.NullLiteralContext ctx) {
        return new NullLiteral();
    }

    @Override
    public Object visitNavegateLiteral(ParserAng.NavegateLiteralContext ctx) {
        Literal lit = (Literal) visit(ctx.literal());
        return new NavegateLiteral(lit);
    }

    @Override
    public Object visitArrayLiteralDefinition(ParserAng.ArrayLiteralDefinitionContext ctx) {
        ArrayLiteralDefinition arrayLiteral = new ArrayLiteralDefinition();

        if (ctx.argumentList() != null) {
            ArgumentList argList = (ArgumentList) visit(ctx.argumentList());
            arrayLiteral.addExpression(argList);
        }

        return arrayLiteral;
    }


    @Override
    public Object visitObjectLiteralDefinition(ParserAng.ObjectLiteralDefinitionContext ctx) {
        ObjectLiteralDefinition objectLiteral = new ObjectLiteralDefinition();

        for (ParserAng.PropertyAssignmentContext propCtx : ctx.propertyAssignment()) {
            PropertyAssignment property = (PropertyAssignment) visit(propCtx);

            if (property != null) {
                objectLiteral.addProperty(property);

                PropertyAssignmentDefinition def = property.getPropertyAssignmentDefinition();
                if (def != null && currentObjectName != null) {
                    String key = def.getKey();
                    ObjectPropertySymbolTable.getInstance().addObjectProperty(currentObjectName, key);
                }
            }
        }

        return objectLiteral;
    }

    @Override
    public Object visitPropertyAssignmentDefinition(ParserAng.PropertyAssignmentDefinitionContext ctx) {
        String key = ctx.IDENTIFIER().getText();
        Expression value = (Expression) visit(ctx.expression());
        PropertyAssignmentDefinition def = new PropertyAssignmentDefinition(key, value);

        PropertyAssignment wrapper = new PropertyAssignment();
        wrapper.setPropertyAssignmentDefinition(def);

        return wrapper;
    }


    @Override
    public Object visitShorthandPropertyAssignment(ParserAng.ShorthandPropertyAssignmentContext ctx) {
        String key = ctx.IDENTIFIER().getText();
        return new ShorthandPropertyAssignment(key);
    }

    @Override
    public Object visitExpressionStatementDefinition(ParserAng.ExpressionStatementDefinitionContext ctx) {
        ExpressionStatementDefinition node = new ExpressionStatementDefinition();
        node.setExpression((Expression) visit(ctx.expression()));

        String raw = ctx.getText();
        boolean endsWithSemi = raw != null && raw.endsWith(";");
        node.setHasSemicolon(endsWithSemi);

        return node;
    }

    @Override
    public Object visitIfStatementDefinition(ParserAng.IfStatementDefinitionContext ctx) {
        Expression condition = (Expression) visit(ctx.expression());
        Statement thenBranch = (Statement) visit(ctx.statement(0));
        Statement elseBranch = null;

        if (ctx.ELSE() != null && ctx.statement().size() > 1) {
            elseBranch = (Statement) visit(ctx.statement(1));
        }

        return new IfStatementDefinition(condition, thenBranch, elseBranch);
    }

    @Override
    public Object visitForVariableInitializer(ParserAng.ForVariableInitializerContext ctx) {
        ForVariableInitializer initializer = new ForVariableInitializer();

        VariableDeclaration varDecl = (VariableDeclaration) visit(ctx.variableDeclaration());
        initializer.addVariableDeclarations(varDecl);

        return initializer;
    }


    @Override
    public Object visitForExpressionInitializer(ParserAng.ForExpressionInitializerContext ctx) {
        ForExpressionInitializer initializer = new ForExpressionInitializer();

        Expression expr = (Expression) visit(ctx.expression());
        initializer.addExpression(expr);

        return initializer;
    }



    @Override
    public Object visitReturnStatementDefinition(ParserAng.ReturnStatementDefinitionContext ctx) {
        Expression returnValue = null;

        if (ctx.expression() != null) {
            returnValue = (Expression) visit(ctx.expression());
        }

        return new ReturnStatementDefinition(returnValue);
    }


    @Override
    public Object visitVariableDeclarationDefinition(ParserAng.VariableDeclarationDefinitionContext ctx) {
        String identifier = ctx.IDENTIFIER().getText();

        TypeAnnotation typeAnnotation = null;
        if (ctx.typeAnnotation() != null) {
            typeAnnotation = (TypeAnnotation) visit(ctx.typeAnnotation());
        }

        Expression expression = null;
        if (ctx.expression() != null) {
            expression = (Expression) visit(ctx.expression());
        }

        return new VariableDeclarationDefinition(identifier, typeAnnotation, expression);
    }


    @Override
    public Object visitParameterListDefinition(ParserAng.ParameterListDefinitionContext ctx) {
        ParameterListDefinition list = new ParameterListDefinition();

        java.util.List<ParserAng.ParameterContext> params = ctx.parameter();
        for (ParserAng.ParameterContext pctx : params) {
            Parameter p = (Parameter) visit(pctx);
            if (p != null) list.addParameter(p);
        }
        return list;
    }


    @Override
    public Object visitParameterDefinition(ParserAng.ParameterDefinitionContext ctx) {
        ParameterDefinition param = new ParameterDefinition();
        param.setIdentifier(ctx.IDENTIFIER().getText());

        if (ctx.typeAnnotation() != null) {
            TypeAnnotation ta = (TypeAnnotation) visit(ctx.typeAnnotation());
            param.setTypeAnnotation(ta);
        }
        return param;
    }


    @Override
    public Object visitArgumentListDefinition(ParserAng.ArgumentListDefinitionContext ctx) {
        ArgumentListDefinition argList = new ArgumentListDefinition();

        for (ParserAng.ExpressionContext exprCtx : ctx.expression()) {
            Expression expr = (Expression) visit(exprCtx);
            if (expr != null) {
                argList.addExpression(expr);
            }
        }

        return argList;
    }


    @Override
    public Object visitComplexType(ParserAng.ComplexTypeContext ctx) {
        // complexType -> objectType
        return visit(ctx.objectType());
    }

    @Override
    public Object visitObjectTypeDefinition(ParserAng.ObjectTypeDefinitionContext ctx) {
        ObjectTypeDefinition node = new ObjectTypeDefinition();
        for (ParserAng.ObjectTypeMemberContext mctx : ctx.objectTypeMember()) {
            ObjectTypeMemberDefinition m = (ObjectTypeMemberDefinition) visit(mctx);
            node.addMember(m);
        }
        return node;
    }

    @Override
    public Object visitObjectTypeMemberDefinition(ParserAng.ObjectTypeMemberDefinitionContext ctx) {
        String key = ctx.IDENTIFIER().getText();
        TypeAnnotation type = (TypeAnnotation) visit(ctx.typeAnnotation());
        return new ObjectTypeMemberDefinition(key, type);
    }

    @Override
    public Object visitDirectiveNgFor(ParserAng.DirectiveNgForContext ctx) {
        DirectiveNgFor node = new DirectiveNgFor();
        NgDirective inner = (NgDirective) visit(ctx.ngForDirective());
        node.addDef(inner);
        return node;
    }

    @Override
    public Object visitDirectiveNgIf(ParserAng.DirectiveNgIfContext ctx) {
        DirectiveNgIf d = new DirectiveNgIf();
        NgDirective inner = (NgDirective) visit(ctx.ngIfDirective());
        d.add(inner);
        return d;
    }

    @Override
    public Object visitDirectiveNgSwitch(ParserAng.DirectiveNgSwitchContext ctx) {
        return visit(ctx.ngSwitchDirective());
    }

    @Override
    public Object visitDirectiveNgClass(ParserAng.DirectiveNgClassContext ctx) {
        return visit(ctx.ngClassDirective());
    }

    @Override
    public Object visitDirectiveNgStyle(ParserAng.DirectiveNgStyleContext ctx) {
        NgDirective ngDirective = new NgDirective();
        DirectiveNgStyle directiveNgStyle = new DirectiveNgStyle();
        
        NgStyleDirective ngStyleDirective = (NgStyleDirective) visit(ctx.ngStyleDirective());
        if (ngStyleDirective != null) {
            directiveNgStyle.setHtmlElements(ngStyleDirective);
            ngDirective.setDirectiveNgStyle(directiveNgStyle);
        }
        
        return ngDirective;
    }

    @Override
    public Object visitDirectiveNgModel(ParserAng.DirectiveNgModelContext ctx) {
        return visit(ctx.ngModelDirective());
    }

    @Override
    public Object visitNgForDirectiveDefinition1(ParserAng.NgForDirectiveDefinition1Context ctx) {
        String loopVariable = ctx.IDENTIFIER().getText();
        Expression iterable = (Expression) visit(ctx.expression());

        NgForDirectiveDefinition1 definition = new NgForDirectiveDefinition1(loopVariable, iterable);
        definition.setExpressions(iterable);

        NgForDirective ngForDirective = new NgForDirective();
        ngForDirective.setNgForDirectiveDefinition1(definition);
        return ngForDirective;
    }

    @Override
    public Object visitNgForDirectiveDefinition2(ParserAng.NgForDirectiveDefinition2Context ctx) {
        String raw = ctx.STRING_LITERAL().getText();
        if (raw.length() >= 2 && (raw.startsWith("\"") || raw.startsWith("'"))) {
            raw = raw.substring(1, raw.length() - 1);
        }
        return new NgForDirectiveDefinition2(raw);
    }

    @Override
    public Object visitNgIfDirectiveDefinition(ParserAng.NgIfDirectiveDefinitionContext ctx) {
        Expression cond = (Expression) visit(ctx.expression());
        return new NgIfDirectiveDefinition(cond);
    }

    @Override
    public Object visitNgSwitchDirectiveDefinition(ParserAng.NgSwitchDirectiveDefinitionContext ctx) {
        Expression switchExpression = (Expression) visit(ctx.expression());
        return switchExpression;
    }

    @Override
    public Object visitNgClassDirectiveDefinition(ParserAng.NgClassDirectiveDefinitionContext ctx) {
        Expression classExpression = (Expression) visit(ctx.expression());
        return classExpression;
    }

    @Override
    public Object visitNgStyleDirectiveDefinition(ParserAng.NgStyleDirectiveDefinitionContext ctx) {
        NgStyleDirective ngStyleDirective = new NgStyleDirective();
        NgStyleDirectiveDefinition definition = new NgStyleDirectiveDefinition();
        
        if (ctx.NG_STYLE() != null) {
            definition.setDirectiveName("[ngStyle]");
        } else if (ctx.NG_STYLE_BINDING() != null) {
            definition.setDirectiveName("[style]");
        }
        
        Expression expression = (Expression) visit(ctx.expression());
        if (expression != null) {
            definition.setExpression(expression);
        }
        
        ngStyleDirective.setNgStyleDirectiveDefinition(definition);
        return ngStyleDirective;
    }

    @Override
    public Object visitNgModelDirectiveDefinition(ParserAng.NgModelDirectiveDefinitionContext ctx) {
        Expression modelExpression = (Expression) visit(ctx.expression());
        return modelExpression;
    }

    @Override
    public Object visitHtmlTemplateContent(ParserAng.HtmlTemplateContentContext ctx) {
        HtmlTemplateContent node = new HtmlTemplateContent();
        for (ParserAng.HtmlElementContext ectx : ctx.htmlElement()) {
            HtmlElement el = (HtmlElement) visit(ectx);
            if (el != null) node.addHtmlElement(el);
        }
        return node;
    }


    @Override
    public Object visitHtmlTagElement(ParserAng.HtmlTagElementContext ctx) {
        HtmlTagElement node = new HtmlTagElement();
        HtmlTag tag = (HtmlTag) visit(ctx.htmlTag());
        if (tag != null) node.addHtmlTag(tag);
        return node;
    }


    @Override
    public Object visitHtmlTemplateElement(ParserAng.HtmlTemplateElementContext ctx) {
        HtmlTemplateElement node = new HtmlTemplateElement();
        TemplatePart part = (TemplatePart) visit(ctx.templatePart());
        if (part != null) node.setTemplateParts(part);
        return node;
    }

    @Override
    public Object visitHtmlNgDirectiveElement(ParserAng.HtmlNgDirectiveElementContext ctx) {
        HtmlNgDirectiveElement node = new HtmlNgDirectiveElement();
        NgDirective d = (NgDirective) visit(ctx.ngDirective());
        if (d != null) node.addNgDirective(d);
        return node;
    }



    @Override
    public Object visitDecoratorDefinition2(ParserAng.DecoratorDefinition2Context ctx) {
        DecoratorDefinition2 decorator = new DecoratorDefinition2();
        decorator.setKeyword(ctx.getStart().getText());
        return decorator;
    }


    @Override
    public Object visitDecoratorDefinition1(ParserAng.DecoratorDefinition1Context ctx) {
        DecoratorDefinition1 decorator = new DecoratorDefinition1();

        decorator.setName(ctx.IDENTIFIER().getText());

        if (ctx.decoratorArguments() != null) {
            DecoratorArguments args = (DecoratorArguments) visit(ctx.decoratorArguments());
            if (args != null) {
                decorator.setDecoratorArguments(args);
            }
        }

        return decorator;
    }



    private static String cleanOpenTagName(String raw) {
        if (raw == null) return null;
        String s = raw.trim();
        if (s.startsWith("<")) s = s.substring(1);
        if (s.endsWith(">"))   s = s.substring(0, s.length() - 1);
        if (s.startsWith("/")) s = s.substring(1);
        return s.trim();
    }

    private static String cleanCloseTagName(String raw) {
        if (raw == null) return null;
        String s = raw.trim();
        if (s.startsWith("</")) s = s.substring(2);
        if (s.endsWith(">"))    s = s.substring(0, s.length() - 1);
        return s.trim();
    }

    @Override
    public Object visitHtmlTagDefinition(ParserAng.HtmlTagDefinitionContext ctx) {
        String openTok  = ctx.getStart().getText();
        String closeTok = null;
        boolean selfClosing = false;

        List<HtmlAttribute> attrs = new ArrayList<>();
        List<NgDirective> dirs   = new ArrayList<>();
        List<HtmlElement> inner  = new ArrayList<>();
        List<HtmlElement> trail  = new ArrayList<>();

        boolean closed = false;

        for (ParseTree ch : ctx.children) {
            if (ch instanceof ParserAng.HtmlAttributeContext) {
                attrs.add((HtmlAttribute) visit(ch));
            } else if (ch instanceof ParserAng.NgDirectiveContext) {
                dirs.add((NgDirective) visit(ch));
            } else if (ch instanceof ParserAng.HtmlElementContext) {
                HtmlElement el = (HtmlElement) visit(ch);
                if (!closed) inner.add(el); else trail.add(el);
            } else if (ch instanceof TerminalNode) {
                int type = ((TerminalNode) ch).getSymbol().getType();
                if (type == ParserAng.HTML_TAG_CLOSE || type == ParserAng.HTML_TAG_CLOSE_Q) {
                    closed = true;
                    closeTok = ((TerminalNode) ch).getText();
                } else if (type == ParserAng.HTML_TAG_CLOSE_RIGHT) {
                    // "/>" — self closing
                    closed = true;
                    selfClosing = true;
                }
            }
        }

        HtmlTagDefinition node = new HtmlTagDefinition(openTok, closeTok, selfClosing);
        for (HtmlAttribute a : attrs) node.addAttribute(a);
        for (NgDirective d : dirs)    node.addDirective(d);
        for (HtmlElement e : inner)   node.addInnerElement(e);
        for (HtmlElement e : trail)   node.addTrailingElement(e);

        return node;
    }

    @Override
    public Object visitMethodDefinition2(ParserAng.MethodDefinition2Context ctx) {
        String name = ctx.IDENTIFIER().getText();
        MethodDefinition2 method = new MethodDefinition2(name);

        for (ParserAng.StatementContext sctx : ctx.statement()) {
            Statement stmt = (Statement) visit(sctx);
            method.addStatement(stmt);
        }

        ClickMethodSymbolTable.getInstance().addComponentMethod(name);

        return method;
    }

    @Override
    public Object visitHtmlAttributeDefinition5(ParserAng.HtmlAttributeDefinition5Context ctx) {
        AttributeValue value = (AttributeValue) visit(ctx.attributeValue());

        if (ctx.attributeValue() instanceof ParserAng.ExpressionAttributeValueContext) {
            ParserAng.ExpressionAttributeValueContext exprVal =
                    (ParserAng.ExpressionAttributeValueContext) ctx.attributeValue();

            ParserAng.ExpressionContext expr = exprVal.expression();

            if (expr instanceof ParserAng.AssignmentExprContext) {
                ParserAng.AssignmentExprContext assign = (ParserAng.AssignmentExprContext) expr;

                if (assign.expression(0) instanceof ParserAng.PrimaryExprContext) {
                    ParserAng.PrimaryExprContext leftPrim = (ParserAng.PrimaryExprContext) assign.expression(0);

                    if (leftPrim.primaryExpression() instanceof ParserAng.ParenExprContext) {
                        ParserAng.ParenExprContext paren = (ParserAng.ParenExprContext) leftPrim.primaryExpression();

                        if (paren.expression().size() > 0 &&
                                paren.expression(0) instanceof ParserAng.PrimaryExprContext) {

                            ParserAng.PrimaryExprContext inside =
                                    (ParserAng.PrimaryExprContext) paren.expression(0);

                            if (inside.primaryExpression() instanceof ParserAng.IdentifierExprContext) {
                                ParserAng.IdentifierExprContext idCtx =
                                        (ParserAng.IdentifierExprContext) inside.primaryExpression();

                                String eventName = idCtx.IDENTIFIER().getText();

                                if ("click".equals(eventName)) {
                                    String raw = assign.expression(1).getText();

                                    String s = raw.trim();

                                    if (s.startsWith("\"") || s.startsWith("'")) {
                                        s = s.substring(1);
                                    }
                                    int q1 = s.indexOf('"');
                                    int q2 = s.indexOf('\'');
                                    int cutAtQuote = (q1 >= 0 && q2 >= 0) ? Math.min(q1, q2)
                                            : (q1 >= 0 ? q1 : q2);
                                    if (cutAtQuote >= 0) {
                                        s = s.substring(0, cutAtQuote);
                                    }

                                    int gt = s.indexOf('>');
                                    if (gt >= 0) s = s.substring(0, gt);

                                    int par = s.indexOf('(');
                                    String methodName = (par >= 0 ? s.substring(0, par) : s).trim();

                                    if (!methodName.isEmpty()) {
                                        int line = ctx.getStart().getLine();
                                        clickCollector.addClickCall(methodName, line);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        return new HtmlAttributeDefinition5(value);
    }

    @Override
    public Object visitHtmlAttributeDefinition1(ParserAng.HtmlAttributeDefinition1Context ctx) {
        String identifier = ctx.IDENTIFIER() != null ? ctx.IDENTIFIER().getText() : 
                           ctx.CLASS() != null ? ctx.CLASS().getText() : "";
        
        HtmlAttributeDefinition1 attributeDefinition = new HtmlAttributeDefinition1(identifier);
        
        int leftBrackets = ctx.LBRACKET().size();
        int rightBrackets = ctx.RBRACKET().size();
        attributeDefinition.setBracketCounts(leftBrackets, rightBrackets);
        
        if (ctx.attributeValue() != null) {
            AttributeValue value = (AttributeValue) visit(ctx.attributeValue());
            if (value != null) {
                attributeDefinition.addAttributeValue(value);
            }
        }
        
        return attributeDefinition;
    }
    private final HtmlBindingCollector bindingCollector = new HtmlBindingCollector();
    private final ClickCallCollector clickCollector = new ClickCallCollector();

    @Override
    public Object visitHtmlAttributeDefinition2(ParserAng.HtmlAttributeDefinition2Context ctx) {
        String objectName = ctx.IDENTIFIER(0).getText();
        String propertyName = ctx.IDENTIFIER(1).getText();
        int line = ctx.getStart().getLine();

        HtmlAttributeDefinition2 attributeDefinition = new HtmlAttributeDefinition2(objectName, propertyName);

        bindingCollector.addBinding(objectName, propertyName, line);


        return attributeDefinition;
    }

    @Override
    public Object visitHtmlAttributeDefinition3(ParserAng.HtmlAttributeDefinition3Context ctx) {
        String identifier = ctx.IDENTIFIER().getText();
        String rawCall = ctx.STRING_LITERAL().getText();
        String callContent = rawCall.substring(1, rawCall.length() - 1);
        String methodName = callContent.split("\\(")[0].trim();

        int line = ctx.getStart().getLine();
        if ("click".equals(identifier) && !methodName.isEmpty()) {
            clickCollector.addClickCall(methodName, line);
        }

        return new HtmlAttributeDefinition3(identifier, rawCall);
    }


    @Override
    public Object visitHtmlAttributeDefinition4(ParserAng.HtmlAttributeDefinition4Context ctx) {
        HtmlAttributeDefinition4 attributeDefinition = new HtmlAttributeDefinition4(
            ctx.IDENTIFIER().getText(),
            ctx.STRING_LITERAL().getText()
        );
        return attributeDefinition;
    }

    @Override
    public Object visitStringAttributeValue(ParserAng.StringAttributeValueContext ctx) {
        String value = ctx.STRING_LITERAL().getText();
        value = value.substring(1, value.length() - 1);
        return new StringAttributeValue(value);
    }

    @Override
    public Object visitExpressionAttributeValue(ParserAng.ExpressionAttributeValueContext ctx) {
        ExpressionAttributeValue attributeValue = new ExpressionAttributeValue();
        Expression expression = (Expression) visit(ctx.expression());
        if (expression != null) {
            attributeValue.setHtmlElements(expression);
        }
        return attributeValue;
    }

    @Override
    public Object visitIdePart(ParserAng.IdePartContext ctx) {
        boolean hasHash = ctx.HASH() != null;
        String name = ctx.IDENTIFIER().getText();
        return new IdePart(hasHash, name);
    }


    @Override
    public Object visitTemplateContentPartDefinition(ParserAng.TemplateContentPartDefinitionContext ctx) {
        TemplateContentPartDefinition node = new TemplateContentPartDefinition();
        for (ParserAng.TemplatePartContext pctx : ctx.templatePart()) {
            TemplatePart p = (TemplatePart) visit(pctx);
            if (p != null) node.setTemplateParts(p);
        }
        return node;
    }

    public ClickCallCollector getClickCollector() {return clickCollector;}
    public HtmlBindingCollector getBindingCollector() {return bindingCollector;}
}
