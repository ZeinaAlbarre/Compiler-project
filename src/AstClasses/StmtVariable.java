package AstClasses;

public class StmtVariable extends Statement {
    VariableStatement variableStatement;

    public VariableStatement getVariableStatement() {
        return variableStatement;
    }

    public void setVariableStatement(VariableStatement variableStatement) {
        this.variableStatement = variableStatement;
    }

    @Override
    public void PrintAst() {
        if (variableStatement != null) {
            variableStatement.PrintAst();
        }
    }

    @Override
    public String generate() {
        return variableStatement != null ? variableStatement.generate() : "";
    }


    @Override
    public String generateJs() {
        return variableStatement != null ? "// " + variableStatement.generate().replace("\n", "\n// ") : "";
    }
}
