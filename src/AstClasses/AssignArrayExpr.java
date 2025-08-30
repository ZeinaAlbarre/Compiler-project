package AstClasses;

public class AssignArrayExpr extends Expression {
    public Expression target;
    public String identifier;
    public Expression value;

    public AssignArrayExpr(Expression target, String identifier, Expression value) {
        this.target = target;
        this.identifier = identifier;
        this.value = value;
    }

    @Override
    public void PrintAst() {
        System.out.println("AssignArrayExpr:");
        if (target != null) target.PrintAst(); else System.out.println("<null-target>");
        System.out.println(":" + identifier + "[] = ");
        if (value != null) value.PrintAst(); else System.out.println("<null-value>");
    }

    @Override
    public String generate() {
        return (target != null ? target.generate() : "") +
                ":" + identifier + "[] = " +
                (value != null ? value.generate() : "");
    }


    @Override
    public String generateJs() {
        return generate();
    }
}
