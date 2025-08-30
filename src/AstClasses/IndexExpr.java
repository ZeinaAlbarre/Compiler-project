package AstClasses;

public class IndexExpr extends Expression {
    public Expression array;
    public Expression index;

    public IndexExpr(Expression array, Expression index) {
        this.array = array;
        this.index = index;
    }

    @Override
    public void PrintAst() {
        System.out.println("IndexExpr:");
        if (array != null) array.PrintAst();
        System.out.print("[");
        if (index != null) index.PrintAst();
        System.out.println("]");
    }

    @Override
    public String generate() {
        String arr = (array != null) ? array.generate() : "";
        String idx = (index != null) ? index.generate() : "";
        return arr + "[" + idx + "]";
    }


}
