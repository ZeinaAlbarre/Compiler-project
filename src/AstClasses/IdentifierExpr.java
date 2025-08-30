package AstClasses;

public class IdentifierExpr extends PrimaryExpression {
    private final String name;
    private final int optionalCount;

    public IdentifierExpr(String name, int optionalCount) {
        this.name = name;
        this.optionalCount = optionalCount;
    }

    public String getName() {
        return name;
    }

    public int getOptionalCount() {
        return optionalCount;
    }

    @Override
    public void PrintAst() {
        String prefix = "";
        for (int i = 0; i < optionalCount; i++) {
            prefix += "?";
        }
        System.out.println("IdentifierExpr: " + prefix + name);
    }

    @Override
    public String generate() {
        StringBuilder prefix = new StringBuilder();
        for (int i = 0; i < optionalCount; i++) prefix.append("?");
        return prefix + name;
    }

    @Override
    public String generateJs() { return generate(); }


}
