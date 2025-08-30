package AstClasses;

public class AssignmentExpr extends Expression {
    private final Expression left;
    private final Expression right;

    public AssignmentExpr(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public Expression getLeft()  { return left; }
    public Expression getRight() { return right; }

    @Override
    public void PrintAst() {
        System.out.println("AssignmentExpr:");
        System.out.print("  Left: ");
        if (left != null) left.PrintAst(); else System.out.println("<null>");
        System.out.print("  = Right: ");
        if (right != null) right.PrintAst(); else System.out.println("<null>");
    }

    @Override
    public String generate() {
        String l = left  != null ? left.generate()  : "";
        String r = right != null ? right.generate() : "";
        return l + " = " + r;
    }

    @Override
    public String generateJs() { return generate(); }
}