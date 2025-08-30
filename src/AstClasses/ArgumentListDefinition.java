package AstClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArgumentListDefinition extends ArgumentList{
    public List<Expression> expressions;

    public List<Expression> getExpressions() {
        return expressions;
    }

    public void setExpressions(List<Expression> expressions) {
        this.expressions = expressions;
    }

    public ArgumentListDefinition() {
        this.expressions = new ArrayList<>();
    }

    public void addExpression(Expression expr) {
        expressions.add(expr);
    }

    public void PrintAst() {
        System.out.println("ArgumentList:");
        for (Expression expr : expressions) {
            expr.PrintAst();
        }
    }
    @Override
    public String generate() {
        if (expressions == null || expressions.isEmpty()) return "";
        return String.join(", ",
                expressions.stream()
                        .map(Expression::generate)
                        .collect(Collectors.toList())
        );
    }

    @Override
    public String generateJs() {
        if (expressions == null || expressions.isEmpty()) return "";
        return String.join(", ",
                expressions.stream()
                        .map(Expression::generateJs)
                        .collect(Collectors.toList())
        );
    }


}
