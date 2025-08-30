package AstClasses;

public abstract class SelectorProperty extends ASTNode{
    SelectorDefinition selectorDefinition;

    public SelectorDefinition getSelectorDefinition() {
        return selectorDefinition;
    }

    public void setSelectorDefinition(SelectorDefinition selectorDefinition) {
        this.selectorDefinition = selectorDefinition;
    }
    public void PrintAst() {
        if(selectorDefinition!=null) {
            selectorDefinition.PrintAst();
        }
    }

}
