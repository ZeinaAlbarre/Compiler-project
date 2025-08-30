package AstClasses;

public abstract class TemplateString extends ASTNode{

    TemplateStringDefinition templateStringDefinition;

    public TemplateStringDefinition getTemplateStringDefinition() {
        return templateStringDefinition;
    }

    public void setTemplateStringDefinition(TemplateStringDefinition templateStringDefinition) {
        this.templateStringDefinition = templateStringDefinition;
    }

    public void PrintAst() {
        if(templateStringDefinition !=null) {
            templateStringDefinition.PrintAst();
        }
    }
}
