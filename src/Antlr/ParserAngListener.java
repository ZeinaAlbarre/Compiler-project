// Generated from D:/java/CompilerProject/src/Antlr/ParserAng.g4 by ANTLR 4.13.1
package Antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ParserAng}.
 */
public interface ParserAngListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code programDef}
	 * labeled alternative in {@link ParserAng#program}.
	 * @param ctx the parse tree
	 */
	void enterProgramDef(ParserAng.ProgramDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code programDef}
	 * labeled alternative in {@link ParserAng#program}.
	 * @param ctx the parse tree
	 */
	void exitProgramDef(ParserAng.ProgramDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sourceElementDef}
	 * labeled alternative in {@link ParserAng#sourceElement}.
	 * @param ctx the parse tree
	 */
	void enterSourceElementDef(ParserAng.SourceElementDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sourceElementDef}
	 * labeled alternative in {@link ParserAng#sourceElement}.
	 * @param ctx the parse tree
	 */
	void exitSourceElementDef(ParserAng.SourceElementDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmImport}
	 * labeled alternative in {@link ParserAng#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmImport(ParserAng.StmImportContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmImport}
	 * labeled alternative in {@link ParserAng#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmImport(ParserAng.StmImportContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtInterface}
	 * labeled alternative in {@link ParserAng#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtInterface(ParserAng.StmtInterfaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtInterface}
	 * labeled alternative in {@link ParserAng#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtInterface(ParserAng.StmtInterfaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtClass}
	 * labeled alternative in {@link ParserAng#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtClass(ParserAng.StmtClassContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtClass}
	 * labeled alternative in {@link ParserAng#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtClass(ParserAng.StmtClassContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtComponent}
	 * labeled alternative in {@link ParserAng#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtComponent(ParserAng.StmtComponentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtComponent}
	 * labeled alternative in {@link ParserAng#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtComponent(ParserAng.StmtComponentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtExport}
	 * labeled alternative in {@link ParserAng#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtExport(ParserAng.StmtExportContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtExport}
	 * labeled alternative in {@link ParserAng#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtExport(ParserAng.StmtExportContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtExpression}
	 * labeled alternative in {@link ParserAng#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtExpression(ParserAng.StmtExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtExpression}
	 * labeled alternative in {@link ParserAng#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtExpression(ParserAng.StmtExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtIf}
	 * labeled alternative in {@link ParserAng#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtIf(ParserAng.StmtIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtIf}
	 * labeled alternative in {@link ParserAng#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtIf(ParserAng.StmtIfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtFor}
	 * labeled alternative in {@link ParserAng#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtFor(ParserAng.StmtForContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtFor}
	 * labeled alternative in {@link ParserAng#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtFor(ParserAng.StmtForContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtVariable}
	 * labeled alternative in {@link ParserAng#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtVariable(ParserAng.StmtVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtVariable}
	 * labeled alternative in {@link ParserAng#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtVariable(ParserAng.StmtVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code defaultImportStatement}
	 * labeled alternative in {@link ParserAng#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterDefaultImportStatement(ParserAng.DefaultImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code defaultImportStatement}
	 * labeled alternative in {@link ParserAng#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitDefaultImportStatement(ParserAng.DefaultImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exportDeclaration}
	 * labeled alternative in {@link ParserAng#exportStatement}.
	 * @param ctx the parse tree
	 */
	void enterExportDeclaration(ParserAng.ExportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exportDeclaration}
	 * labeled alternative in {@link ParserAng#exportStatement}.
	 * @param ctx the parse tree
	 */
	void exitExportDeclaration(ParserAng.ExportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code interfaceDefinition}
	 * labeled alternative in {@link ParserAng#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDefinition(ParserAng.InterfaceDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code interfaceDefinition}
	 * labeled alternative in {@link ParserAng#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDefinition(ParserAng.InterfaceDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code interfacePropertyDefinition}
	 * labeled alternative in {@link ParserAng#interfaceProperty}.
	 * @param ctx the parse tree
	 */
	void enterInterfacePropertyDefinition(ParserAng.InterfacePropertyDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code interfacePropertyDefinition}
	 * labeled alternative in {@link ParserAng#interfaceProperty}.
	 * @param ctx the parse tree
	 */
	void exitInterfacePropertyDefinition(ParserAng.InterfacePropertyDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code classDefinition}
	 * labeled alternative in {@link ParserAng#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDefinition(ParserAng.ClassDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classDefinition}
	 * labeled alternative in {@link ParserAng#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDefinition(ParserAng.ClassDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code classProperty}
	 * labeled alternative in {@link ParserAng#classMember}.
	 * @param ctx the parse tree
	 */
	void enterClassProperty(ParserAng.ClassPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classProperty}
	 * labeled alternative in {@link ParserAng#classMember}.
	 * @param ctx the parse tree
	 */
	void exitClassProperty(ParserAng.ClassPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code classConstructor}
	 * labeled alternative in {@link ParserAng#classMember}.
	 * @param ctx the parse tree
	 */
	void enterClassConstructor(ParserAng.ClassConstructorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classConstructor}
	 * labeled alternative in {@link ParserAng#classMember}.
	 * @param ctx the parse tree
	 */
	void exitClassConstructor(ParserAng.ClassConstructorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code classMethod}
	 * labeled alternative in {@link ParserAng#classMember}.
	 * @param ctx the parse tree
	 */
	void enterClassMethod(ParserAng.ClassMethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classMethod}
	 * labeled alternative in {@link ParserAng#classMember}.
	 * @param ctx the parse tree
	 */
	void exitClassMethod(ParserAng.ClassMethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionDefinition}
	 * labeled alternative in {@link ParserAng#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(ParserAng.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionDefinition}
	 * labeled alternative in {@link ParserAng#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(ParserAng.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrowFunctionDefinition}
	 * labeled alternative in {@link ParserAng#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterArrowFunctionDefinition(ParserAng.ArrowFunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrowFunctionDefinition}
	 * labeled alternative in {@link ParserAng#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitArrowFunctionDefinition(ParserAng.ArrowFunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decoratorDefinition2}
	 * labeled alternative in {@link ParserAng#decorator}.
	 * @param ctx the parse tree
	 */
	void enterDecoratorDefinition2(ParserAng.DecoratorDefinition2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code decoratorDefinition2}
	 * labeled alternative in {@link ParserAng#decorator}.
	 * @param ctx the parse tree
	 */
	void exitDecoratorDefinition2(ParserAng.DecoratorDefinition2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code decoratorDefinition1}
	 * labeled alternative in {@link ParserAng#decorator}.
	 * @param ctx the parse tree
	 */
	void enterDecoratorDefinition1(ParserAng.DecoratorDefinition1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code decoratorDefinition1}
	 * labeled alternative in {@link ParserAng#decorator}.
	 * @param ctx the parse tree
	 */
	void exitDecoratorDefinition1(ParserAng.DecoratorDefinition1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code decoratorObjectArgument}
	 * labeled alternative in {@link ParserAng#decoratorArguments}.
	 * @param ctx the parse tree
	 */
	void enterDecoratorObjectArgument(ParserAng.DecoratorObjectArgumentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decoratorObjectArgument}
	 * labeled alternative in {@link ParserAng#decoratorArguments}.
	 * @param ctx the parse tree
	 */
	void exitDecoratorObjectArgument(ParserAng.DecoratorObjectArgumentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decoratorExpressionArgument}
	 * labeled alternative in {@link ParserAng#decoratorArguments}.
	 * @param ctx the parse tree
	 */
	void enterDecoratorExpressionArgument(ParserAng.DecoratorExpressionArgumentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decoratorExpressionArgument}
	 * labeled alternative in {@link ParserAng#decoratorArguments}.
	 * @param ctx the parse tree
	 */
	void exitDecoratorExpressionArgument(ParserAng.DecoratorExpressionArgumentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code componentDefinition}
	 * labeled alternative in {@link ParserAng#componentDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterComponentDefinition(ParserAng.ComponentDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code componentDefinition}
	 * labeled alternative in {@link ParserAng#componentDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitComponentDefinition(ParserAng.ComponentDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code componentMetadataContent}
	 * labeled alternative in {@link ParserAng#componentMetadata}.
	 * @param ctx the parse tree
	 */
	void enterComponentMetadataContent(ParserAng.ComponentMetadataContentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code componentMetadataContent}
	 * labeled alternative in {@link ParserAng#componentMetadata}.
	 * @param ctx the parse tree
	 */
	void exitComponentMetadataContent(ParserAng.ComponentMetadataContentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code componentSelector}
	 * labeled alternative in {@link ParserAng#componentProperty}.
	 * @param ctx the parse tree
	 */
	void enterComponentSelector(ParserAng.ComponentSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code componentSelector}
	 * labeled alternative in {@link ParserAng#componentProperty}.
	 * @param ctx the parse tree
	 */
	void exitComponentSelector(ParserAng.ComponentSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code componentTemplate}
	 * labeled alternative in {@link ParserAng#componentProperty}.
	 * @param ctx the parse tree
	 */
	void enterComponentTemplate(ParserAng.ComponentTemplateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code componentTemplate}
	 * labeled alternative in {@link ParserAng#componentProperty}.
	 * @param ctx the parse tree
	 */
	void exitComponentTemplate(ParserAng.ComponentTemplateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code componentStyle}
	 * labeled alternative in {@link ParserAng#componentProperty}.
	 * @param ctx the parse tree
	 */
	void enterComponentStyle(ParserAng.ComponentStyleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code componentStyle}
	 * labeled alternative in {@link ParserAng#componentProperty}.
	 * @param ctx the parse tree
	 */
	void exitComponentStyle(ParserAng.ComponentStyleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ex}
	 * labeled alternative in {@link ParserAng#componentProperty}.
	 * @param ctx the parse tree
	 */
	void enterEx(ParserAng.ExContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ex}
	 * labeled alternative in {@link ParserAng#componentProperty}.
	 * @param ctx the parse tree
	 */
	void exitEx(ParserAng.ExContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selectorDefinition}
	 * labeled alternative in {@link ParserAng#selectorProperty}.
	 * @param ctx the parse tree
	 */
	void enterSelectorDefinition(ParserAng.SelectorDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectorDefinition}
	 * labeled alternative in {@link ParserAng#selectorProperty}.
	 * @param ctx the parse tree
	 */
	void exitSelectorDefinition(ParserAng.SelectorDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code templateDefinition}
	 * labeled alternative in {@link ParserAng#templateProperty}.
	 * @param ctx the parse tree
	 */
	void enterTemplateDefinition(ParserAng.TemplateDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code templateDefinition}
	 * labeled alternative in {@link ParserAng#templateProperty}.
	 * @param ctx the parse tree
	 */
	void exitTemplateDefinition(ParserAng.TemplateDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code styleUrlsDefinition}
	 * labeled alternative in {@link ParserAng#styleProperty}.
	 * @param ctx the parse tree
	 */
	void enterStyleUrlsDefinition(ParserAng.StyleUrlsDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code styleUrlsDefinition}
	 * labeled alternative in {@link ParserAng#styleProperty}.
	 * @param ctx the parse tree
	 */
	void exitStyleUrlsDefinition(ParserAng.StyleUrlsDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code styleUrlsDefinition2}
	 * labeled alternative in {@link ParserAng#styleProperty}.
	 * @param ctx the parse tree
	 */
	void enterStyleUrlsDefinition2(ParserAng.StyleUrlsDefinition2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code styleUrlsDefinition2}
	 * labeled alternative in {@link ParserAng#styleProperty}.
	 * @param ctx the parse tree
	 */
	void exitStyleUrlsDefinition2(ParserAng.StyleUrlsDefinition2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code styleContentDefinition}
	 * labeled alternative in {@link ParserAng#styleContent}.
	 * @param ctx the parse tree
	 */
	void enterStyleContentDefinition(ParserAng.StyleContentDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code styleContentDefinition}
	 * labeled alternative in {@link ParserAng#styleContent}.
	 * @param ctx the parse tree
	 */
	void exitStyleContentDefinition(ParserAng.StyleContentDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code propertyDefinition}
	 * labeled alternative in {@link ParserAng#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPropertyDefinition(ParserAng.PropertyDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code propertyDefinition}
	 * labeled alternative in {@link ParserAng#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPropertyDefinition(ParserAng.PropertyDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code methodDefinition}
	 * labeled alternative in {@link ParserAng#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDefinition(ParserAng.MethodDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code methodDefinition}
	 * labeled alternative in {@link ParserAng#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDefinition(ParserAng.MethodDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code methodDefinition2}
	 * labeled alternative in {@link ParserAng#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDefinition2(ParserAng.MethodDefinition2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code methodDefinition2}
	 * labeled alternative in {@link ParserAng#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDefinition2(ParserAng.MethodDefinition2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code constructorDefinition}
	 * labeled alternative in {@link ParserAng#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDefinition(ParserAng.ConstructorDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constructorDefinition}
	 * labeled alternative in {@link ParserAng#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDefinition(ParserAng.ConstructorDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constructorDefinition2}
	 * labeled alternative in {@link ParserAng#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDefinition2(ParserAng.ConstructorDefinition2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code constructorDefinition2}
	 * labeled alternative in {@link ParserAng#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDefinition2(ParserAng.ConstructorDefinition2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code templateStringDefinition}
	 * labeled alternative in {@link ParserAng#templateString}.
	 * @param ctx the parse tree
	 */
	void enterTemplateStringDefinition(ParserAng.TemplateStringDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code templateStringDefinition}
	 * labeled alternative in {@link ParserAng#templateString}.
	 * @param ctx the parse tree
	 */
	void exitTemplateStringDefinition(ParserAng.TemplateStringDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code templateContentPartDefinition}
	 * labeled alternative in {@link ParserAng#templateContent}.
	 * @param ctx the parse tree
	 */
	void enterTemplateContentPartDefinition(ParserAng.TemplateContentPartDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code templateContentPartDefinition}
	 * labeled alternative in {@link ParserAng#templateContent}.
	 * @param ctx the parse tree
	 */
	void exitTemplateContentPartDefinition(ParserAng.TemplateContentPartDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idePart}
	 * labeled alternative in {@link ParserAng#templatePart}.
	 * @param ctx the parse tree
	 */
	void enterIdePart(ParserAng.IdePartContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idePart}
	 * labeled alternative in {@link ParserAng#templatePart}.
	 * @param ctx the parse tree
	 */
	void exitIdePart(ParserAng.IdePartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignmentExpr}
	 * labeled alternative in {@link ParserAng#expression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpr(ParserAng.AssignmentExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignmentExpr}
	 * labeled alternative in {@link ParserAng#expression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpr(ParserAng.AssignmentExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dotExpr}
	 * labeled alternative in {@link ParserAng#expression}.
	 * @param ctx the parse tree
	 */
	void enterDotExpr(ParserAng.DotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dotExpr}
	 * labeled alternative in {@link ParserAng#expression}.
	 * @param ctx the parse tree
	 */
	void exitDotExpr(ParserAng.DotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code propExpr}
	 * labeled alternative in {@link ParserAng#expression}.
	 * @param ctx the parse tree
	 */
	void enterPropExpr(ParserAng.PropExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code propExpr}
	 * labeled alternative in {@link ParserAng#expression}.
	 * @param ctx the parse tree
	 */
	void exitPropExpr(ParserAng.PropExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code colonExpr}
	 * labeled alternative in {@link ParserAng#expression}.
	 * @param ctx the parse tree
	 */
	void enterColonExpr(ParserAng.ColonExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code colonExpr}
	 * labeled alternative in {@link ParserAng#expression}.
	 * @param ctx the parse tree
	 */
	void exitColonExpr(ParserAng.ColonExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalExpr}
	 * labeled alternative in {@link ParserAng#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpr(ParserAng.LogicalExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalExpr}
	 * labeled alternative in {@link ParserAng#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpr(ParserAng.LogicalExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comparisonExpr}
	 * labeled alternative in {@link ParserAng#expression}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpr(ParserAng.ComparisonExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparisonExpr}
	 * labeled alternative in {@link ParserAng#expression}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpr(ParserAng.ComparisonExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link ParserAng#expression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpr(ParserAng.AdditiveExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link ParserAng#expression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpr(ParserAng.AdditiveExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrowExpr}
	 * labeled alternative in {@link ParserAng#expression}.
	 * @param ctx the parse tree
	 */
	void enterArrowExpr(ParserAng.ArrowExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrowExpr}
	 * labeled alternative in {@link ParserAng#expression}.
	 * @param ctx the parse tree
	 */
	void exitArrowExpr(ParserAng.ArrowExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code onExpr}
	 * labeled alternative in {@link ParserAng#expression}.
	 * @param ctx the parse tree
	 */
	void enterOnExpr(ParserAng.OnExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code onExpr}
	 * labeled alternative in {@link ParserAng#expression}.
	 * @param ctx the parse tree
	 */
	void exitOnExpr(ParserAng.OnExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionExpr}
	 * labeled alternative in {@link ParserAng#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionExpr(ParserAng.FunctionExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionExpr}
	 * labeled alternative in {@link ParserAng#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionExpr(ParserAng.FunctionExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code indexExpr}
	 * labeled alternative in {@link ParserAng#expression}.
	 * @param ctx the parse tree
	 */
	void enterIndexExpr(ParserAng.IndexExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code indexExpr}
	 * labeled alternative in {@link ParserAng#expression}.
	 * @param ctx the parse tree
	 */
	void exitIndexExpr(ParserAng.IndexExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignArrayExpr}
	 * labeled alternative in {@link ParserAng#expression}.
	 * @param ctx the parse tree
	 */
	void enterAssignArrayExpr(ParserAng.AssignArrayExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignArrayExpr}
	 * labeled alternative in {@link ParserAng#expression}.
	 * @param ctx the parse tree
	 */
	void exitAssignArrayExpr(ParserAng.AssignArrayExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primaryExpr}
	 * labeled alternative in {@link ParserAng#expression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpr(ParserAng.PrimaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primaryExpr}
	 * labeled alternative in {@link ParserAng#expression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpr(ParserAng.PrimaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code callExpr}
	 * labeled alternative in {@link ParserAng#expression}.
	 * @param ctx the parse tree
	 */
	void enterCallExpr(ParserAng.CallExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code callExpr}
	 * labeled alternative in {@link ParserAng#expression}.
	 * @param ctx the parse tree
	 */
	void exitCallExpr(ParserAng.CallExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplicativeExpr}
	 * labeled alternative in {@link ParserAng#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpr(ParserAng.MultiplicativeExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplicativeExpr}
	 * labeled alternative in {@link ParserAng#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpr(ParserAng.MultiplicativeExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtReturn}
	 * labeled alternative in {@link ParserAng#expression}.
	 * @param ctx the parse tree
	 */
	void enterStmtReturn(ParserAng.StmtReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtReturn}
	 * labeled alternative in {@link ParserAng#expression}.
	 * @param ctx the parse tree
	 */
	void exitStmtReturn(ParserAng.StmtReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code onCall}
	 * labeled alternative in {@link ParserAng#onExpression}.
	 * @param ctx the parse tree
	 */
	void enterOnCall(ParserAng.OnCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code onCall}
	 * labeled alternative in {@link ParserAng#onExpression}.
	 * @param ctx the parse tree
	 */
	void exitOnCall(ParserAng.OnCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrowFunctionDefinition2}
	 * labeled alternative in {@link ParserAng#arrowFunction}.
	 * @param ctx the parse tree
	 */
	void enterArrowFunctionDefinition2(ParserAng.ArrowFunctionDefinition2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code arrowFunctionDefinition2}
	 * labeled alternative in {@link ParserAng#arrowFunction}.
	 * @param ctx the parse tree
	 */
	void exitArrowFunctionDefinition2(ParserAng.ArrowFunctionDefinition2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code arrowParamList}
	 * labeled alternative in {@link ParserAng#arrowParams}.
	 * @param ctx the parse tree
	 */
	void enterArrowParamList(ParserAng.ArrowParamListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrowParamList}
	 * labeled alternative in {@link ParserAng#arrowParams}.
	 * @param ctx the parse tree
	 */
	void exitArrowParamList(ParserAng.ArrowParamListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrowIdentifierParam}
	 * labeled alternative in {@link ParserAng#arrowParam}.
	 * @param ctx the parse tree
	 */
	void enterArrowIdentifierParam(ParserAng.ArrowIdentifierParamContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrowIdentifierParam}
	 * labeled alternative in {@link ParserAng#arrowParam}.
	 * @param ctx the parse tree
	 */
	void exitArrowIdentifierParam(ParserAng.ArrowIdentifierParamContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrowDestructuredParam}
	 * labeled alternative in {@link ParserAng#arrowParam}.
	 * @param ctx the parse tree
	 */
	void enterArrowDestructuredParam(ParserAng.ArrowDestructuredParamContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrowDestructuredParam}
	 * labeled alternative in {@link ParserAng#arrowParam}.
	 * @param ctx the parse tree
	 */
	void exitArrowDestructuredParam(ParserAng.ArrowDestructuredParamContext ctx);
	/**
	 * Enter a parse tree produced by the {@code destructuredObjectDefinition}
	 * labeled alternative in {@link ParserAng#destructuredObject}.
	 * @param ctx the parse tree
	 */
	void enterDestructuredObjectDefinition(ParserAng.DestructuredObjectDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code destructuredObjectDefinition}
	 * labeled alternative in {@link ParserAng#destructuredObject}.
	 * @param ctx the parse tree
	 */
	void exitDestructuredObjectDefinition(ParserAng.DestructuredObjectDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code destructuredPropertyDefinition}
	 * labeled alternative in {@link ParserAng#destructuredProperty}.
	 * @param ctx the parse tree
	 */
	void enterDestructuredPropertyDefinition(ParserAng.DestructuredPropertyDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code destructuredPropertyDefinition}
	 * labeled alternative in {@link ParserAng#destructuredProperty}.
	 * @param ctx the parse tree
	 */
	void exitDestructuredPropertyDefinition(ParserAng.DestructuredPropertyDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrowObjectBody}
	 * labeled alternative in {@link ParserAng#arrowBody}.
	 * @param ctx the parse tree
	 */
	void enterArrowObjectBody(ParserAng.ArrowObjectBodyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrowObjectBody}
	 * labeled alternative in {@link ParserAng#arrowBody}.
	 * @param ctx the parse tree
	 */
	void exitArrowObjectBody(ParserAng.ArrowObjectBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrowParenObjectBody}
	 * labeled alternative in {@link ParserAng#arrowBody}.
	 * @param ctx the parse tree
	 */
	void enterArrowParenObjectBody(ParserAng.ArrowParenObjectBodyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrowParenObjectBody}
	 * labeled alternative in {@link ParserAng#arrowBody}.
	 * @param ctx the parse tree
	 */
	void exitArrowParenObjectBody(ParserAng.ArrowParenObjectBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrowExpressionBody}
	 * labeled alternative in {@link ParserAng#arrowBody}.
	 * @param ctx the parse tree
	 */
	void enterArrowExpressionBody(ParserAng.ArrowExpressionBodyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrowExpressionBody}
	 * labeled alternative in {@link ParserAng#arrowBody}.
	 * @param ctx the parse tree
	 */
	void exitArrowExpressionBody(ParserAng.ArrowExpressionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserAng#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(ParserAng.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserAng#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(ParserAng.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifierExpr}
	 * labeled alternative in {@link ParserAng#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierExpr(ParserAng.IdentifierExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifierExpr}
	 * labeled alternative in {@link ParserAng#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierExpr(ParserAng.IdentifierExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalExpr}
	 * labeled alternative in {@link ParserAng#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExpr(ParserAng.LiteralExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalExpr}
	 * labeled alternative in {@link ParserAng#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExpr(ParserAng.LiteralExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayExpr}
	 * labeled alternative in {@link ParserAng#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayExpr(ParserAng.ArrayExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayExpr}
	 * labeled alternative in {@link ParserAng#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayExpr(ParserAng.ArrayExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code objectExpr}
	 * labeled alternative in {@link ParserAng#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterObjectExpr(ParserAng.ObjectExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code objectExpr}
	 * labeled alternative in {@link ParserAng#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitObjectExpr(ParserAng.ObjectExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code templateExpr}
	 * labeled alternative in {@link ParserAng#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterTemplateExpr(ParserAng.TemplateExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code templateExpr}
	 * labeled alternative in {@link ParserAng#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitTemplateExpr(ParserAng.TemplateExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code allparenExpr}
	 * labeled alternative in {@link ParserAng#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterAllparenExpr(ParserAng.AllparenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code allparenExpr}
	 * labeled alternative in {@link ParserAng#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitAllparenExpr(ParserAng.AllparenExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link ParserAng#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenExpr(ParserAng.ParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link ParserAng#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenExpr(ParserAng.ParenExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pareceExpr}
	 * labeled alternative in {@link ParserAng#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPareceExpr(ParserAng.PareceExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pareceExpr}
	 * labeled alternative in {@link ParserAng#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPareceExpr(ParserAng.PareceExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringLiterial1}
	 * labeled alternative in {@link ParserAng#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterStringLiterial1(ParserAng.StringLiterial1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code stringLiterial1}
	 * labeled alternative in {@link ParserAng#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitStringLiterial1(ParserAng.StringLiterial1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code null}
	 * labeled alternative in {@link ParserAng#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterNull(ParserAng.NullContext ctx);
	/**
	 * Exit a parse tree produced by the {@code null}
	 * labeled alternative in {@link ParserAng#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitNull(ParserAng.NullContext ctx);
	/**
	 * Enter a parse tree produced by the {@code no}
	 * labeled alternative in {@link ParserAng#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterNo(ParserAng.NoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code no}
	 * labeled alternative in {@link ParserAng#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitNo(ParserAng.NoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code roundType2}
	 * labeled alternative in {@link ParserAng#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterRoundType2(ParserAng.RoundType2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code roundType2}
	 * labeled alternative in {@link ParserAng#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitRoundType2(ParserAng.RoundType2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code identifierExpr2}
	 * labeled alternative in {@link ParserAng#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierExpr2(ParserAng.IdentifierExpr2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code identifierExpr2}
	 * labeled alternative in {@link ParserAng#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierExpr2(ParserAng.IdentifierExpr2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code constExpr}
	 * labeled alternative in {@link ParserAng#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstExpr(ParserAng.ConstExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constExpr}
	 * labeled alternative in {@link ParserAng#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstExpr(ParserAng.ConstExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleType}
	 * labeled alternative in {@link ParserAng#typeAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterSimpleType(ParserAng.SimpleTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleType}
	 * labeled alternative in {@link ParserAng#typeAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitSimpleType(ParserAng.SimpleTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayType}
	 * labeled alternative in {@link ParserAng#typeAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(ParserAng.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayType}
	 * labeled alternative in {@link ParserAng#typeAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(ParserAng.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code complexType}
	 * labeled alternative in {@link ParserAng#typeAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterComplexType(ParserAng.ComplexTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code complexType}
	 * labeled alternative in {@link ParserAng#typeAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitComplexType(ParserAng.ComplexTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code roundType}
	 * labeled alternative in {@link ParserAng#typeAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterRoundType(ParserAng.RoundTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code roundType}
	 * labeled alternative in {@link ParserAng#typeAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitRoundType(ParserAng.RoundTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link ParserAng#literal}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(ParserAng.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link ParserAng#literal}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(ParserAng.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberLiteral}
	 * labeled alternative in {@link ParserAng#literal}.
	 * @param ctx the parse tree
	 */
	void enterNumberLiteral(ParserAng.NumberLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberLiteral}
	 * labeled alternative in {@link ParserAng#literal}.
	 * @param ctx the parse tree
	 */
	void exitNumberLiteral(ParserAng.NumberLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanLiteral}
	 * labeled alternative in {@link ParserAng#literal}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(ParserAng.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanLiteral}
	 * labeled alternative in {@link ParserAng#literal}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(ParserAng.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nullLiteral}
	 * labeled alternative in {@link ParserAng#literal}.
	 * @param ctx the parse tree
	 */
	void enterNullLiteral(ParserAng.NullLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nullLiteral}
	 * labeled alternative in {@link ParserAng#literal}.
	 * @param ctx the parse tree
	 */
	void exitNullLiteral(ParserAng.NullLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code navegateLiteral}
	 * labeled alternative in {@link ParserAng#literal}.
	 * @param ctx the parse tree
	 */
	void enterNavegateLiteral(ParserAng.NavegateLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code navegateLiteral}
	 * labeled alternative in {@link ParserAng#literal}.
	 * @param ctx the parse tree
	 */
	void exitNavegateLiteral(ParserAng.NavegateLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayLiteralDefinition}
	 * labeled alternative in {@link ParserAng#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void enterArrayLiteralDefinition(ParserAng.ArrayLiteralDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayLiteralDefinition}
	 * labeled alternative in {@link ParserAng#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void exitArrayLiteralDefinition(ParserAng.ArrayLiteralDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code objectLiteralDefinition}
	 * labeled alternative in {@link ParserAng#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void enterObjectLiteralDefinition(ParserAng.ObjectLiteralDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code objectLiteralDefinition}
	 * labeled alternative in {@link ParserAng#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void exitObjectLiteralDefinition(ParserAng.ObjectLiteralDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code propertyAssignmentDefinition}
	 * labeled alternative in {@link ParserAng#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterPropertyAssignmentDefinition(ParserAng.PropertyAssignmentDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code propertyAssignmentDefinition}
	 * labeled alternative in {@link ParserAng#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitPropertyAssignmentDefinition(ParserAng.PropertyAssignmentDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code shorthandPropertyAssignment}
	 * labeled alternative in {@link ParserAng#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterShorthandPropertyAssignment(ParserAng.ShorthandPropertyAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code shorthandPropertyAssignment}
	 * labeled alternative in {@link ParserAng#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitShorthandPropertyAssignment(ParserAng.ShorthandPropertyAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code spreadProperty}
	 * labeled alternative in {@link ParserAng#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterSpreadProperty(ParserAng.SpreadPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code spreadProperty}
	 * labeled alternative in {@link ParserAng#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitSpreadProperty(ParserAng.SpreadPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionStatementDefinition}
	 * labeled alternative in {@link ParserAng#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatementDefinition(ParserAng.ExpressionStatementDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionStatementDefinition}
	 * labeled alternative in {@link ParserAng#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatementDefinition(ParserAng.ExpressionStatementDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifStatementDefinition}
	 * labeled alternative in {@link ParserAng#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatementDefinition(ParserAng.IfStatementDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifStatementDefinition}
	 * labeled alternative in {@link ParserAng#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatementDefinition(ParserAng.IfStatementDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forStatementDefinition}
	 * labeled alternative in {@link ParserAng#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatementDefinition(ParserAng.ForStatementDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forStatementDefinition}
	 * labeled alternative in {@link ParserAng#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatementDefinition(ParserAng.ForStatementDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forVariableInitializer}
	 * labeled alternative in {@link ParserAng#forInitializer}.
	 * @param ctx the parse tree
	 */
	void enterForVariableInitializer(ParserAng.ForVariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forVariableInitializer}
	 * labeled alternative in {@link ParserAng#forInitializer}.
	 * @param ctx the parse tree
	 */
	void exitForVariableInitializer(ParserAng.ForVariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forAssignInitializer}
	 * labeled alternative in {@link ParserAng#forInitializer}.
	 * @param ctx the parse tree
	 */
	void enterForAssignInitializer(ParserAng.ForAssignInitializerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forAssignInitializer}
	 * labeled alternative in {@link ParserAng#forInitializer}.
	 * @param ctx the parse tree
	 */
	void exitForAssignInitializer(ParserAng.ForAssignInitializerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forExpressionInitializer}
	 * labeled alternative in {@link ParserAng#forInitializer}.
	 * @param ctx the parse tree
	 */
	void enterForExpressionInitializer(ParserAng.ForExpressionInitializerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forExpressionInitializer}
	 * labeled alternative in {@link ParserAng#forInitializer}.
	 * @param ctx the parse tree
	 */
	void exitForExpressionInitializer(ParserAng.ForExpressionInitializerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnStatementDefinition}
	 * labeled alternative in {@link ParserAng#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatementDefinition(ParserAng.ReturnStatementDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnStatementDefinition}
	 * labeled alternative in {@link ParserAng#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatementDefinition(ParserAng.ReturnStatementDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableStatementDefinition2}
	 * labeled alternative in {@link ParserAng#variableStatement}.
	 * @param ctx the parse tree
	 */
	void enterVariableStatementDefinition2(ParserAng.VariableStatementDefinition2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code variableStatementDefinition2}
	 * labeled alternative in {@link ParserAng#variableStatement}.
	 * @param ctx the parse tree
	 */
	void exitVariableStatementDefinition2(ParserAng.VariableStatementDefinition2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code variableDeclarationDefinition}
	 * labeled alternative in {@link ParserAng#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationDefinition(ParserAng.VariableDeclarationDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableDeclarationDefinition}
	 * labeled alternative in {@link ParserAng#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationDefinition(ParserAng.VariableDeclarationDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parameterListDefinition}
	 * labeled alternative in {@link ParserAng#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterListDefinition(ParserAng.ParameterListDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parameterListDefinition}
	 * labeled alternative in {@link ParserAng#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterListDefinition(ParserAng.ParameterListDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parameterDefinition}
	 * labeled alternative in {@link ParserAng#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameterDefinition(ParserAng.ParameterDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parameterDefinition}
	 * labeled alternative in {@link ParserAng#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameterDefinition(ParserAng.ParameterDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code argumentListDefinition}
	 * labeled alternative in {@link ParserAng#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentListDefinition(ParserAng.ArgumentListDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code argumentListDefinition}
	 * labeled alternative in {@link ParserAng#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentListDefinition(ParserAng.ArgumentListDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code objectTypeDefinition}
	 * labeled alternative in {@link ParserAng#objectType}.
	 * @param ctx the parse tree
	 */
	void enterObjectTypeDefinition(ParserAng.ObjectTypeDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code objectTypeDefinition}
	 * labeled alternative in {@link ParserAng#objectType}.
	 * @param ctx the parse tree
	 */
	void exitObjectTypeDefinition(ParserAng.ObjectTypeDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code objectTypeMemberDefinition}
	 * labeled alternative in {@link ParserAng#objectTypeMember}.
	 * @param ctx the parse tree
	 */
	void enterObjectTypeMemberDefinition(ParserAng.ObjectTypeMemberDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code objectTypeMemberDefinition}
	 * labeled alternative in {@link ParserAng#objectTypeMember}.
	 * @param ctx the parse tree
	 */
	void exitObjectTypeMemberDefinition(ParserAng.ObjectTypeMemberDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code directiveNgFor}
	 * labeled alternative in {@link ParserAng#ngDirective}.
	 * @param ctx the parse tree
	 */
	void enterDirectiveNgFor(ParserAng.DirectiveNgForContext ctx);
	/**
	 * Exit a parse tree produced by the {@code directiveNgFor}
	 * labeled alternative in {@link ParserAng#ngDirective}.
	 * @param ctx the parse tree
	 */
	void exitDirectiveNgFor(ParserAng.DirectiveNgForContext ctx);
	/**
	 * Enter a parse tree produced by the {@code directiveNgIf}
	 * labeled alternative in {@link ParserAng#ngDirective}.
	 * @param ctx the parse tree
	 */
	void enterDirectiveNgIf(ParserAng.DirectiveNgIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code directiveNgIf}
	 * labeled alternative in {@link ParserAng#ngDirective}.
	 * @param ctx the parse tree
	 */
	void exitDirectiveNgIf(ParserAng.DirectiveNgIfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code directiveNgStyle}
	 * labeled alternative in {@link ParserAng#ngDirective}.
	 * @param ctx the parse tree
	 */
	void enterDirectiveNgStyle(ParserAng.DirectiveNgStyleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code directiveNgStyle}
	 * labeled alternative in {@link ParserAng#ngDirective}.
	 * @param ctx the parse tree
	 */
	void exitDirectiveNgStyle(ParserAng.DirectiveNgStyleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code directiveNgSwitch}
	 * labeled alternative in {@link ParserAng#ngDirective}.
	 * @param ctx the parse tree
	 */
	void enterDirectiveNgSwitch(ParserAng.DirectiveNgSwitchContext ctx);
	/**
	 * Exit a parse tree produced by the {@code directiveNgSwitch}
	 * labeled alternative in {@link ParserAng#ngDirective}.
	 * @param ctx the parse tree
	 */
	void exitDirectiveNgSwitch(ParserAng.DirectiveNgSwitchContext ctx);
	/**
	 * Enter a parse tree produced by the {@code directiveNgClass}
	 * labeled alternative in {@link ParserAng#ngDirective}.
	 * @param ctx the parse tree
	 */
	void enterDirectiveNgClass(ParserAng.DirectiveNgClassContext ctx);
	/**
	 * Exit a parse tree produced by the {@code directiveNgClass}
	 * labeled alternative in {@link ParserAng#ngDirective}.
	 * @param ctx the parse tree
	 */
	void exitDirectiveNgClass(ParserAng.DirectiveNgClassContext ctx);
	/**
	 * Enter a parse tree produced by the {@code directiveNgModel}
	 * labeled alternative in {@link ParserAng#ngDirective}.
	 * @param ctx the parse tree
	 */
	void enterDirectiveNgModel(ParserAng.DirectiveNgModelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code directiveNgModel}
	 * labeled alternative in {@link ParserAng#ngDirective}.
	 * @param ctx the parse tree
	 */
	void exitDirectiveNgModel(ParserAng.DirectiveNgModelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ngForDirectiveDefinition1}
	 * labeled alternative in {@link ParserAng#ngForDirective}.
	 * @param ctx the parse tree
	 */
	void enterNgForDirectiveDefinition1(ParserAng.NgForDirectiveDefinition1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ngForDirectiveDefinition1}
	 * labeled alternative in {@link ParserAng#ngForDirective}.
	 * @param ctx the parse tree
	 */
	void exitNgForDirectiveDefinition1(ParserAng.NgForDirectiveDefinition1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ngForDirectiveDefinition2}
	 * labeled alternative in {@link ParserAng#ngForDirective}.
	 * @param ctx the parse tree
	 */
	void enterNgForDirectiveDefinition2(ParserAng.NgForDirectiveDefinition2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ngForDirectiveDefinition2}
	 * labeled alternative in {@link ParserAng#ngForDirective}.
	 * @param ctx the parse tree
	 */
	void exitNgForDirectiveDefinition2(ParserAng.NgForDirectiveDefinition2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ngIfDirectiveDefinition}
	 * labeled alternative in {@link ParserAng#ngIfDirective}.
	 * @param ctx the parse tree
	 */
	void enterNgIfDirectiveDefinition(ParserAng.NgIfDirectiveDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ngIfDirectiveDefinition}
	 * labeled alternative in {@link ParserAng#ngIfDirective}.
	 * @param ctx the parse tree
	 */
	void exitNgIfDirectiveDefinition(ParserAng.NgIfDirectiveDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ngSwitchDirectiveDefinition}
	 * labeled alternative in {@link ParserAng#ngSwitchDirective}.
	 * @param ctx the parse tree
	 */
	void enterNgSwitchDirectiveDefinition(ParserAng.NgSwitchDirectiveDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ngSwitchDirectiveDefinition}
	 * labeled alternative in {@link ParserAng#ngSwitchDirective}.
	 * @param ctx the parse tree
	 */
	void exitNgSwitchDirectiveDefinition(ParserAng.NgSwitchDirectiveDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ngClassDirectiveDefinition}
	 * labeled alternative in {@link ParserAng#ngClassDirective}.
	 * @param ctx the parse tree
	 */
	void enterNgClassDirectiveDefinition(ParserAng.NgClassDirectiveDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ngClassDirectiveDefinition}
	 * labeled alternative in {@link ParserAng#ngClassDirective}.
	 * @param ctx the parse tree
	 */
	void exitNgClassDirectiveDefinition(ParserAng.NgClassDirectiveDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ngStyleDirectiveDefinition}
	 * labeled alternative in {@link ParserAng#ngStyleDirective}.
	 * @param ctx the parse tree
	 */
	void enterNgStyleDirectiveDefinition(ParserAng.NgStyleDirectiveDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ngStyleDirectiveDefinition}
	 * labeled alternative in {@link ParserAng#ngStyleDirective}.
	 * @param ctx the parse tree
	 */
	void exitNgStyleDirectiveDefinition(ParserAng.NgStyleDirectiveDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ngModelDirectiveDefinition}
	 * labeled alternative in {@link ParserAng#ngModelDirective}.
	 * @param ctx the parse tree
	 */
	void enterNgModelDirectiveDefinition(ParserAng.NgModelDirectiveDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ngModelDirectiveDefinition}
	 * labeled alternative in {@link ParserAng#ngModelDirective}.
	 * @param ctx the parse tree
	 */
	void exitNgModelDirectiveDefinition(ParserAng.NgModelDirectiveDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code htmlTemplateContent}
	 * labeled alternative in {@link ParserAng#htmlTemplate}.
	 * @param ctx the parse tree
	 */
	void enterHtmlTemplateContent(ParserAng.HtmlTemplateContentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code htmlTemplateContent}
	 * labeled alternative in {@link ParserAng#htmlTemplate}.
	 * @param ctx the parse tree
	 */
	void exitHtmlTemplateContent(ParserAng.HtmlTemplateContentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code htmlTagElement}
	 * labeled alternative in {@link ParserAng#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlTagElement(ParserAng.HtmlTagElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code htmlTagElement}
	 * labeled alternative in {@link ParserAng#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlTagElement(ParserAng.HtmlTagElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code htmlTemplateElement}
	 * labeled alternative in {@link ParserAng#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlTemplateElement(ParserAng.HtmlTemplateElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code htmlTemplateElement}
	 * labeled alternative in {@link ParserAng#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlTemplateElement(ParserAng.HtmlTemplateElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code htmlNgDirectiveElement}
	 * labeled alternative in {@link ParserAng#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlNgDirectiveElement(ParserAng.HtmlNgDirectiveElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code htmlNgDirectiveElement}
	 * labeled alternative in {@link ParserAng#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlNgDirectiveElement(ParserAng.HtmlNgDirectiveElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code htmlTagDefinition}
	 * labeled alternative in {@link ParserAng#htmlTag}.
	 * @param ctx the parse tree
	 */
	void enterHtmlTagDefinition(ParserAng.HtmlTagDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code htmlTagDefinition}
	 * labeled alternative in {@link ParserAng#htmlTag}.
	 * @param ctx the parse tree
	 */
	void exitHtmlTagDefinition(ParserAng.HtmlTagDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code htmlAttributeDefinition1}
	 * labeled alternative in {@link ParserAng#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttributeDefinition1(ParserAng.HtmlAttributeDefinition1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code htmlAttributeDefinition1}
	 * labeled alternative in {@link ParserAng#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttributeDefinition1(ParserAng.HtmlAttributeDefinition1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code htmlAttributeDefinition2}
	 * labeled alternative in {@link ParserAng#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttributeDefinition2(ParserAng.HtmlAttributeDefinition2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code htmlAttributeDefinition2}
	 * labeled alternative in {@link ParserAng#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttributeDefinition2(ParserAng.HtmlAttributeDefinition2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code htmlAttributeDefinition3}
	 * labeled alternative in {@link ParserAng#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttributeDefinition3(ParserAng.HtmlAttributeDefinition3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code htmlAttributeDefinition3}
	 * labeled alternative in {@link ParserAng#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttributeDefinition3(ParserAng.HtmlAttributeDefinition3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code htmlAttributeDefinition4}
	 * labeled alternative in {@link ParserAng#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttributeDefinition4(ParserAng.HtmlAttributeDefinition4Context ctx);
	/**
	 * Exit a parse tree produced by the {@code htmlAttributeDefinition4}
	 * labeled alternative in {@link ParserAng#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttributeDefinition4(ParserAng.HtmlAttributeDefinition4Context ctx);
	/**
	 * Enter a parse tree produced by the {@code htmlAttributeDefinition5}
	 * labeled alternative in {@link ParserAng#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttributeDefinition5(ParserAng.HtmlAttributeDefinition5Context ctx);
	/**
	 * Exit a parse tree produced by the {@code htmlAttributeDefinition5}
	 * labeled alternative in {@link ParserAng#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttributeDefinition5(ParserAng.HtmlAttributeDefinition5Context ctx);
	/**
	 * Enter a parse tree produced by the {@code stringAttributeValue}
	 * labeled alternative in {@link ParserAng#attributeValue}.
	 * @param ctx the parse tree
	 */
	void enterStringAttributeValue(ParserAng.StringAttributeValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringAttributeValue}
	 * labeled alternative in {@link ParserAng#attributeValue}.
	 * @param ctx the parse tree
	 */
	void exitStringAttributeValue(ParserAng.StringAttributeValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionAttributeValue}
	 * labeled alternative in {@link ParserAng#attributeValue}.
	 * @param ctx the parse tree
	 */
	void enterExpressionAttributeValue(ParserAng.ExpressionAttributeValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionAttributeValue}
	 * labeled alternative in {@link ParserAng#attributeValue}.
	 * @param ctx the parse tree
	 */
	void exitExpressionAttributeValue(ParserAng.ExpressionAttributeValueContext ctx);
}