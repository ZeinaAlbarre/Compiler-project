package AstClasses;

public class NumberLiteral extends Literal {
    public String value;

    public NumberLiteral(String value) {
        this.value = value;
    }

    @Override
    public void PrintAst() {
        System.out.println("NumberLiteral: " + value);
    }

    @Override
    public String generate() { return value; }

    @Override
    public String generateJs() { return value; }

    @Override
    public String generateHtml() { return ""; }

    @Override
    public String generateCss() { return ""; }
}
