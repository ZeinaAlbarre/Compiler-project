package AstClasses;

public class ComponentTemplate extends ComponentProperty {
    private TemplateProperty templateProperty;

    public TemplateProperty getTemplateProperty() {
        return templateProperty;
    }

    public void setTemplateProperty(TemplateProperty templateProperty) {
        this.templateProperty = templateProperty;
    }

    @Override
    public String getKey() {
        return "template";
    }

    @Override
    public void PrintAst() {
        System.out.print("template:");
        if (templateProperty != null) {
            templateProperty.PrintAst();
        }
        System.out.println();
    }

    @Override
    public String generate() {
        return (templateProperty != null)
                ? templateProperty.generate()
                : "";
    }

    @Override
    public String generateHtml() {
        return (templateProperty != null)
                ? templateProperty.generateHtml()
                : "";
    }


    @Override
    public String generateJs() {
        return  generate();
    }
}
