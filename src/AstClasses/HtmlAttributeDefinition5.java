package AstClasses;

public class HtmlAttributeDefinition5 extends HtmlAttribute {
    private final AttributeValue value;

    public HtmlAttributeDefinition5(AttributeValue value) {
        this.value = value;
    }

    public AttributeValue getValue() {
        return value;
    }

    @Override
    public void PrintAst() {
        System.out.println("HtmlAttributeDefinition5:");
        if (value != null) {
            System.out.print("  ");
            value.PrintAst();
        }
    }

    @Override
    public String generate() {
        return value != null ? value.generate() : "";
    }

    @Override
    public String generateHtml() {
        return value != null ? value.generateHtml() : "";
    }


}
