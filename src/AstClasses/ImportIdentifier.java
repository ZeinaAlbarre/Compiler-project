package AstClasses;

import java.util.List;

public class ImportIdentifier extends ImportSpecifier {
    public List<String> identifiers;

    public ImportIdentifier(List<String> identifiers) {
        this.identifiers = identifiers;
    }

    public List<String> getIdentifiers() {
        return identifiers;
    }

    public void setIdentifiers(List<String> identifiers) {
        this.identifiers = identifiers;
    }

    @Override
    public void PrintAst() {
        System.out.println("ImportIdentifier {");
        if (identifiers != null && !identifiers.isEmpty()) {
            System.out.println("  " + String.join(", ", identifiers));
        }
        System.out.println("}");
    }
}

