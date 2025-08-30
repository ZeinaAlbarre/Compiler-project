package AstClasses;

public class StmtReturn extends Expression {
    public ReturnStatement returnStatement;

    public ReturnStatement getReturnStatement() {
        return returnStatement;
    }

    public void setReturnStatement(ReturnStatement returnStatement) {
        this.returnStatement = returnStatement;
    }

    @Override
    public void PrintAst() {
        if (returnStatement != null) {
            returnStatement.PrintAst();
        }
    }

    @Override
    public String generate() {
        return returnStatement != null ? returnStatement.generate() : "return;";
    }

    @Override
    public String generateJs() {
        return generate(); }

}
