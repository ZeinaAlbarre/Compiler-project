package AstClasses;

public class ArrayType extends TypeAnnotation {
    private final String baseType;

    public ArrayType(String baseType) {
        super(baseType + "[]");
        this.baseType = baseType;
    }

    @Override
    public void PrintAst() {
        System.out.println("ArrayType: " + baseType + "[]");
    }

    @Override
    public String generate() { return baseType + "[]"; }
}
