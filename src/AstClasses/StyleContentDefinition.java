package AstClasses;

import java.util.ArrayList;
import java.util.List;

public class StyleContentDefinition extends StyleContent {
    private String selector;
    private final List<ExpressionStatement> statements = new ArrayList<>();

    public StyleContentDefinition(String selector) {
        this.selector = selector;
    }

    public void addStatement(ExpressionStatement stmt) {
        if (stmt != null) statements.add(stmt);
    }

    @Override
    public void PrintAst() {
        System.out.println("StyleContentDefinition { selector: ." + selector + " }");
        for (ExpressionStatement stmt : statements) {
            System.out.print("    ");
            stmt.PrintAst();
        }
    }

    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        sb.append(".").append(selector).append(" {\n");
        for (ExpressionStatement stmt : statements) {
            sb.append("  ").append(stmt.generate()).append("\n");
        }
        sb.append("}");
        return sb.toString();
    }

    @Override
    public String generateCss() {
        StringBuilder sb = new StringBuilder();
        sb.append(".").append(selector).append(" {\n");
        for (ExpressionStatement stmt : statements) {
            sb.append("  ").append(stmt.generateCss()).append("\n");
        }
        sb.append("}");
        return sb.toString();
    }

    @Override
    public String generateHtml() {
        return "";
    }

    @Override
    public String generateJs() {
        return generate().replace("\n", "\n// ");
    }
}
