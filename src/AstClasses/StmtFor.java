package AstClasses;

public class StmtFor extends Statement {
    public ForStatement forStatement;

    public ForStatement getForStatement() {
        return forStatement;
    }

    public void setForStatement(ForStatement forStatement) {
        this.forStatement = forStatement;
    }

    @Override
    public void PrintAst() {
        if (forStatement != null) {
            forStatement.PrintAst();
        }
    }

    @Override
    public String generate() {
        return forStatement != null ? forStatement.generate() : "";
    }



    @Override
    public String generateJs() {
        return  generate().replace("\n", "\n// ");
    }
}
