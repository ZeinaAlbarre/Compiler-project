package AstClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ExpressionAttributeValue extends AttributeValue {
    public List<Expression> expressions;

    public ExpressionAttributeValue() {
        this.expressions = new ArrayList<>();
    }

    public void setHtmlElements(Expression expression) {
        if (expression != null) expressions.add(expression);
    }

    @Override
    public void PrintAst() {
        if (expressions != null) {
            for (Expression expression : expressions) {
                expression.PrintAst();
            }
        }
    }

    @Override
    public String generate() {
        return expressions.stream().map(Expression::generate).collect(Collectors.joining(" "));
    }

    @Override
    public String generateHtml() {
        return expressions.stream().map(Expression::generate).collect(Collectors.joining(" "));
    }

    @Override
    public String generateJs() { return generate(); }


}