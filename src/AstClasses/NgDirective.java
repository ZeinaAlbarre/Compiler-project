package AstClasses;

public class NgDirective extends ASTNode{
    DirectiveNgFor directiveNgFor;
    DirectiveNgIf directiveNgIf;
    DirectiveNgStyle directiveNgStyle;

    public DirectiveNgStyle getDirectiveNgStyle() {
        return directiveNgStyle;
    }

    public void setDirectiveNgStyle(DirectiveNgStyle directiveNgStyle) {
        this.directiveNgStyle = directiveNgStyle;
    }

    public DirectiveNgFor getDirectiveNgFor() {
        return directiveNgFor;
    }

    public void setDirectiveNgFor(DirectiveNgFor directiveNgFor) {
        this.directiveNgFor = directiveNgFor;
    }

    public DirectiveNgIf getDirectiveNgIf() {
        return directiveNgIf;
    }

    public void setDirectiveNgIf(DirectiveNgIf directiveNgIf) {
        this.directiveNgIf = directiveNgIf;
    }

    @Override
    public void PrintAst() {
        if(directiveNgFor !=null) {
            directiveNgFor.PrintAst();
        }
        if(directiveNgIf !=null) {
            directiveNgIf.PrintAst();
        }
        if(directiveNgStyle !=null) {
            directiveNgStyle.PrintAst();
        }
    }
}
