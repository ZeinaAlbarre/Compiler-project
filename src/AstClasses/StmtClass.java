package AstClasses;

import java.util.ArrayList;
import java.util.List;

public class StmtClass extends Statement {
    public List<ClassDeclaration> classDeclarations = new ArrayList<>();

    public void setClassDeclarations(ClassDeclaration classDeclaration) {
        if (classDeclaration != null) classDeclarations.add(classDeclaration);
    }

    @Override
    public void PrintAst() {
        for (ClassDeclaration c : classDeclarations) c.PrintAst();
    }

    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        for (ClassDeclaration c : classDeclarations) sb.append(c.generate()).append("\n");
        return sb.toString();
    }

    @Override
    public String generateJs() {
        StringBuilder sb = new StringBuilder();
        for (ClassDeclaration c : classDeclarations) sb.append(c.generateJs()).append("\n");
        return sb.toString();
    }
}