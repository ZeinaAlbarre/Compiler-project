package AstClasses;

public class OnExpr extends Expression {
    public OnExpression onExpression;

    public OnExpr(OnExpression onExpression) {
        this.onExpression = onExpression;
    }

    @Override
    public void PrintAst() {
        System.out.println("PrimaryExpr:");
        if (onExpression != null) {
            onExpression.PrintAst();
        }
    }

    @Override
    public String generate() {
        return (onExpression != null) ? onExpression.generate() : "";
    }


}
