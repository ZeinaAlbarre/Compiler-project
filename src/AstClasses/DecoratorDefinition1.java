package AstClasses;

import java.util.ArrayList;
import java.util.List;

public class DecoratorDefinition1 extends Decorator {
    public String name;
    public List<DecoratorArguments> decoratorArguments;

    public DecoratorDefinition1() {
        this.decoratorArguments = new ArrayList<>();
    }

    public void setDecoratorArguments(DecoratorArguments decoratorArgument) {
        decoratorArguments.add(decoratorArgument);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void PrintAst() {
        System.out.println("DecoratorDefinition1:");
        System.out.println("  Name: " + name);
        if (decoratorArguments != null) {
            for (DecoratorArguments arg : decoratorArguments) {
                arg.PrintAst();
            }
        }
    }

    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        sb.append("@").append(name);
        if (!decoratorArguments.isEmpty()) {
            sb.append("(");
            for (int i = 0; i < decoratorArguments.size(); i++) {
                if (i > 0) sb.append(", ");
                sb.append(decoratorArguments.get(i).generate());
            }
            sb.append(")");
        }
        return sb.toString();
    }

    @Override
    public String generateJs() {
        return  generate();
    }


}