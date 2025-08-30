package AstClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ForExpressionInitializer extends ForInitializer{
    public List<Expression> expressions;

    public ForExpressionInitializer() {
        this.expressions = new ArrayList<>();
    }

    public void addExpression(Expression expr) {
        expressions.add(expr);
    }

    public void PrintAst() {
        for (Expression expr : expressions) {
            expr.PrintAst();
        }
    }
    @Override
    public String generate() {
        return expressions.stream()
                .map(Expression::generate)
                .collect(Collectors.joining(", "));
    }

    @Override
    public String generateJs() { return generate(); }
    @Override
    public String generateHtml() { return ""; }
    @Override
    public String generateCss() { return ""; }
}
