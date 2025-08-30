package AstClasses;

public class InterfacePropertyDefinition extends InterfaceProperty {
    private final String name;
    private final TypeAnnotation type;

    public InterfacePropertyDefinition(String name, TypeAnnotation type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public void PrintAst() {
        System.out.print(name);
        if (type != null) {
            System.out.print(": ");
            type.PrintAst();
        }
    }

    @Override
    public String generate() {
        if (type != null) {
            return name + ": " + type.generate();
        }
        return name;
    }
}