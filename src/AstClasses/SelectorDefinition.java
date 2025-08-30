package AstClasses;

public class SelectorDefinition extends SelectorProperty {

    public String StringLiteral;

    public SelectorDefinition(String value) {
        this.StringLiteral = value;
    }

    @Override
    public void PrintAst() {
        System.out.println("Selector: " + StringLiteral);
    }

    @Override
    public String generate() {
        return StringLiteral != null ? StringLiteral : "";
    }


    @Override
    public String generateJs() {
        return generate() + "\"";
    }
}
