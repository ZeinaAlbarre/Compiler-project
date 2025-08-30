package AstClasses;

public class TemplateExpr extends PrimaryExpression {
    public TemplateString templateString;

    public void setTemplateString(TemplateString templateString) {
        this.templateString = templateString;
    }

    @Override
    public void PrintAst() {
        System.out.println("TemplateExpr:");
        if (templateString != null)
            templateString.PrintAst();
    }

    @Override
    public String generate() {
        return templateString != null ? templateString.generate() : "";
    }

    @Override
    public String generateJs() {
        return templateString != null ? templateString.generateJs() : "";
    }

    @Override
    public String generateHtml() {
        return templateString != null ? templateString.generateHtml() : "";
    }


}
