package AstClasses;

public class LogicalExpr extends Expression {
    private final Expression left;
    private final String op;
    private final Expression right;

    public LogicalExpr(Expression left, String op, Expression right) {
        this.left = left;
        this.op = op;
        this.right = right;
    }

    public Expression getLeft()  { return left; }
    public Expression getRight() { return right; }
    public String getOp()        { return op; }

    @Override
    public void PrintAst() {
        System.out.println("LogicalExpr:");
        System.out.print("  Left: ");
        if (left != null) left.PrintAst(); else System.out.println("<null>");
        System.out.println("  Op: " + op);
        System.out.print("  Right: ");
        if (right != null) right.PrintAst(); else System.out.println("<null>");
    }

    @Override
    public String generate() {
        String l = left  != null ? left.generate()  : "";
        String r = right != null ? right.generate() : "";
        return l + " " + op + " " + r;
    }

    @Override
    public String generateJs() { return generate(); }
}