package AstClasses;

public class ExportDeclaration extends ExportStatement {
    private final ASTNode declaration;

    public ExportDeclaration(ASTNode declaration) {
        this.declaration = declaration;
    }

    public ASTNode getDeclaration() {
        return declaration;
    }

    @Override
    public void PrintAst() {
        System.out.println("ExportDeclaration:");
        if (declaration != null) {
            System.out.print("  ");
            declaration.PrintAst();
        }
    }

    @Override
    public String generate() {
        return declaration != null ? declaration.generate() : "";
    }


    @Override
    public String generateJs() {
        return declaration != null ? "// " + declaration.generate().replace("\n", "\n// ") : "";
    }
}
