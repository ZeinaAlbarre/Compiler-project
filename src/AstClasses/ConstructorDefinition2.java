package AstClasses;

import java.util.List;

public class ConstructorDefinition2 extends ConstructorDeclaration {
    private List<Statement> statements;

    public List<Statement> getStatements() {
        return statements;
    }

    public void setStatements(List<Statement> statements) {
        this.statements = statements;
    }

    @Override
    public void PrintAst() {
        System.out.println("ConstructorDefinition2:");
        if (statements != null) {
            for (Statement s : statements) {
                s.PrintAst();
            }
        }
    }

    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        sb.append("constructor() {\n");
        if (statements != null) {
            for (Statement s : statements) {
                sb.append(s.generate());
            }
        }
        sb.append("}\n");
        return sb.toString();
    }
}