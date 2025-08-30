package AstClasses;

public class NgForDirectiveDefinition2 extends NgDirective {
    private final String rawValue;
    public NgForDirectiveDefinition2(String rawValue) {
        this.rawValue = rawValue;
    }

    @Override
    public void PrintAst() {
        System.out.println("*ngFor=\"" + rawValue );
    }

    @Override
    public String generate() {
        return "*ngFor=\"" + rawValue + "\"";
    }

    @Override
    public String generateHtml() { return generate(); }

    @Override
    public String generateJs() { return  generate(); }
}