package AstClasses;

public class PropExpr extends Expression {
    private PropertyAssignment property;

    public PropExpr(PropertyAssignment property) {
        this.property = property;
    }

    public PropertyAssignment getProperty() {
        return property;
    }

    @Override
    public void PrintAst() {
        System.out.println("PropExpr:");
        if (property != null) {
            System.out.print("  ");
            property.PrintAst();
        }
    }

    @Override
    public String generate() {
        return property != null ? property.generate() : "";
    }


    @Override
    public String generateJs() {
        return generate();
    }
}
