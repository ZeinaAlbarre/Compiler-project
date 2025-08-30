package AstClasses;

public abstract class ImportStatement extends Statement{
    private String identifier;
    private String fromPath;

    public ImportStatement() {
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public void setFromString(String fromString) {
        this.fromPath = fromString;
    }

    public void PrintAst() {
        System.out.println("Import: " + identifier + " from " + fromPath);
    }


}

