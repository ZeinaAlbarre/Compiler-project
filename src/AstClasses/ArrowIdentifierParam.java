package AstClasses;

public class ArrowIdentifierParam extends ArrowParam {
    private String name;
    private TypeAnnotation type;

    public ArrowIdentifierParam(String name, TypeAnnotation type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public void PrintAst() {
        System.out.print("ArrowIdentifierParam: " + name);
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