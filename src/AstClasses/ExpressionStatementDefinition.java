package AstClasses;
public class ExpressionStatementDefinition extends ExpressionStatement {
    private Expression expression;
    private boolean hasSemicolon;

    public void setExpression(Expression expression) { this.expression = expression; }
    public void setHasSemicolon(boolean hasSemicolon) { this.hasSemicolon = hasSemicolon; }

    @Override
    public void PrintAst() {
        if (expression != null) {
            expression.PrintAst();
            System.out.println(";");
        }
    }

    @Override
    public String generate() {
        if (expression == null) return hasSemicolon ? ";" : "";
        String code = String.valueOf(expression.generate()).trim();
        boolean endsWithSemi = code.endsWith(";");
        if (hasSemicolon) return endsWithSemi ? code : (code + ";");
        return endsWithSemi ? code.substring(0, code.length() - 1) : code;
    }

    @Override
    public String generateJs() { return generate(); }

    @Override
    public String generateCss() {
        if (expression == null) return "";
        if (expression instanceof ColonExpr) {
            String line = expression.generate();
            line = line.replace(" : ", ": ").replace(" :", ": ");
            if (!line.trim().endsWith(";")) line += ";";
            return line;
        }
        return "";
    }
}