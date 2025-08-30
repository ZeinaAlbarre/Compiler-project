package AstClasses;

import java.util.ArrayList;
import java.util.List;

public class SourceElementDef extends SourceElement {

    public List<Statement> statements;

    public SourceElementDef() {
        this.statements = new ArrayList<>();
    }

    public void addStatement(Statement statement) {
        if (statement != null) {
            statements.add(statement);
        }
    }

    @Override
    public void PrintAst() {
        if (statements != null) {
            for (Statement statement : statements) {
                statement.PrintAst();
            }
        }
    }



    @Override public String generate() {
        StringBuilder sb = new StringBuilder();
        for (Statement s: statements) {
            String g = s.generate();
            if (g != null && !g.isEmpty()) sb.append(g).append("\n");
        }
        return sb.toString();
    }

    @Override public String generateHtml() {
        StringBuilder sb = new StringBuilder();
        for (Statement s: statements) {
            String g = s.generateHtml();
            if (g != null && !g.isEmpty()) sb.append(g).append("\n");
        }
        return sb.toString();
    }

    @Override public String generateCss() {
        StringBuilder sb = new StringBuilder();
        for (Statement s: statements) {
            String g = s.generateCss();
            if (g != null && !g.isEmpty()) sb.append(g).append("\n");
        }
        return sb.toString();
    }

    @Override public String generateJs() {
        StringBuilder sb = new StringBuilder();
        for (Statement s: statements) {
            String g = s.generateJs();
            if (g != null && !g.isEmpty()) sb.append(g).append("\n");
        }
        return sb.toString();
    }
}