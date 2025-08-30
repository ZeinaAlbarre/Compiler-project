package AstClasses;

public class ArrayExpr extends PrimaryExpression {
    public ArrayLiteral arrayLiteral;

    public void setArrayLiteral(ArrayLiteral arrayLiteral) {
        this.arrayLiteral = arrayLiteral;
    }

    @Override
    public void PrintAst() {
        System.out.println("ArrayExpr:");
        if (arrayLiteral != null)
            arrayLiteral.PrintAst();
    }

    @Override
    public String generate() {
        return arrayLiteral != null ? arrayLiteral.generate() : "[]";
    }

    @Override
    public String generateJs() {
        return arrayLiteral != null ? arrayLiteral.generateJs() : "[]";
    }

}
