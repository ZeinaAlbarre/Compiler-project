package AstClasses;

import java.util.Optional;

public class IfStatementDefinition extends IfStatement {
    public Expression condition;
    public Statement thenBranch;
    public Optional<Statement> elseBranch = Optional.empty();

    public IfStatementDefinition(Expression condition, Statement thenBranch, Statement elseBranch) {
        this.condition = condition;
        this.thenBranch = thenBranch;
        if (elseBranch != null) this.elseBranch = Optional.of(elseBranch);
    }

    @Override
    public void PrintAst() {
        System.out.println("IfStatement");
        System.out.print("  Condition: ");
        if (condition != null) condition.PrintAst();
        System.out.print("  Then: ");
        if (thenBranch != null) thenBranch.PrintAst();
        else System.out.println("  (empty)");
        if (elseBranch.isPresent()) {
            System.out.print("  Else: ");
            elseBranch.get().PrintAst();
        }
    }

    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        sb.append("if (").append(condition.generate()).append(") ")
                .append(thenBranch.generate());
        elseBranch.ifPresent(stmt -> sb.append(" else ").append(stmt.generate()));
        return sb.toString();
    }

    @Override
    public String generateJs() { return generate(); }
    @Override
    public String generateHtml() { return ""; }
    @Override
    public String generateCss() { return ""; }
}
