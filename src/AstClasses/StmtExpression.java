package AstClasses;

import java.util.ArrayList;
import java.util.List;

public class StmtExpression extends Statement {
    public List<ExpressionStatement> expressionStatements;

    public StmtExpression() {
        this.expressionStatements = new ArrayList<>();
    }

    public void setExpressionStatements(ExpressionStatement expressionStatement) {
        expressionStatements.add(expressionStatement);
    }

    @Override
    public void PrintAst() {
        if (expressionStatements != null) {
            for (ExpressionStatement stmt : expressionStatements) {
                stmt.PrintAst();
            }
        }
    }

    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        if (expressionStatements != null) {
            for (ExpressionStatement stmt : expressionStatements) {
                sb.append(stmt.generate());
            }
        }
        return sb.toString();
    }


    @Override
    public String generateJs() {
        return generate().replace("\n", "\n// ");
    }
}
