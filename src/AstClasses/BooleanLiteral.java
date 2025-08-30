package AstClasses;

public class BooleanLiteral extends Literal {
    public boolean value;

    public BooleanLiteral(boolean value) {
        this.value = value;
    }

    @Override
    public void PrintAst() {
        System.out.println("BooleanLiteral: " + value);
    }

    @Override
    public String generate() {
        return String.valueOf(value);
    }

    @Override
    public String generateJs() {
        return generate();
    }

    @Override
    public String generateHtml() { return ""; }

    @Override
    public String generateCss() { return ""; }
}
