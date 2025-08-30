package AstClasses;

public abstract class HtmlTag extends ASTNode{
    HtmlNgDirectiveElement htmlNgDirectiveElement;

    public HtmlNgDirectiveElement getHtmlNgDirectiveElement() {
        return htmlNgDirectiveElement;
    }

    public void setHtmlNgDirectiveElement(HtmlNgDirectiveElement htmlNgDirectiveElement) {
        this.htmlNgDirectiveElement = htmlNgDirectiveElement;
    }

    @Override
    public void PrintAst() {
        if(htmlNgDirectiveElement !=null) {
            htmlNgDirectiveElement.PrintAst();
        }
    }
}
