package AstClasses;

public class ColonExpr extends Expression {
    public Expression left;
    public Expression right;

    public ColonExpr(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public void PrintAst() {
        System.out.println("ColonExpr:");
        if (left != null) left.PrintAst(); else System.out.println("<null>");
        System.out.print(" : ");
        if (right != null) right.PrintAst(); else System.out.println("<null>");
    }

    @Override
    public String generate() {
        return (left != null ? left.generate() : "") +
                " : " +
                (right != null ? right.generate() : "");
    }


    @Override
    public String generateJs() {
        return generate();
    }
}
