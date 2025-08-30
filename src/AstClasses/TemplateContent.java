package AstClasses;

public abstract class TemplateContent extends ASTNode{
    TemplateContentPartDefinition templateContentPartDefinition;

    public TemplateContentPartDefinition getTemplateContentPartDefinition() {
        return templateContentPartDefinition;
    }

    public void setTemplateContentPartDefinition(TemplateContentPartDefinition templateContentPartDefinition) {
        this.templateContentPartDefinition = templateContentPartDefinition;
    }

    public void PrintAst() {
        if (templateContentPartDefinition != null) {
            templateContentPartDefinition.PrintAst();
        }
    }
}
