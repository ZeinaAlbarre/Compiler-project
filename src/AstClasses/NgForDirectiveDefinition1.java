package AstClasses;

import java.util.ArrayList;
import java.util.List;

public class NgForDirectiveDefinition1 extends NgDirective {
    public String loopVariable;
    public List<Expression> expressions;

    public NgForDirectiveDefinition1(String loopVariable, Expression iterable) {
        this.loopVariable = loopVariable;
        this.expressions = new ArrayList<>();
        if (iterable != null) this.expressions.add(iterable);
    }

    public void setExpressions(Expression expression) {
        if (expression != null) expressions.add(expression);
    }

    @Override
    public void PrintAst() {
        System.out.print("*ngFor=\"let " + loopVariable + " of ");
        if (expressions != null && !expressions.isEmpty()) {
            expressions.get(0).PrintAst();
        }
        System.out.print("\"");
    }

    @Override
    public String generate() {
        String exprStr = (expressions != null && !expressions.isEmpty())
                ? expressions.get(0).generate()
                : "";
        return "*ngFor=\"let " + loopVariable + " of " + exprStr + "\"";
    }

    @Override
    public String generateHtml() {
        return generate();
    }


    @Override
    public String generateJs() {
        return  generate();
    }
}
