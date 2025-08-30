package AstClasses;

public class ArrowObjectBody extends ArrowBody {
    private final ObjectLiteral objectLiteral;

    public ArrowObjectBody(ObjectLiteral objectLiteral) {
        this.objectLiteral = objectLiteral;
    }

    public ObjectLiteral getObjectLiteral() {
        return objectLiteral;
    }

    @Override
    public void PrintAst() {
        System.out.println("ArrowObjectBody:");
        if (objectLiteral != null) {
            objectLiteral.PrintAst();
        }
    }
    @Override
    public String generate() {
        return objectLiteral != null ? objectLiteral.generate() : "{}";
    }

    @Override
    public String generateJs() {
        return generate();
    }


}