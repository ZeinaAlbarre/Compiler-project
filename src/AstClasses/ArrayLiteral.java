package AstClasses;

public abstract class ArrayLiteral extends PrimaryExpression {
    ArrayLiteralDefinition arrayLiteralDefinition;

    public ArrayLiteralDefinition getArrayLiteralDefinition() {
        return arrayLiteralDefinition;
    }

    public void setArrayLiteralDefinition(ArrayLiteralDefinition arrayLiteralDefinition) {
        this.arrayLiteralDefinition = arrayLiteralDefinition;
    }
    public void PrintAst() {
        if (arrayLiteralDefinition != null) {
            arrayLiteralDefinition.PrintAst();
        }
    }
}
