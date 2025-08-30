package AstClasses;

public class DotExpr extends Expression {
    private Expression target;
    private String property;
    private boolean optionalBefore;
    private boolean optionalAfter;
    private boolean callAfter;

    public DotExpr(Expression target, String property,
                   boolean optionalBefore,
                   boolean optionalAfter,
                   boolean callAfter) {
        this.target = target;
        this.property = property;
        this.optionalBefore = optionalBefore;
        this.optionalAfter = optionalAfter;
        this.callAfter = callAfter;
    }

    public Expression getTarget() {
        return target;
    }

    public String getProperty() {
        return property;
    }

    public boolean isOptionalBefore() {
        return optionalBefore;
    }

    public boolean isOptionalAfter() {
        return optionalAfter;
    }

    public boolean isCallAfter() {
        return callAfter;
    }

    @Override
    public void PrintAst() {
        System.out.println("DotExpr:");
        System.out.print("  Target: ");
        if (target != null) target.PrintAst();
        System.out.println("  Property: " +
                (optionalBefore ? "?." : ".") +
                property +
                (optionalAfter ? "?." : "") +
                (callAfter ? "()" : ""));
    }

    @Override
    public String generate() {

        StringBuilder sb = new StringBuilder();
        sb.append(target != null ? target.generate() : "");
        sb.append(optionalBefore ? "?." : ".");

        sb.append(property);

        if (callAfter) sb.append("()");

        if (optionalAfter) sb.append("?");

        return sb.toString();
    }

    @Override
    public String generateJs() {
        return generate();
    }
}
