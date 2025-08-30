package AstClasses;

public abstract class PropertyDeclaration extends ASTNode{
    PropertyDefinition propertyDefinition;

    public PropertyDefinition getPropertyDefinition() {
        return propertyDefinition;
    }

    public void setPropertyDefinition(PropertyDefinition propertyDefinition) {
        this.propertyDefinition = propertyDefinition;
    }

    public void PrintAst() {
        if (propertyDefinition != null) {
            propertyDefinition.PrintAst();
        }
    }
}
