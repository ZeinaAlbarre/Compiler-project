package AstClasses;

import java.util.List;
import java.util.Optional;

public class ForStatementDefinition extends ForStatement {
    public Expression condition;
    public Expression increment;
    public ForInitializer forInitializer;
    public Optional<Statement> singleStatement = Optional.empty();
    public Optional<List<Statement>> blockStatements = Optional.empty();

    public ForStatementDefinition(ForInitializer forInitializer,
                                  Expression condition,
                                  Expression increment,
                                  Statement singleStatement,
                                  List<Statement> blockStatements) {
        this.forInitializer = forInitializer;
        this.condition = condition;
        this.increment = increment;
        if (singleStatement != null) this.singleStatement = Optional.of(singleStatement);
        if (blockStatements != null && !blockStatements.isEmpty()) {
            this.blockStatements = Optional.of(blockStatements);
        }
    }

    @Override
    public void PrintAst() { /* نفس كودك */ }

    @Override
    public String generate() {
        String init = (forInitializer != null) ? forInitializer.generate() : "";
        String cond = (condition != null) ? condition.generate() : "";
        String inc = (increment != null) ? increment.generate() : "";

        StringBuilder body = new StringBuilder();
        if (blockStatements.isPresent()) {
            body.append("{\n");
            for (Statement stmt : blockStatements.get()) {
                body.append(stmt.generate()).append("\n");
            }
            body.append("}");
        } else if (singleStatement.isPresent()) {
            body.append(singleStatement.get().generate());
        } else {
            body.append("{}");
        }

        return "for (" + init + "; " + cond + "; " + inc + ") " + body;
    }

    @Override
    public String generateJs() { return generate(); }
    @Override
    public String generateHtml() { return ""; }
    @Override
    public String generateCss() { return ""; }
}
