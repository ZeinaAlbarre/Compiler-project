package AstClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ForVariableInitializer extends ForInitializer{
    public List<VariableDeclaration> variableDeclarations;

    public ForVariableInitializer() {
        this.variableDeclarations = new ArrayList<>();
    }

    public void addVariableDeclarations(VariableDeclaration expr) {
        variableDeclarations.add(expr);
    }

    public List<VariableDeclaration> getVariableDeclarations() {
        return variableDeclarations;
    }

    public void PrintAst() {
        for (VariableDeclaration expr : variableDeclarations) {
            expr.PrintAst();
        }
    }
    @Override
    public String generate() {
        return variableDeclarations.stream()
                .map(VariableDeclaration::generate)
                .collect(Collectors.joining(", "));
    }

    @Override
    public String generateJs() { return generate(); }

}
