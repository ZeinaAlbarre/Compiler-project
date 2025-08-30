package AstClasses;

public class TemplateDefinition extends TemplateProperty {
    private TemplateString templateString;

    public TemplateString getTemplateString() {
        return templateString;
    }

    public void setTemplateString(TemplateString templateString) {
        this.templateString = templateString;
    }

    @Override
    public void PrintAst() {
        System.out.println("template:");
        if (templateString != null) {
            templateString.PrintAst();
        }
    }

    @Override
    public String generate() {
        return "template: " + (templateString != null ? templateString.generate() : "``");
    }

    @Override
    public String generateHtml() {
        return templateString != null ? templateString.generateHtml() : "";
    }


    @Override
    public String generateJs() {
        return "// " + generate();
    }
}
