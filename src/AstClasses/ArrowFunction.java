package AstClasses;

public class ArrowFunction extends Expression{
    public ArrowFunctionDefinition2 arrowFunctionDefinition2;

    public ArrowFunctionDefinition2 getArrowFunctionDefinition2() {
        return arrowFunctionDefinition2;
    }

    public void setArrowFunctionDefinition2(ArrowFunctionDefinition2 arrowFunctionDefinition2) {
        this.arrowFunctionDefinition2 = arrowFunctionDefinition2;
    }

    @Override
    public void PrintAst() {
        if (arrowFunctionDefinition2 != null) {
            arrowFunctionDefinition2.PrintAst();
        }
    }
}
