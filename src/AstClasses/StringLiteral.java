package AstClasses;

public class StringLiteral extends Literal {
    private final String value;
    private final char quoteChar;

    public StringLiteral(String value, char quoteChar) {
        this.value = value;
        this.quoteChar = quoteChar;
    }

    public String getValue()      { return value; }
    public char   getQuoteChar()  { return quoteChar; }

    @Override
    public void PrintAst() {
        System.out.println("StringLiteral: " + quoteChar + value + quoteChar);
    }

    @Override
    public String generate() {
        return quoteChar + value + quoteChar;
    }

    @Override
    public String generateJs() {
        return generate();
    }

    @Override
    public String generateHtml() {
        return value != null ? value : "";
    }

    @Override
    public String generateCss() {
        return "";
    }
}