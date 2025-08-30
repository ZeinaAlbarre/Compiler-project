package AstClasses;

public class ImportStatementNode extends Statement {
    public ImportStatement importStatement;

    public ImportStatementNode(ImportStatement importStatement) {
        this.importStatement = importStatement;
    }

    public ImportStatement getImportStatement() {
        return importStatement;
    }

    public void setImportStatement(ImportStatement importStatement) {
        this.importStatement = importStatement;
    }

    @Override
    public void PrintAst() {
        System.out.println("ImportStatementNode:");
        if (importStatement != null) importStatement.PrintAst();
    }
}

