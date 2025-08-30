package AstClasses;

public abstract class ExpressionStatement extends StmtExpression{
    ExpressionStatementDefinition expressionStatementDefinition;

    public ExpressionStatementDefinition getExpressionStatementDefinition() {
        return expressionStatementDefinition;
    }

    public void setExpressionStatementDefinition(ExpressionStatementDefinition expressionStatementDefinition) {
        this.expressionStatementDefinition = expressionStatementDefinition;
    }
    public void PrintAst() {
        if (expressionStatementDefinition != null) {
            expressionStatementDefinition.PrintAst();
        }
    }


}
