package AstClasses;

public abstract class VariableStatement extends ASTNode{
    VariableStatementDefinition variableStatementDefinition;
    VariableStatementDefinition2 variableStatementDefinition2;

    public VariableStatementDefinition getVariableStatementDefinition() {
        return variableStatementDefinition;
    }

    public void setVariableStatementDefinition(VariableStatementDefinition variableStatementDefinition) {
        this.variableStatementDefinition = variableStatementDefinition;
    }

    public VariableStatementDefinition2 getVariableStatementDefinition2() {
        return variableStatementDefinition2;
    }

    public void setVariableStatementDefinition2(VariableStatementDefinition2 variableStatementDefinition2) {
        this.variableStatementDefinition2 = variableStatementDefinition2;
    }

    public void PrintAst() {
        if (variableStatementDefinition != null) {
            variableStatementDefinition.PrintAst();
        }
        if (variableStatementDefinition2 != null) {
            variableStatementDefinition2.PrintAst();
        }
    }
}
