package AstClasses;

public class NgStyleDirective extends ASTNode {
    NgStyleDirectiveDefinition ngStyleDirectiveDefinition;

    public NgStyleDirectiveDefinition getNgStyleDirectiveDefinition() {
        return ngStyleDirectiveDefinition;
    }

    public void setNgStyleDirectiveDefinition(NgStyleDirectiveDefinition ngStyleDirectiveDefinition) {
        this.ngStyleDirectiveDefinition = ngStyleDirectiveDefinition;
    }

    @Override
    public void PrintAst() {
        if(ngStyleDirectiveDefinition !=null) {
            ngStyleDirectiveDefinition.PrintAst();
        }

    }
}
