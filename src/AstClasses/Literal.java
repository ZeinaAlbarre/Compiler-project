package AstClasses;

public abstract class Literal {
    StringLiteral stringLiteral;
    NumberLiteral numberLiteral;
    BooleanLiteral booleanLiteral;
    NullLiteral nullLiteral;

    public StringLiteral getStringLiteral() {
        return stringLiteral;
    }

    public void setStringLiteral(StringLiteral stringLiteral) {
        this.stringLiteral = stringLiteral;
    }

    public NumberLiteral getNumberLiteral() {
        return numberLiteral;
    }

    public void setNumberLiteral(NumberLiteral numberLiteral) {
        this.numberLiteral = numberLiteral;
    }

    public BooleanLiteral getBooleanLiteral() {
        return booleanLiteral;
    }

    public void setBooleanLiteral(BooleanLiteral booleanLiteral) {
        this.booleanLiteral = booleanLiteral;
    }

    public NullLiteral getNullLiteral() {
        return nullLiteral;
    }

    public void setNullLiteral(NullLiteral nullLiteral) {
        this.nullLiteral = nullLiteral;
    }

    public void PrintAst() {
        if (stringLiteral != null) {
            stringLiteral.PrintAst();
        }
        if (numberLiteral != null) {
            numberLiteral.PrintAst();
        }
        if (booleanLiteral != null) {
            booleanLiteral.PrintAst();
        }
        if (nullLiteral != null) {
            nullLiteral.PrintAst();
        }
    }

    public abstract String generate();
    public abstract String generateJs();
    public abstract String generateHtml();
    public abstract String generateCss();
}
