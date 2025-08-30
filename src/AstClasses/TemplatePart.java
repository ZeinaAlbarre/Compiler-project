package AstClasses;

public abstract class TemplatePart extends ASTNode{

    IdePart idePart;
    public IdePart getIdePart() {
        return idePart;
    }

    public void setIdePart(IdePart idePart) {
        this.idePart = idePart;
    }

    @Override
    public void PrintAst() {
        if(idePart !=null) {
            idePart.PrintAst();
        }
    }
}
