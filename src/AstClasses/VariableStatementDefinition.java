package AstClasses;

import java.util.ArrayList;
import java.util.List;

public class VariableStatementDefinition extends VariableStatement {

    public String declarationType;
    public List<VariableDeclaration> variableDeclarations;

    public VariableStatementDefinition(String declarationType) {
        this.declarationType = declarationType;
        this.variableDeclarations = new ArrayList<>();
    }

    public void addVariableDeclaration(VariableDeclaration variableDeclaration) {
        this.variableDeclarations.add(variableDeclaration);
    }

    @Override
    public void PrintAst() {
        System.out.println("VariableStatementDefinition(");
        System.out.println("  DeclarationType: " + declarationType);
        System.out.println("  Variables: [");
        for (VariableDeclaration vd : variableDeclarations) {
            vd.PrintAst();
        }
        System.out.println("  ]");
        System.out.println(")");
    }
}
