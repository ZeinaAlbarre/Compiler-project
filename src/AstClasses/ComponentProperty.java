package AstClasses;

public abstract class ComponentProperty extends ASTNode{

    ComponentSelector componentSelector;
    ComponentTemplate componentTemplate;
    ComponentStyle componentStyle;
    StyleProperty styleProperty;
    Ex ex;

    public ComponentSelector getComponentSelector() {
        return componentSelector;
    }

    public void setComponentSelector(ComponentSelector componentSelector) {
        this.componentSelector = componentSelector;
    }

    public ComponentTemplate getComponentTemplate() {
        return componentTemplate;
    }

    public void setComponentTemplate(ComponentTemplate componentTemplate) {
        this.componentTemplate = componentTemplate;
    }

    public ComponentStyle getComponentStyle() {
        return componentStyle;
    }

    public void setComponentStyle(ComponentStyle componentStyle) {
        this.componentStyle = componentStyle;
    }

    public Ex getEx() {
        return ex;
    }

    public void setEx(Ex ex) {
        this.ex = ex;
    }

    public StyleProperty getStyleProperty() {
        return styleProperty;
    }

    public void setStyleProperty(StyleProperty styleProperty) {
        this.styleProperty = styleProperty;
    }

    public abstract String getKey();
    @Override
    public void PrintAst() {
        if(componentSelector !=null) {
            componentSelector.PrintAst();
        }
        if(componentTemplate !=null) {
            componentTemplate.PrintAst();
        }
        if(componentStyle !=null) {
            componentStyle.PrintAst();
        }
        if(styleProperty !=null) {
            styleProperty.PrintAst();
        }
        if(ex !=null) {
            ex.PrintAst();
        }
    }
}
