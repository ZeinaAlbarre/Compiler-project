package AstClasses;

public class VariableExpression extends Expression {
    private String name;
    public VariableExpression(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "VariableExpression{name='" + name + "'}";
    }
}
