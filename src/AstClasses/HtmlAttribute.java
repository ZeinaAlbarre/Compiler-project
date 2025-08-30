package AstClasses;

public abstract class HtmlAttribute extends ASTNode{
    HtmlAttributeDefinition1 htmlAttributeDefinition1;
    HtmlAttributeDefinition2 htmlAttributeDefinition2;
    HtmlAttributeDefinition3 htmlAttributeDefinition3;
    HtmlAttributeDefinition4 htmlAttributeDefinition4;

    public HtmlAttributeDefinition1 getHtmlAttributeDefinition1() {
        return htmlAttributeDefinition1;
    }

    public void setHtmlAttributeDefinition1(HtmlAttributeDefinition1 htmlAttributeDefinition1) {
        this.htmlAttributeDefinition1 = htmlAttributeDefinition1;
    }

    public HtmlAttributeDefinition2 getHtmlAttributeDefinition2() {
        return htmlAttributeDefinition2;
    }

    public void setHtmlAttributeDefinition2(HtmlAttributeDefinition2 htmlAttributeDefinition2) {
        this.htmlAttributeDefinition2 = htmlAttributeDefinition2;
    }

    public HtmlAttributeDefinition3 getHtmlAttributeDefinition3() {
        return htmlAttributeDefinition3;
    }

    public void setHtmlAttributeDefinition3(HtmlAttributeDefinition3 htmlAttributeDefinition3) {
        this.htmlAttributeDefinition3 = htmlAttributeDefinition3;
    }

    public HtmlAttributeDefinition4 getHtmlAttributeDefinition4() {
        return htmlAttributeDefinition4;
    }

    public void setHtmlAttributeDefinition4(HtmlAttributeDefinition4 htmlAttributeDefinition4) {
        this.htmlAttributeDefinition4 = htmlAttributeDefinition4;
    }

    @Override
    public void PrintAst() {
        if(htmlAttributeDefinition1 !=null) {
            htmlAttributeDefinition1.PrintAst();
        } if(htmlAttributeDefinition2 !=null) {
            htmlAttributeDefinition2.PrintAst();
        } if(htmlAttributeDefinition3 !=null) {
            htmlAttributeDefinition3.PrintAst();
        } if(htmlAttributeDefinition4 !=null) {
            htmlAttributeDefinition4.PrintAst();
        }
    }
}
