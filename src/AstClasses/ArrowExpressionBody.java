package AstClasses;

public class ArrowExpressionBody extends ArrowBody {
    private final Expression expression;

    public ArrowExpressionBody(Expression expression) {
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }

    @Override
    public void PrintAst() {
        System.out.println("ArrowExpressionBody:");
        if (expression != null) {
            expression.PrintAst();
        }
    }

    @Override
    public String generate() {
        return expression != null ? expression.generate() : "";
    }

    @Override
    public String generateJs() {
        return generate();
    }


}
