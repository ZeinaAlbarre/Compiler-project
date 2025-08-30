package AstClasses;

public abstract class ForInitializer extends ASTNode{

    ForVariableInitializer forVariableInitializer;

    ForAssignInitializer forAssignInitializer;
    ForExpressionInitializer forExpressionInitializer;

    public ForVariableInitializer getForVariableInitializer() {
        return forVariableInitializer;
    }

    public void setForVariableInitializer(ForVariableInitializer forVariableInitializer) {
        this.forVariableInitializer = forVariableInitializer;
    }

    public ForExpressionInitializer getForExpressionInitializer() {
        return forExpressionInitializer;
    }

    public void setForExpressionInitializer(ForExpressionInitializer forExpressionInitializer) {
        this.forExpressionInitializer = forExpressionInitializer;
    }

    public ForAssignInitializer getForAssignInitializer() {
        return forAssignInitializer;
    }

    public void setForAssignInitializer(ForAssignInitializer forAssignInitializer) {
        this.forAssignInitializer = forAssignInitializer;
    }

    @Override
    public void PrintAst() {
        if (forVariableInitializer != null) forVariableInitializer.PrintAst();
        if (forExpressionInitializer != null) forExpressionInitializer.PrintAst();
        if (forAssignInitializer != null) forAssignInitializer.PrintAst();
    }
}
