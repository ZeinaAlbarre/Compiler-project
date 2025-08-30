package AstClasses;

public abstract class FunctionDeclaration extends ASTNode{
    FunctionDefinition functionDefinition;
    ArrowFunctionDefinition arrowFunctionDefinition;

    public FunctionDefinition getFunctionDefinition() {
        return functionDefinition;
    }

    public void setFunctionDefinition(FunctionDefinition functionDefinition) {
        this.functionDefinition = functionDefinition;
    }

    public ArrowFunctionDefinition getArrowFunctionDefinition() {
        return arrowFunctionDefinition;
    }

    public void setArrowFunctionDefinition(ArrowFunctionDefinition arrowFunctionDefinition) {
        this.arrowFunctionDefinition = arrowFunctionDefinition;
    }

    public void PrintAst() {
        if (functionDefinition != null) {
            functionDefinition.PrintAst();
        }
        if (arrowFunctionDefinition != null) {
            arrowFunctionDefinition.PrintAst();
        }
    }
}
