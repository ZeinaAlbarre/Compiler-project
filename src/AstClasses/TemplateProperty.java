package AstClasses;

public abstract class TemplateProperty extends ASTNode{

    TemplateDefinition templateDefinition;

    public TemplateDefinition getTemplateDefinition() {
        return templateDefinition;
    }

    public void setTemplateDefinition(TemplateDefinition templateDefinition) {
        this.templateDefinition = templateDefinition;
    }

    public void PrintAst() {
        System.out.println("template : ");
        if(templateDefinition !=null) {
            templateDefinition.PrintAst();
        }
    }
}
