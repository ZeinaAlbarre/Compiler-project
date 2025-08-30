package AstClasses;

public class RoundType2 extends PrimaryExpression {
    private final String typeName;
    private final boolean nullable;

    public RoundType2(String typeName, boolean nullable) {
        this.typeName = typeName;
        this.nullable = nullable;
    }

    public String getTypeName() {
        return typeName;
    }

    public boolean isNullable() {
        return nullable;
    }

    @Override
    public void PrintAst() {
        if (nullable) {
            System.out.println("RoundType2 { type=" + typeName + " | null }");
        } else {
            System.out.println("RoundType2 { type=" + typeName + " }");
        }
    }

    @Override
    public String generate() {
        return nullable ? typeName + " | null" : typeName;
    }

    @Override
    public String generateJs() {
        return "";
    }

    @Override
    public String generateHtml() { return ""; }

    @Override
    public String generateCss() { return ""; }
}
