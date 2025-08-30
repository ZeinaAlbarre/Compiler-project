package AstClasses;

import java.util.ArrayList;
import java.util.List;

public class StmtIf extends Statement {
    public List<IfStatement> ifStatements;

    public StmtIf() {
        this.ifStatements = new ArrayList<>();
    }

    public void setIfStatementDefinition(IfStatement ifStatement) {
        ifStatements.add(ifStatement);
    }

    @Override
    public void PrintAst() {
        if (ifStatements != null) {
            for (IfStatement stmt : ifStatements) {
                stmt.PrintAst();
            }
        }
    }

    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        if (ifStatements != null) {
            for (IfStatement stmt : ifStatements) {
                sb.append(stmt.generate()).append("\n");
            }
        }
        return sb.toString();
    }


    @Override
    public String generateJs() {
        return  generate().replace("\n", "\n// ");
    }
}
