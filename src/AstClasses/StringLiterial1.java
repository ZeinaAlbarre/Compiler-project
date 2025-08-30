package AstClasses;

public class StringLiterial1 extends PrimaryExpression {
    private String value;
    private int optionalChainCount;

    public StringLiterial1(String raw, int count) {
        this.value = raw;
        this.optionalChainCount = count;
    }

    @Override
    public void PrintAst() {
        StringBuilder prefix = new StringBuilder();
        for (int i = 0; i < optionalChainCount; i++) {
            prefix.append("?");
        }
        System.out.println("StringLiteral: " + prefix + "'" + value + "'");
    }

    @Override
    public String generate() {
        StringBuilder prefix = new StringBuilder();
        for (int i = 0; i < optionalChainCount; i++) prefix.append("?");
        prefix.append(" ");
        return prefix + "'" + value + "';\n";
    }

    @Override
    public String generateJs() {
        StringBuilder prefix = new StringBuilder();
        for (int i = 0; i < optionalChainCount; i++) prefix.append("?");
        return prefix + "'" + value + "'";
    }

    @Override
    public String generateHtml() {
        return value;
    }


}