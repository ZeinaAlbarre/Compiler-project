package AstClasses;

public class NavegateLiteral extends Literal {
    private final Literal literal;

    public NavegateLiteral(Literal literal) {
        this.literal = literal;
    }

    public Literal getLiteral() {
        return literal;
    }

    @Override
    public void PrintAst() {
        System.out.print("NavegateLiteral: -");
        if (literal != null) {
            System.out.print("(");
            literal.PrintAst();
            System.out.print(")");
        } else {
            System.out.print("<null>");
        }
        System.out.println();
    }

    @Override
    public String generate() {
        return "-" + (literal != null ? literal.generate() : "0");
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
