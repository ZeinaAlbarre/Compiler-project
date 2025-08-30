package AstClasses;

public abstract class HtmlElement extends ASTNode{
    HtmlTagElement htmlTagElement;
    HtmlTemplateElement htmlTemplateElement;
    HtmlNgDirectiveElement htmlNgDirectiveElement;

    public HtmlTagElement getHtmlTagElement() {
        return htmlTagElement;
    }

    public void setHtmlTagElement(HtmlTagElement htmlTagElement) {
        this.htmlTagElement = htmlTagElement;
    }

    public HtmlTemplateElement getHtmlTemplateElement() {
        return htmlTemplateElement;
    }

    public void setHtmlTemplateElement(HtmlTemplateElement htmlTemplateElement) {
        this.htmlTemplateElement = htmlTemplateElement;
    }

    public HtmlNgDirectiveElement getHtmlNgDirectiveElement() {
        return htmlNgDirectiveElement;
    }

    public void setHtmlNgDirectiveElement(HtmlNgDirectiveElement htmlNgDirectiveElement) {
        this.htmlNgDirectiveElement = htmlNgDirectiveElement;
    }


    @Override
    public void PrintAst() {
        if(htmlTagElement !=null) {
            htmlTagElement.PrintAst();
        }
        if(htmlTemplateElement !=null) {
            htmlTemplateElement.PrintAst();
        }
        if(htmlNgDirectiveElement !=null) {
            htmlNgDirectiveElement.PrintAst();
        }
    }
}
