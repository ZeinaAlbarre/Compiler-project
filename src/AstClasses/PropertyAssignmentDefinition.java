package AstClasses;

public class PropertyAssignmentDefinition extends PropertyAssignment {
    public String key;
    private Expression value;

    public PropertyAssignmentDefinition(String key, Expression value) {
        this.key = key;
        this.value = value;
    }


    public String getKey() {
        return key;
    }

    public Expression getValue() {
        return value;
    }

    @Override
    public void PrintAst() {
        System.out.print(key + ": ");
        if (value != null) value.PrintAst();
    }

    @Override
    public String generate() {
        String val = (value != null) ? value.generate() : "undefined";
        return key + ": " + val;
    }


}
