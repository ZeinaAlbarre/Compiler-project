package AstClasses;

public abstract class ArgumentList extends ASTNode{
    ArgumentListDefinition argumentListDefinition;

    public ArgumentListDefinition getArgumentListDefinition() {
        return argumentListDefinition;
    }

    public void setArgumentListDefinition(ArgumentListDefinition argumentListDefinition) {
        this.argumentListDefinition = argumentListDefinition;
    }

    public void PrintAst() {
        if (argumentListDefinition != null) {
            argumentListDefinition.PrintAst();
        }
    }
}
