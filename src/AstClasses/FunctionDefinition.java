package AstClasses;
import java.util.List;

public class FunctionDefinition extends FunctionDeclaration{
    private String accessModifier;
    private String functionType;
    private String identifier;
    private ParameterList parameterList;
    private TypeAnnotation typeAnnotation;
    private List<Statement> bodyStatements;
    private Expression expressionBody;

    private boolean isArrowFunction;

    public String getAccessModifier() {
        return accessModifier;
    }

    public void setAccessModifier(String accessModifier) {
        this.accessModifier = accessModifier;
    }

    public String getFunctionType() {
        return functionType;
    }

    public void setFunctionType(String functionType) {
        this.functionType = functionType;
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

    public List<Statement> getBodyStatements() {
        return bodyStatements;
    }

    public void setBodyStatements(List<Statement> bodyStatements) {
        this.bodyStatements = bodyStatements;
    }

    public Expression getExpressionBody() {
        return expressionBody;
    }

    public void setExpressionBody(Expression expressionBody) {
        this.expressionBody = expressionBody;
    }

    public boolean isArrowFunction() {
        return isArrowFunction;
    }

    public void setArrowFunction(boolean arrowFunction) {
        isArrowFunction = arrowFunction;
    }

    @Override
    public void PrintAst() {
        System.out.println((isArrowFunction ? "ArrowFunction" : "Function") + ": " + identifier);

        if (accessModifier != null)
            System.out.println("Access: " + accessModifier);

        if (parameterList != null)
            parameterList.PrintAst();

        if (typeAnnotation != null)
            typeAnnotation.PrintAst();

        if (!isArrowFunction && bodyStatements != null) {
            System.out.println("Function Body:");
            for (Statement stmt : bodyStatements) {
                stmt.PrintAst();
            }
        }

        if (isArrowFunction && expressionBody != null) {
            System.out.println("Arrow Function Body (Expression):");
            expressionBody.PrintAst();
        }
    }
    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        if (accessModifier != null) sb.append(accessModifier).append(" ");
        if (functionType != null) sb.append(functionType).append(" ");
        sb.append("function ").append(identifier).append("(");
        if (parameterList != null) sb.append(parameterList.generate());
        sb.append(")");
        if (typeAnnotation != null) {
            sb.append(": ").append(typeAnnotation.generate());
        }

        if (!isArrowFunction && bodyStatements != null) {
            sb.append(" {\n");
            for (Statement s : bodyStatements) {
                sb.append("  ").append(s.generate()).append("\n");
            }
            sb.append("}");
        } else if (isArrowFunction && expressionBody != null) {
            sb.append(" => ").append(expressionBody.generate());
        }

        return sb.toString();
    }

    @Override
    public String generateJs() {
        StringBuilder sb = new StringBuilder();
        sb.append("function ").append(identifier).append("(");
        if (parameterList != null) sb.append(parameterList.generateJs());
        sb.append(")");

        if (!isArrowFunction && bodyStatements != null) {
            sb.append(" {\n");
            for (Statement s : bodyStatements) {
                sb.append("  ").append(s.generateJs()).append("\n");
            }
            sb.append("}");
        } else if (isArrowFunction && expressionBody != null) {
            sb.append(" => ").append(expressionBody.generateJs());
        }

        return sb.toString();
    }



}
