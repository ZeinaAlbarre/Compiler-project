package AstClasses;

import java.util.List;
import java.util.stream.Collectors;

public class ConstructorDefinition extends ConstructorDeclaration {
    private List<ParameterList> parameterList;
    private List<Statement> statements;

    public List<ParameterList> getParameterList() { return parameterList; }
    public void setParameterList(List<ParameterList> parameterList) { this.parameterList = parameterList; }
    public List<Statement> getStatements() { return statements; }
    public void setStatements(List<Statement> statements) { this.statements = statements; }

    @Override
    public void PrintAst() {
        System.out.println("ConstructorDefinition:");
        if (parameterList != null) for (ParameterList p : parameterList) p.PrintAst();
        if (statements != null) for (Statement s : statements) s.PrintAst();
    }

    @Override
    public String generate() {
        String params = (parameterList == null) ? "" :
                parameterList.stream().map(ParameterList::generate)
                        .collect(Collectors.joining(", "));
        StringBuilder body = new StringBuilder();
        if (statements != null) {
            for (Statement s : statements) body.append("    ").append(s.generate()).append("\n");
        }
        return "constructor(" + params + ") {\n" + body + "  }";
    }

    @Override
    public String generateJs() {
        String params = (parameterList == null) ? "" :
                parameterList.stream().map(p -> p.generateJs().isEmpty()? p.generate() : p.generateJs())
                        .collect(Collectors.joining(", "));
        StringBuilder body = new StringBuilder();
        if (statements != null) {
            for (Statement s : statements) {
                String g = s.generateJs();
                if (g == null || g.isEmpty()) g = s.generate();
                body.append("    ").append(g).append("\n");
            }
        }
        return "constructor(" + params + ") {\n" + body + "  }";
    }
}

