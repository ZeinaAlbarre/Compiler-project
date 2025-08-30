package AstClasses;

import java.util.List;

public class ImportWithNamedOnly extends ImportClause {
    public List<ImportSpecifier> specifiers;

    public ImportWithNamedOnly(List<ImportSpecifier> specifiers) {
        this.specifiers = specifiers;
    }

    public List<ImportSpecifier> getSpecifiers() {
        return specifiers;
    }

    public void setSpecifiers(List<ImportSpecifier> specifiers) {
        this.specifiers = specifiers;
    }

    @Override
    public void PrintAst() {
        System.out.println("ImportWithNamedOnly {");
        if (specifiers != null) {
            for (ImportSpecifier specifier : specifiers) {
                System.out.print("  ");
                specifier.PrintAst();
            }
        }
        System.out.println("}");
    }
}

