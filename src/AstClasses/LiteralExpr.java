package AstClasses;

public class LiteralExpr extends PrimaryExpression {
    public Literal literal;

    public void setLiteral(Literal literal) {
        this.literal = literal;
    }

    @Override
    public void PrintAst() {
        System.out.println("LiteralExpr:");
        if (literal != null) literal.PrintAst();
    }

    @Override
    public String generate() {
        return literal != null ? literal.generate() : "";
    }

    @Override
    public String generateJs() {
        return literal != null ? literal.generateJs() : "";
    }

    @Override
    public String generateHtml() {
        return literal != null ? literal.generateHtml() : "";
    }


}
