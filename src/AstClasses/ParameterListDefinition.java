package AstClasses;

import java.util.ArrayList;
import java.util.List;

public class ParameterListDefinition extends ParameterList {
    private final List<Parameter> parameters = new ArrayList<>();

    public void addParameter(Parameter p) {
        if (p != null) parameters.add(p);
    }

    public List<Parameter> getParameters() {
        return parameters;
    }

    @Override
    public void PrintAst() {
        System.out.println("ParameterList:");
        for (Parameter p : parameters) {
            System.out.print("  ");
            p.PrintAst();
        }
    }

    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < parameters.size(); i++) {
            sb.append(parameters.get(i).generate());
            if (i < parameters.size() - 1) sb.append(", ");
        }
        return sb.toString();
    }

    @Override
    public String generateJs() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < parameters.size(); i++) {
            sb.append(parameters.get(i).generateJs());
            if (i < parameters.size() - 1) sb.append(", ");
        }
        return sb.toString();
    }

    @Override
    public String generateHtml() { return ""; }

    @Override
    public String generateCss() { return ""; }
}