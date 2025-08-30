package AstClasses;

public class SpreadProperty extends PropertyAssignment {
    private String identifier;

    public SpreadProperty(String identifier) {
        this.identifier = identifier;
    }

    public String getIdentifier() {
        return identifier;
    }

    @Override
    public void PrintAst() {
        System.out.println("SpreadProperty: ..." + identifier);
    }

    @Override
    public String generate() {
        return "..." + identifier;
    }





    @Override
    public String generateJs() {
        return "..." + identifier;
    }
}
