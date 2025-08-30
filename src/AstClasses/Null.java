package AstClasses;

public class Null extends PrimaryExpression {
    public void PrintAst() {
        System.out.println("null");
    }

    @Override
    public String generate() { return "null"; }

    @Override
    public String generateJs() { return "null"; }

    @Override
    public String generateHtml() { return ""; }

    @Override
    public String generateCss() { return ""; }
}
