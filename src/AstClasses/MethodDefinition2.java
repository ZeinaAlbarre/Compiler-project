package AstClasses;

import java.util.ArrayList;
import java.util.List;

public class MethodDefinition2 extends MethodDeclaration {
    private final String name;
    private final List<Statement> body = new ArrayList<>();

    public MethodDefinition2(String name) {
        this.name = name;
    }

    public void addStatement(Statement stmt) {
        if (stmt != null) body.add(stmt);
    }

    public String getName() {
        return name;
    }

    public List<Statement> getBody() {
        return body;
    }

    @Override
    public void PrintAst() {
        System.out.println("MethodDefinition2: " + name + "()");
        System.out.println("  Body:");
        for (Statement s : body) {
            System.out.print("{");
            s.PrintAst();
            System.out.print("}");

        }
    }
    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append("() {\n");
        for (Statement s : body) {
            sb.append("  ").append(s.generate());
        }
        sb.append("}");
        return sb.toString();
    }

    @Override
    public String generateJs() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append("() {\n");
        for (Statement s : body) {
            sb.append("  ").append(s.generateJs()).append("\n");
        }
        sb.append("}");
        return sb.toString();
    }

    @Override
    public String generateHtml() { return ""; }

    @Override
    public String generateCss() { return ""; }

}
