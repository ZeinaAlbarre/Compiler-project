package AstClasses;

public class MultiplicativeExpr extends Expression {
    public Expression left;
    public String operator;
    public Expression right;

    public MultiplicativeExpr(Expression left, String operator, Expression right) {
        this.left = left;
        this.operator = operator;
        this.right = right;
    }

    @Override
    public void PrintAst() {
        System.out.println("MultiplicativeExpr (" + operator + "):");
        if (left != null) left.PrintAst();
        if (right != null) right.PrintAst();
    }

    @Override
    public String generate() {
        String leftStr = (left != null) ? left.generate() : "";
        String rightStr = (right != null) ? right.generate() : "";
        return leftStr + " " + operator + " " + rightStr;
    }


}
