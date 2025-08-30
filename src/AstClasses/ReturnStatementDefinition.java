package AstClasses;

public class ReturnStatementDefinition extends ReturnStatement {
    public Expression returnValue;

    public ReturnStatementDefinition(Expression returnValue) {
        this.returnValue = returnValue;
    }

    @Override
    public void PrintAst() {
        System.out.println("ReturnStatementDefinition(");
        if (returnValue != null) {
            returnValue.PrintAst();
        } else {
            System.out.println("  return;");
        }
        System.out.println(")");
    }

    @Override
    public String generate() {
        if (returnValue != null) return "return " + returnValue.generate() + ";";
        return "return;";
    }

    @Override
    public String generateJs() {
        if (returnValue != null) return "return " + returnValue.generateJs() + ";";
        return "return;";
    }

    @Override
    public String generateHtml() { return ""; }

    @Override
    public String generateCss() { return ""; }
}
