package AstClasses;

public class ImportAlias extends ImportSpecifier {
    public String originalName;
    public String alias;

    public ImportAlias(String originalName, String alias) {
        this.originalName = originalName;
        this.alias = alias;
    }

    public String getOriginalName() {
        return originalName;
    }

    public void setOriginalName(String originalName) {
        this.originalName = originalName;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    @Override
    public void PrintAst() {
        System.out.println("ImportAlias: " + originalName + " as " + alias);
    }
}
