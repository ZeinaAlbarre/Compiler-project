package AstClasses;

public abstract class ASTNode {

    public abstract void PrintAst();

    public String generate() { return ""; }

    public String generateHtml() { return ""; }
    public String generateCss()  { return ""; }
    public String generateJs()   { return ""; }
}
