package AstClasses;

public class ObjectExpr extends PrimaryExpression {
    public ObjectLiteral objectLiteral;

    public void setObjectLiteral(ObjectLiteral objectLiteral) {
        this.objectLiteral = objectLiteral;
    }

    public ObjectLiteral getObjectLiteral() {
        return objectLiteral;
    }

    @Override
    public void PrintAst() {
        System.out.println("ObjectExpr:");
        if (objectLiteral != null)
            objectLiteral.PrintAst();
    }

    @Override
    public String generate() {
        return objectLiteral != null ? objectLiteral.generate() : "{}";
    }

    @Override
    public String generateJs() {
        return objectLiteral != null ? objectLiteral.generateJs() : "{}";
    }

    @Override
    public String generateHtml() { return ""; }

    @Override
    public String generateCss() { return ""; }
}
