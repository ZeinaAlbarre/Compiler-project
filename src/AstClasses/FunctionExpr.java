package AstClasses;

public class FunctionExpr extends Expression {
    public Expression callee;
    public Expression argument;
    public Expression body;

    public FunctionExpr(Expression callee, Expression argument, Expression body) {
        this.callee = callee;
        this.argument = argument;
        this.body = body;
    }

    @Override
    public void PrintAst() {
        System.out.println("FunctionExpr:");
        if (callee != null) callee.PrintAst(); else System.out.println("<null-callee>");
        System.out.println("(");
        if (argument != null) argument.PrintAst(); else System.out.println("<null-arg>");
        System.out.println(") {");
        if (body != null) body.PrintAst(); else System.out.println("<null-body>");
        System.out.println("}");
    }

    @Override
    public String generate() {
        return (callee != null ? callee.generate() : "") +
                "(" + (argument != null ? argument.generate() : "") + ") {" +
                (body != null ? body.generate() : "") +
                "}";
    }



    @Override
    public String generateJs() {
        return generate(); }
}
