package AstClasses;

import java.util.ArrayList;
import java.util.List;

public class DefaultImportStatement extends ImportStatement {
    private final List<String> identifiers = new ArrayList<>();
    private String fromString;

    public void addIdentifier(String identifier) {
        identifiers.add(identifier);
    }

    public void setFromString(String fromString) {
        this.fromString = fromString;
    }

    public List<String> getIdentifiers() {
        return identifiers;
    }

    public String getFromString() {
        return fromString;
    }

    @Override
    public void PrintAst() {
        System.out.println("Import { identifiers=" + identifiers + ", from=\"" + fromString + "\" }");
    }

    @Override
    public String generate() {
        String joined = String.join(", ", identifiers);
        return "import { " + joined + " } from \"" + fromString + "\";";
    }

}
