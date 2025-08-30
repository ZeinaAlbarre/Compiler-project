package AstClasses;

public class SimpleType extends TypeAnnotation {
    private final String name;

    public SimpleType(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void PrintAst() {
        System.out.println("SimpleType: " + name);
    }

    @Override
    public String generate() { return name; }

}
