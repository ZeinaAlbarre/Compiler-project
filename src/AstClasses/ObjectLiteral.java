package AstClasses;

public abstract class ObjectLiteral extends ASTNode{
    ObjectLiteralDefinition objectLiteralDefinition;

    public ObjectLiteralDefinition getObjectLiteralDefinition() {
        return objectLiteralDefinition;
    }

    public void setObjectLiteralDefinition(ObjectLiteralDefinition objectLiteralDefinition) {
        this.objectLiteralDefinition = objectLiteralDefinition;
    }
    public void PrintAst() {
        if (objectLiteralDefinition != null) {
            System.out.println("object Literal");
            objectLiteralDefinition.PrintAst();
        }
    }
}
