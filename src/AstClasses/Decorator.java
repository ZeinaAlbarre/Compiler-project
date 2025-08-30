package AstClasses;

public abstract class Decorator extends ASTNode {

    DecoratorDefinition1 decoratorDefinition1;
    DecoratorDefinition2 decoratorDefinition2;

    public DecoratorDefinition1 getDecoratorDefinition1() {
        return decoratorDefinition1;
    }

    public void setDecoratorDefinition1(DecoratorDefinition1 decoratorDefinition1) {
        this.decoratorDefinition1 = decoratorDefinition1;
    }

    public DecoratorDefinition2 getDecoratorDefinition2() {
        return decoratorDefinition2;
    }

    public void setDecoratorDefinition2(DecoratorDefinition2 decoratorDefinition2) {
        this.decoratorDefinition2 = decoratorDefinition2;
    }

    @Override
    public void PrintAst() {
        if(decoratorDefinition1 !=null) {
            decoratorDefinition1.PrintAst();
        }
        if(decoratorDefinition2 !=null) {
            decoratorDefinition2.PrintAst();
        }
    }

}
