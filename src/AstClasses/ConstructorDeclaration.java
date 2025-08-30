package AstClasses;

public abstract class ConstructorDeclaration extends ASTNode{
    ConstructorDefinition constructorDefinition;
    ConstructorDefinition2 constructorDefinition2;


    public ConstructorDefinition getConstructorDefinition() {
        return constructorDefinition;
    }

    public void setConstructorDefinition(ConstructorDefinition constructorDefinition) {
        this.constructorDefinition = constructorDefinition;
    }

    public ConstructorDefinition2 getConstructorDefinition2() {
        return constructorDefinition2;
    }

    public void setConstructorDefinition2(ConstructorDefinition2 constructorDefinition2) {
        this.constructorDefinition2 = constructorDefinition2;
    }

    public void PrintAst() {
        if (constructorDefinition != null) {
            constructorDefinition.PrintAst();
        }
        if (constructorDefinition2 != null) {
            constructorDefinition2.PrintAst();
        }
    }
}
