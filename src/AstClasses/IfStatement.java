package AstClasses;

public abstract class IfStatement extends ASTNode {
    IfStatementDefinition ifStatementDefinition;

    public IfStatementDefinition getIfStatementDefinition() { return ifStatementDefinition; }
    public void setIfStatementDefinition(IfStatementDefinition ifStatementDefinition) {
        this.ifStatementDefinition = ifStatementDefinition;
    }

    @Override
    public void PrintAst() {
        if (ifStatementDefinition != null) {
            ifStatementDefinition.PrintAst();
        }
    }

    // Generators
    public abstract String generate();
    public abstract String generateJs();
    public abstract String generateHtml();
    public abstract String generateCss();
}
