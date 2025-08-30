package AstClasses;

import java.util.List;

public class DefaultAndNamedImports extends ImportClause {
    public String defaultIdentifier;
    public List<ImportSpecifier> specifiers;

    public List<ImportSpecifier> getSpecifiers() {
        return specifiers;
    }

    public void setSpecifiers(List<ImportSpecifier> specifiers) {
        this.specifiers = specifiers;
    }

    public DefaultAndNamedImports(String defaultIdentifier, List<ImportSpecifier> specifiers) {
        this.defaultIdentifier = defaultIdentifier;
        this.specifiers = specifiers;
    }

    public String getDefaultIdentifier() {
        return defaultIdentifier;
    }

    public void setDefaultIdentifier(String defaultIdentifier) {
        this.defaultIdentifier = defaultIdentifier;
    }

    @Override
    public void PrintAst() {
        System.out.println("DefaultAndNamedImports {");
        System.out.println("  Default: " + defaultIdentifier);
        if (specifiers != null && !specifiers.isEmpty()) {
            System.out.println("  Named imports:");
            for (ImportSpecifier specifier : specifiers) {
                System.out.print("    ");
                specifier.PrintAst();
            }
        }
        System.out.println("}");
    }
}

