package AstClasses;

public class ArrowExpr extends Expression {
    public ArrowFunction arrowFunction;

    public ArrowExpr(ArrowFunction arrowFunction) {
        this.arrowFunction = arrowFunction;
    }

    @Override
    public void PrintAst() {
        System.out.println("Arrow Func:");
        if (arrowFunction != null) {
            arrowFunction.PrintAst();
        }
    }

    @Override
    public String generate() {
        return (arrowFunction != null) ? arrowFunction.generate() : "";
    }


}
