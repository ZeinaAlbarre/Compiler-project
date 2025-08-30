package AstClasses;

public class IdentifierExpr2 extends PrimaryExpression {
    private String name;
    private String firstArg;
    private String secondArg;

    public IdentifierExpr2(String name, String firstArg) {
        this.name = name;
        this.firstArg = firstArg;
    }

    public void setSecondArg(String secondArg) { this.secondArg = secondArg; }

    public String getName()      { return name; }
    public String getFirstArg()  { return firstArg; }
    public String getSecondArg() { return secondArg; }

    @Override
    public void PrintAst() {
        System.out.print("IdentifierExpr2: " + name);
        if (firstArg != null || secondArg != null) {
            System.out.print("< " + (firstArg != null ? firstArg : ""));
            if (secondArg != null) System.out.print(", " + secondArg);
            System.out.print(" >");
        }
        System.out.println();
    }

    @Override
    public String generate() {
        if (firstArg == null && secondArg == null) {
            return name;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(name).append("<");
        if (firstArg != null) sb.append(firstArg);
        if (secondArg != null) sb.append(", ").append(secondArg);
        sb.append(">");
        return sb.toString();
    }

    @Override
    public String generateJs() {
        return generate();
    }
}