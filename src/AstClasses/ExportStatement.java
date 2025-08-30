package AstClasses;

public abstract class ExportStatement extends ASTNode{
    ExportDeclaration exportDeclaration;

    public ExportDeclaration getExportDeclaration() {
        return exportDeclaration;
    }

    public void setExportDeclaration(ExportDeclaration exportDeclaration) {
        this.exportDeclaration = exportDeclaration;
    }

    public void PrintAst() {
        if (exportDeclaration != null) {
            exportDeclaration.PrintAst();
        }
    }
}

