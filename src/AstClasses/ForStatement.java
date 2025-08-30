package AstClasses;

public abstract class ForStatement extends ASTNode {
    ForStatementDefinition forStatementDefinition;

    public ForStatementDefinition getForStatementDefinition() { return forStatementDefinition; }
    public void setForStatementDefinition(ForStatementDefinition forStatementDefinition) {
        this.forStatementDefinition = forStatementDefinition;
    }

    @Override
    public void PrintAst() {
        if (forStatementDefinition != null) {
            forStatementDefinition.PrintAst();
        }
    }

    // Generators
    public abstract String generate();
    public abstract String generateJs();
    public abstract String generateHtml();
    public abstract String generateCss();
}
