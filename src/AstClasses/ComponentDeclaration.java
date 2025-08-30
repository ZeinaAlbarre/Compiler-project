package AstClasses;

public abstract class ComponentDeclaration extends ASTNode{

    ComponentDefinition componentDefinition;

    public ComponentDefinition getComponentDefinition() {
        return componentDefinition;
    }

    public void setComponentDefinition(ComponentDefinition componentDefinition) {
        this.componentDefinition = componentDefinition;
    }


    @Override
    public void PrintAst() {
        if(componentDefinition!=null) {
            componentDefinition.PrintAst();
        }
    }
}
