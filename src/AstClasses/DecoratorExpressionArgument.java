package AstClasses;

public class DecoratorExpressionArgument extends DecoratorArguments {
    private Expression expression;

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public void PrintAst() {
        System.out.println("DecoratorExpressionArgument:");
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
        return expression != null ? expression.generateJs() : "";
    }

    @Override
    public String generateHtml() { return ""; }

    @Override
    public String generateCss() { return ""; }

}
