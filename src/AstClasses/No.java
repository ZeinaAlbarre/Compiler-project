package AstClasses;

public class No extends PrimaryExpression {
    private String identifier;

    public No(String identifier) {
        this.identifier = identifier;
    }

    public String getIdentifier() {
        return identifier;
    }

    @Override
    public void PrintAst() {
        System.out.println("NoExpr: !" + identifier);
    }

    @Override
    public String generate() { return "!" + identifier; }

    @Override
    public String generateJs() { return "!" + identifier; }

    @Override
    public String generateHtml() { return ""; }

    @Override
    public String generateCss() { return ""; }
}
