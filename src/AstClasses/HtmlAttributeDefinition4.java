package AstClasses;

public class HtmlAttributeDefinition4 extends HtmlAttribute {
    public String name;
    public String value;

    public HtmlAttributeDefinition4(String name, String value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public void PrintAst() {
        System.out.print(name + "=\"" + value + "\"");
    }

    @Override
    public String generate() {
        return name + "=\"" + value + "\"";
    }

    @Override
    public String generateHtml() {
        return generate();
    }


}
