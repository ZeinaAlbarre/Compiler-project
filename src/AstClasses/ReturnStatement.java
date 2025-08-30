package AstClasses;

public abstract class ReturnStatement extends ASTNode{

    ReturnStatementDefinition returnStatementDefinition;

    public ReturnStatementDefinition getReturnStatementDefinition() {
        return returnStatementDefinition;
    }

    public void setReturnStatementDefinition(ReturnStatementDefinition returnStatementDefinition) {
        this.returnStatementDefinition = returnStatementDefinition;
    }

    public void PrintAst() {
        if (returnStatementDefinition != null) {
            returnStatementDefinition.PrintAst();
        }
    }
}
