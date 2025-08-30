package AstClasses;

public class AllparenExpr extends PrimaryExpression{

    public void PrintAst() {
        System.out.println("()");
    }
    @Override
    public String generate() {
        return "()";
    }

    @Override
    public String generateJs() {
        return "()";
    }



}
