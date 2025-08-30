package AstClasses;

public class ForAssignInitializer extends ForInitializer {
    public String kind;
    public String identifier;
    public Expression initExpression;

    public ForAssignInitializer() {}

    @Override
    public void PrintAst() {
        System.out.println("ForAssignInitializer(");
        System.out.println("  Kind: " + kind);
        System.out.println("  Identifier: " + identifier);
        System.out.print("  Initial Expression: ");
        if (initExpression != null)
            initExpression.PrintAst();
        else
            System.out.println("null");
        System.out.println(")");
    }
    @Override
    public String generate() {
        return kind + " " + identifier +
                (initExpression != null ? " = " + initExpression.generate() : "");
    }

    @Override
    public String generateJs() { return generate(); }
    @Override
    public String generateHtml() { return ""; }
    @Override
    public String generateCss() { return ""; }
}
