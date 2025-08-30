package AstClasses;

import java.util.ArrayList;
import java.util.List;

public class VariableStatementDefinition2 extends VariableStatement {
    private final String kind;
    private final String name;
    private final TypeAnnotation type;
    private final List<Expression> expressions;

    public VariableStatementDefinition2(String kind, String name, TypeAnnotation type) {
        this.kind = kind;
        this.name = name;
        this.type = type;
        this.expressions = new ArrayList<>();
    }

    public void addExpression(Expression expr) {
        if (expr != null) expressions.add(expr);
    }

    public List<Expression> getExpressions() {
        return expressions;
    }

    @Override
    public void PrintAst() {
        System.out.println("VariableStatementDefinition2 {");
        System.out.println("  kind=" + kind);
        System.out.println("  name=" + name);
        if (type != null) {
            System.out.print("  type=");
            type.PrintAst();
            System.out.println();
        }
        System.out.println("  expressions=[");
        for (Expression e : expressions) {
            System.out.print("    ");
            e.PrintAst();
            System.out.println();
        }
        System.out.println("  ]");
        System.out.println("}");
    }

    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        sb.append(kind).append(' ').append(name);
        if (type != null) sb.append(": ").append(type.generate());
        if (!expressions.isEmpty()) {
            sb.append(" = ");
            for (int i = 0; i < expressions.size(); i++) {
                if (i > 0) sb.append(", ");
                sb.append(expressions.get(i).generate());
            }
        }
        sb.append(";");
        return sb.toString();
    }



    @Override
    public String generateJs() {
        return generate().replace("\n", "\n// ");

    }
}
