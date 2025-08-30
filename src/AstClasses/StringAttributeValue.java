package AstClasses;

public class StringAttributeValue extends AttributeValue {
    public String value;

    public StringAttributeValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public void PrintAst() {
        System.out.print("\"" + value + "\"");
    }

    @Override
    public String generate() {
        return "\"" + value + "\"";
    }

    @Override
    public String generateHtml() {
        return generate();
    }


    @Override
    public String generateJs() {
        return generate();
    }
}
