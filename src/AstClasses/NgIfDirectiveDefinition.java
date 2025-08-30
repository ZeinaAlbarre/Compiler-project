package AstClasses;

public class NgIfDirectiveDefinition extends NgDirective {
    private final Expression condition;

    public NgIfDirectiveDefinition(Expression condition) {
        this.condition = condition;
    }

    @Override
    public void PrintAst() {
        System.out.print("*ngIf=");
        if (condition != null) System.out.print(condition.generate());
        System.out.println("\"");
    }

    @Override
    public String generate() {
        return "*ngIf=" + (condition != null ? condition.generate() : "") + "";
    }

    @Override
    public String generateHtml() { return generate(); }

    @Override
    public String generateCss() { return ""; }

    @Override
    public String generateJs() { return  generate(); }
}