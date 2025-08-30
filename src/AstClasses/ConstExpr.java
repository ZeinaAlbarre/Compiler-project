package AstClasses;

public class ConstExpr extends PrimaryExpression {
    private final Expression expression;

    public ConstExpr(Expression expression) {
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }

    @Override
    public void PrintAst() {
        System.out.println("ConstExpr:");
        if (expression != null) {
            System.out.print("  ");
            expression.PrintAst();
        }
    }

    @Override
    public String generate() {
        return "const " + (expression != null ? expression.generate() : "") ;
    }

    @Override
    public String generateJs() {
        return "const (" + (expression != null ? expression.generateJs() : "") + ")";
    }


}
