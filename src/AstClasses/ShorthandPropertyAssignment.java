package AstClasses;

public class ShorthandPropertyAssignment extends PropertyAssignment {
    public String identifier;

    public ShorthandPropertyAssignment(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public void PrintAst() {
        System.out.println("ShorthandProperty: " + identifier);
    }

    @Override
    public String generate() {
        return identifier;
    }

    @Override
    public String generateJs() {
        return identifier;
    }


}
