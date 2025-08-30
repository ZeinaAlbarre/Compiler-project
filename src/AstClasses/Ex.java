package AstClasses;

public class Ex extends ComponentProperty {
    private final Expression expression;

    public Ex(Expression expression) {
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }

    @Override
    public String getKey() {
        return "Expression";
    }

    @Override
    public void PrintAst() {
        System.out.println("Expression:");
        if (expression != null) {
            expression.PrintAst();
        }
    }

    @Override
    public String generate() {
        return expression != null ? expression.generate() : "";
    }



    @Override
    public String generateCss() {
        return expression != null ? expression.generateCss() : "";
    }

    @Override
    public String generateJs() {
        return  generate();
    }
}
