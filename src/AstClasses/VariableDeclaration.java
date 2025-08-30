package AstClasses;

public abstract class VariableDeclaration extends ASTNode{
    VariableDeclarationDefinition variableDeclarationDefinition;

    public VariableDeclarationDefinition getVariableDeclarationDefinition() {
        return variableDeclarationDefinition;
    }

    public void setVariableDeclarationDefinition(VariableDeclarationDefinition variableDeclarationDefinition) {
        this.variableDeclarationDefinition = variableDeclarationDefinition;
    }

    public void PrintAst() {
        if (variableDeclarationDefinition != null) {
            variableDeclarationDefinition.PrintAst();
        }
    }
}
