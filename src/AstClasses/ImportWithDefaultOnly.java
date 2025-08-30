package AstClasses;

public class ImportWithDefaultOnly extends ImportClause {
    public String defaultIdentifier;

    public String getDefaultIdentifier() {
        return defaultIdentifier;
    }

    public void setDefaultIdentifier(String defaultIdentifier) {
        this.defaultIdentifier = defaultIdentifier;
    }

    public ImportWithDefaultOnly(String defaultIdentifier) {
        this.defaultIdentifier = defaultIdentifier;
    }

    @Override
    public void PrintAst() {
        System.out.println("ImportWithDefaultOnly {");
        System.out.println("  " + defaultIdentifier);
        System.out.println("}");
    }
}
