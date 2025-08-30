package AstClasses;

public class ComparisonExpr extends Expression {
    public Expression left;
    public String operator;
    public Expression right;

    public ComparisonExpr(Expression left, String operator, Expression right) {
        this.left = left;
        this.operator = operator;
        this.right = right;
    }

    @Override
    public String generate() {
        try {
            if (">".equals(operator) && right instanceof PrimaryExpr) {
                PrimaryExpr rPrim = (PrimaryExpr) right;
                if (rPrim.primaryExpression instanceof AllparenExpr) {
                    if (left instanceof ComparisonExpr) {
                        ComparisonExpr leftCmp = (ComparisonExpr) left;
                        if ("<".equals(leftCmp.operator)) {
                            String callee = (leftCmp.left != null) ? leftCmp.left.generate() : "";
                            String typeArg = (leftCmp.right != null) ? leftCmp.right.generate() : "";
                            return callee + "<" + typeArg + ">()";
                        }
                    }
                }
            }
        } catch (Exception ignore) {
        }

        String l = (left != null) ? left.generate() : "";
        String r = (right != null) ? right.generate() : "";
        return l + " " + operator + " " + r;
    }

    @Override
    public void PrintAst() {
        System.out.println("ComparisonExpr (" + operator + "):");
        if (left != null) left.PrintAst();
        if (right != null) right.PrintAst();
    }
}