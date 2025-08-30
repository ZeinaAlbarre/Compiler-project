package AstClasses;

public class ArrowParenObjectBody extends ArrowBody {
    private final ObjectLiteral objectLiteral;

    public ArrowParenObjectBody(ObjectLiteral objectLiteral) {
        this.objectLiteral = objectLiteral;
    }

    public ObjectLiteral getObjectLiteral() {
        return objectLiteral;
    }

    @Override
    public void PrintAst() {
        System.out.println("ArrowParenObjectBody:");
        if (objectLiteral != null) {
            objectLiteral.PrintAst();
        }
    }
    @Override
    public String generate() {
        return "(" + (objectLiteral != null ? objectLiteral.generate() : "{}") + ")";
    }

    @Override
    public String generateJs() {
        return generate();
    }


}