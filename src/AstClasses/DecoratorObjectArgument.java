package AstClasses;

public class DecoratorObjectArgument extends DecoratorArguments {
    private ObjectLiteral objectLiteral;

    public ObjectLiteral getObjectLiteral() {
        return objectLiteral;
    }

    public void setObjectLiteral(ObjectLiteral objectLiteral) {
        this.objectLiteral = objectLiteral;
    }

    @Override
    public void PrintAst() {
        System.out.println("DecoratorObjectArgument:");
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
        return objectLiteral != null ? objectLiteral.generateJs() : "{}";
    }


}
