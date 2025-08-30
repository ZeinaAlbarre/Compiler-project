package AstClasses;

import java.util.ArrayList;
import java.util.List;

public class CallExpr extends Expression {
    public Expression callee;
    public List<Expression> arguments;
    public TypeArguments typeArguments;

    public CallExpr(Expression callee, List<Expression> arguments, TypeArguments typeArguments) {
        this.callee = callee;
        this.arguments = arguments != null ? arguments : new ArrayList<>();
        this.typeArguments = typeArguments;
    }

    @Override
    public void PrintAst() {
        System.out.println("CallExpr:");
        System.out.print("  Callee: ");
        if (callee != null) callee.PrintAst();
        else System.out.print("<null-callee>");

        if (typeArguments != null && !typeArguments.getTypeAnnotations().isEmpty()) {
            System.out.print("  TypeArguments: ");
            typeArguments.PrintAst();
            System.out.println();
        }

        System.out.println("  Arguments: (");
        for (Expression arg : arguments) {
            System.out.print("    ");
            arg.PrintAst();
            System.out.println();
        }
        System.out.println("  )");
    }

    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        sb.append(callee != null ? callee.generate() : "<null-callee>");
        sb.append("(");
        for (int i = 0; i < arguments.size(); i++) {
            sb.append(arguments.get(i).generate());
            if (i < arguments.size() - 1) sb.append(", ");
        }
        sb.append(")");
        return sb.toString();
    }

}
