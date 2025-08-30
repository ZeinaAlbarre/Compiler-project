package AstClasses;

import java.util.List;

public class ArrowFunctionDefinition extends FunctionDeclaration {
    private String accessModifier;
    private String identifier;
    private ParameterList parameterList;
    private TypeAnnotation typeAnnotation;
    private List<Statement> statements;
    private Expression expressionBody;

    public String getAccessModifier() {
        return accessModifier;
    }

    public void setAccessModifier(String accessModifier) {
        this.accessModifier = accessModifier;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public ParameterList getParameterList() {
        return parameterList;
    }

    public void setParameterList(ParameterList parameterList) {
        this.parameterList = parameterList;
    }

    public TypeAnnotation getTypeAnnotation() {
        return typeAnnotation;
    }

    public void setTypeAnnotation(TypeAnnotation typeAnnotation) {
        this.typeAnnotation = typeAnnotation;
    }

    public List<Statement> getStatements() {
        return statements;
    }

    public void setStatements(List<Statement> statements) {
        this.statements = statements;
    }

    public Expression getExpressionBody() {
        return expressionBody;
    }

    public void setExpressionBody(Expression expressionBody) {
        this.expressionBody = expressionBody;
    }

    @Override
    public void PrintAst() {
        System.out.println("ArrowFunction: " + identifier);

        if (accessModifier != null) {
            System.out.println("Access Modifier: " + accessModifier);
        }

        if (parameterList != null) {
            parameterList.PrintAst();
        }

        if (typeAnnotation != null) {
            typeAnnotation.PrintAst();
        }

        if (statements != null && !statements.isEmpty()) {
            System.out.println("Function Body Statements:");
            for (Statement stmt : statements) {
                stmt.PrintAst();
            }
        } else if (expressionBody != null) {
            System.out.println("Function Body Expression:");
            expressionBody.PrintAst();
        }
    }
    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        if (accessModifier != null) {
            sb.append(accessModifier).append(" ");
        }
        sb.append(identifier != null ? identifier + " = " : "");
        sb.append("(");
        if (parameterList != null) {
            sb.append(parameterList.generate());
        }
        sb.append(") => ");
        if (typeAnnotation != null) {
            sb.append(": ").append(typeAnnotation.generate()).append(" ");
        }
        if (statements != null && !statements.isEmpty()) {
            sb.append("{\n");
            for (Statement s : statements) {
                sb.append("  ").append(s.generate()).append("\n");
            }
            sb.append("}");
        } else if (expressionBody != null) {
            sb.append(expressionBody.generate());
        }
        return sb.toString();
    }

    @Override
    public String generateJs() {
        StringBuilder sb = new StringBuilder();
        sb.append(identifier != null ? identifier + " = " : "");
        sb.append("(");
        if (parameterList != null) {
            sb.append(parameterList.generateJs());
        }
        sb.append(") => ");
        if (statements != null && !statements.isEmpty()) {
            sb.append("{\n");
            for (Statement s : statements) {
                sb.append("  ").append(s.generateJs()).append("\n");
            }
            sb.append("}");
        } else if (expressionBody != null) {
            sb.append(expressionBody.generateJs());
        }
        return sb.toString();
    }


}
