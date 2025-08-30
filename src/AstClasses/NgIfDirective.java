package AstClasses;

public class NgIfDirective extends ASTNode{
    NgIfDirectiveDefinition ngIfDirectiveDefinition;

    public NgIfDirectiveDefinition getNgIfDirectiveDefinition() {
        return ngIfDirectiveDefinition;
    }

    public void setNgIfDirectiveDefinition(NgIfDirectiveDefinition ngIfDirectiveDefinition) {
        this.ngIfDirectiveDefinition = ngIfDirectiveDefinition;
    }

    public void PrintAst() {
        if(ngIfDirectiveDefinition !=null) {
            ngIfDirectiveDefinition.PrintAst();
        }
    }
}
