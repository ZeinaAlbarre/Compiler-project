package AstClasses;

public class NgForDirective extends ASTNode{
    NgForDirectiveDefinition1 ngForDirectiveDefinition1;
    NgForDirectiveDefinition2 ngForDirectiveDefinition2;

    public NgForDirectiveDefinition1 getNgForDirectiveDefinition1() {
        return ngForDirectiveDefinition1;
    }

    public void setNgForDirectiveDefinition1(NgForDirectiveDefinition1 ngForDirectiveDefinition1) {
        this.ngForDirectiveDefinition1 = ngForDirectiveDefinition1;
    }

    public NgForDirectiveDefinition2 getNgForDirectiveDefinition2() {
        return ngForDirectiveDefinition2;
    }

    public void setNgForDirectiveDefinition2(NgForDirectiveDefinition2 ngForDirectiveDefinition2) {
        this.ngForDirectiveDefinition2 = ngForDirectiveDefinition2;
    }

    @Override
    public void PrintAst() {
        if(ngForDirectiveDefinition1 !=null) {
            ngForDirectiveDefinition1.PrintAst();
        } if(ngForDirectiveDefinition2 !=null) {
            ngForDirectiveDefinition2.PrintAst();
        }
    }
}
