package AstClasses;

public abstract class Expression extends ASTNode {
    public PrimaryExpr primaryExpr;
    public DotExpr dotExpr;
    public IndexExpr indexExpr;
    public CallExpr callExpr;
    public MultiplicativeExpr multiplicativeExpr;
    public AdditiveExpr additiveExpr;
    public ComparisonExpr comparisonExpr;
    public AssignmentExpr assignmentExpr;
    public ColonExpr colonExpr;
    public LogicalExpr logicalExpr;
    public AssignArrayExpr assignArrayExpr;
    public FunctionExpr functionExpr;
    public OnExpr onExpression;
    public ArrowExpr arrowExpression;

    public ReturnStatement returnStatement;

    public void setPrimaryExpr(PrimaryExpr primaryExpr) {
        this.primaryExpr = primaryExpr;
    }

    public void setDotExpr(DotExpr dotExpr) {
        this.dotExpr = dotExpr;
    }

    public void setIndexExpr(IndexExpr indexExpr) {
        this.indexExpr = indexExpr;
    }

    public void setCallExpr(CallExpr callExpr) {
        this.callExpr = callExpr;
    }

    public void setMultiplicativeExpr(MultiplicativeExpr multiplicativeExpr) {
        this.multiplicativeExpr = multiplicativeExpr;
    }

    public void setAdditiveExpr(AdditiveExpr additiveExpr) {
        this.additiveExpr = additiveExpr;
    }

    public void setComparisonExpr(ComparisonExpr comparisonExpr) {
        this.comparisonExpr = comparisonExpr;
    }

    public void setAssignmentExpr(AssignmentExpr assignmentExpr) {
        this.assignmentExpr = assignmentExpr;
    }

    public void setColonExpr(ColonExpr colonExpr) {
        this.colonExpr = colonExpr;
    }

    public void setLogicalExpr(LogicalExpr logicalExpr) {
        this.logicalExpr = logicalExpr;
    }

    public void setAssignArrayExpr(AssignArrayExpr assignArrayExpr) {
        this.assignArrayExpr = assignArrayExpr;
    }

    public void setFunctionExpr(FunctionExpr functionExpr) {
        this.functionExpr = functionExpr;
    }

    public void setOnExpression(OnExpr onExpression) {
        this.onExpression = onExpression;
    }

    public void setArrowExpr(ArrowExpr arrowExpression) {
        this.arrowExpression = arrowExpression;
    }

    public void setArrowExpression(ArrowExpr arrowExpression) {
        this.arrowExpression = arrowExpression;
    }

    public void setReturnStatement(ReturnStatement returnStatement) {
        this.returnStatement = returnStatement;
    }

    @Override
    public void PrintAst() {
        if (primaryExpr != null) primaryExpr.PrintAst();
        if (dotExpr != null) dotExpr.PrintAst();
        if (indexExpr != null) indexExpr.PrintAst();
        if (callExpr != null) callExpr.PrintAst();
        if (multiplicativeExpr != null) multiplicativeExpr.PrintAst();
        if (additiveExpr != null) additiveExpr.PrintAst();
        if (comparisonExpr != null) comparisonExpr.PrintAst();
        if (assignmentExpr != null) assignmentExpr.PrintAst();
        if (colonExpr != null) colonExpr.PrintAst();
        if (logicalExpr != null) logicalExpr.PrintAst();
        if (assignArrayExpr != null) assignArrayExpr.PrintAst();
        if (functionExpr != null) functionExpr.PrintAst();
        if (onExpression != null) onExpression.PrintAst();
        if (arrowExpression != null) arrowExpression.PrintAst();
        if (returnStatement != null) returnStatement.PrintAst();

    }
}
