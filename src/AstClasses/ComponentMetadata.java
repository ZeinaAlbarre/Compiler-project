package AstClasses;

public abstract class ComponentMetadata extends ASTNode{
    ComponentMetadataContent componentMetadataContent;

    public ComponentMetadataContent getComponentMetadataContent() {
        return componentMetadataContent;
    }

    public void setComponentMetadataContent(ComponentMetadataContent componentMetadataContent) {
        this.componentMetadataContent = componentMetadataContent;
    }

    @Override
    public void PrintAst() {
        if(componentMetadataContent!=null) {
            componentMetadataContent.PrintAst();
        }
    }
}
