package AstClasses;

import java.util.ArrayList;
import java.util.List;

public class StmImport extends Statement {
    private final List<ImportStatement> importStatements = new ArrayList<>();

    public void addImportStatement(ImportStatement importStatement) {
        if (importStatement != null) importStatements.add(importStatement);
    }

    @Override
    public void PrintAst() {
        System.out.println("StmImport {");
        for (ImportStatement imp : importStatements) {
            System.out.print("  ");
            imp.PrintAst();
        }
        System.out.println("}");
    }

    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        for (ImportStatement imp : importStatements) {
            sb.append(imp.generate()).append("\n");
        }
        return sb.toString();
    }



}