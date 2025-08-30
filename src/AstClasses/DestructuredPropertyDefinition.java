package AstClasses;

public class DestructuredPropertyDefinition extends DestructuredProperty {
    private final String name;
    private final TypeAnnotation type;

    public DestructuredPropertyDefinition(String name, TypeAnnotation type) {
        this.name = name;
        this.type = type;
    }

    public String getName() { return name; }
    public TypeAnnotation getType() { return type; }

    @Override
    public void PrintAst() {
        System.out.print("DestructuredPropertyDefinition: " + name);
        if (type != null) {
            System.out.print(" : ");
            type.PrintAst();
        }
        System.out.println();
    }
    @Override
    public String generate() {
        if (type != null) {
            return name + ": " + type.generate();
        }
        return name;
    }

    @Override
    public String generateJs() {
        return name;
    }



}
