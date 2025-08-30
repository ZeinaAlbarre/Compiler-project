package AstClasses;

public class NullLiteral extends Literal {

    @Override
    public void PrintAst() {
        System.out.println("NullLiteral: null");
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
