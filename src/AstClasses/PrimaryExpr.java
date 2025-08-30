package AstClasses;

public class PrimaryExpr extends Expression {
    public PrimaryExpression primaryExpression;

    public PrimaryExpr(PrimaryExpression primaryExpression) {
        this.primaryExpression = primaryExpression;
    }

    @Override
    public void PrintAst() {
        System.out.println("PrimaryExpr:");
        if (primaryExpression != null) {
            primaryExpression.PrintAst();
        }
    }

    @Override
    public String generate() {
        return (primaryExpression != null) ? primaryExpression.generate() : "";
    }


}
