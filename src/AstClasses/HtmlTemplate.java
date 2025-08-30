package AstClasses;

public abstract class HtmlTemplate extends ASTNode{

    HtmlTemplateContent htmlTemplateContent;

    public HtmlTemplate getTemplateContentPartDefinition() {
        return htmlTemplateContent;
    }

    public void setHtmlTemplateContent(HtmlTemplateContent htmlTemplateContent) {
        this.htmlTemplateContent = htmlTemplateContent;
    }

    public void PrintAst() {
        if(htmlTemplateContent !=null) {
            htmlTemplateContent.PrintAst();
        }
    }
}
