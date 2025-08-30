package AstClasses;

public class NgStyleDirectiveDefinition extends NgStyleDirective {
    private String directiveName;
    private Expression expression;

    public String getDirectiveName() {
        return directiveName;
    }

    public void setDirectiveName(String directiveName) {
        this.directiveName = directiveName;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public void PrintAst() {
        System.out.print("[ngStyle]=\"");
        if (expression != null) {
            expression.PrintAst();
        }
        System.out.print("\"");
    }

    @Override
    public String generate() {
        return "[ngStyle]=\"" + (expression != null ? expression.generate() : "") + "\"";
    }

    @Override
    public String generateHtml() {
        return generate();
    }


    @Override
    public String generateJs() {
        return "// " + generate();
    }
}
