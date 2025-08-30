package AstClasses;

public abstract class DecoratorArguments extends ASTNode{
    DecoratorObjectArgument decoratorObjectArgument;
    DecoratorExpressionArgument decoratorExpressionArgument;

    public DecoratorObjectArgument getDecoratorObjectArgument() {
        return decoratorObjectArgument;
    }

    public void setDecoratorObjectArgument(DecoratorObjectArgument decoratorObjectArgument) {
        this.decoratorObjectArgument = decoratorObjectArgument;
    }

    public DecoratorExpressionArgument getDecoratorExpressionArgument() {
        return decoratorExpressionArgument;
    }

    public void setDecoratorExpressionArgument(DecoratorExpressionArgument decoratorExpressionArgument) {
        this.decoratorExpressionArgument = decoratorExpressionArgument;
    }
    public void PrintAst() {
        if (decoratorObjectArgument != null) {
            decoratorObjectArgument.PrintAst();
        }
        if (decoratorExpressionArgument != null) {
            decoratorExpressionArgument.PrintAst();
        }
    }
}
