package AstClasses;

public class RoundType extends TypeAnnotation {
    private final boolean nullable;

    public RoundType(String type, boolean nullable) {
        super(nullable ? (type + " | null") : type);
        this.nullable = nullable;
    }

    public boolean isNullable() { return nullable; }

    @Override
    public void PrintAst() {
        System.out.println("RoundType { type=" + getType() + " }");
    }

    @Override
    public String generate() { return getType(); }

}
