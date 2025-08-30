package AstClasses;

import java.util.ArrayList;
import java.util.List;

public class ArrayLiteralDefinition extends ArrayLiteral {
    public List<ArgumentList> argumentLists;

    public ArrayLiteralDefinition() {
        this.argumentLists = new ArrayList<>();
    }

    public void addExpression(ArgumentList argumentList) {
        argumentLists.add(argumentList);
    }

    @Override
    public void PrintAst() {
        System.out.println("ArrayLiteral:");
        System.out.println("[ ");
        for (ArgumentList expr : argumentLists) {
            expr.PrintAst();
        }
        System.out.println("]");
    }

    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < argumentLists.size(); i++) {
            sb.append(argumentLists.get(i).generate());
            if (i < argumentLists.size() - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }

    @Override
    public String generateJs() {
        return generate();
    }


}
