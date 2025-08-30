package AstClasses;

import java.util.ArrayList;
import java.util.List;

public class PareceExpr extends PrimaryExpression {
    private static class Item {
        final Expression expr;
        final boolean hasSemi;
        Item(Expression e, boolean s) { this.expr = e; this.hasSemi = s; }
    }

    private final List<Item> items = new ArrayList<>();
    private final boolean hasArrow;

    public PareceExpr(boolean hasArrow) {
        this.hasArrow = hasArrow;
    }

    public void addExpression(Expression expr, boolean hasSemi) {
        if (expr != null) items.add(new Item(expr, hasSemi));
    }

    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        sb.append("{ ");
        for (int i = 0; i < items.size(); i++) {
            if (i > 0) sb.append(" ");
            String part = items.get(i).expr.generate().trim();
            sb.append(part);
            if (items.get(i).hasSemi) sb.append(";");
        }
        sb.append(" }");
        return sb.toString();
    }

    @Override
    public String generateJs() { return generate(); }
}