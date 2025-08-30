package AstClasses;

import java.util.stream.Collectors;

public class ParenExpr extends PrimaryExpression {
    private final java.util.List<Expression> expressions = new java.util.ArrayList<>();

    private final boolean hasArrow;

    private final java.util.List<Boolean> semisAfterExpr = new java.util.ArrayList<>();

    private boolean semiBeforeRparen = false;

    private boolean semiAfterRparen = false;

    public ParenExpr(boolean hasArrow) { this.hasArrow = hasArrow; }

    public void addExpression(Expression expr, boolean hasSemiAfter) {
        if (expr != null) {
            expressions.add(expr);
            semisAfterExpr.add(hasSemiAfter);
        }
    }
    public void setSemiBeforeRparen(boolean v) { this.semiBeforeRparen = v; }
    public void setSemiAfterRparen(boolean v)   { this.semiAfterRparen  = v; }

    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        sb.append("(");

        if (!expressions.isEmpty()) {
            sb.append(expressions.get(0).generate());
        }
        if (hasArrow) sb.append(" => ");

        for (int i = 1; i < expressions.size(); i++) {
            String part = expressions.get(i).generate();
            sb.append(part);
            if (Boolean.TRUE.equals(semisAfterExpr.get(i))) {
                sb.append(";");
            }
            if (i < expressions.size() - 1) sb.append(" ");
        }

        if (semiBeforeRparen && (expressions.size() <= 1)) {
            sb.append(";");
        }

        sb.append(")");
        if (semiAfterRparen) sb.append(";");

        return sb.toString();
    }

    @Override
    public String generateJs() { return generate(); }
}