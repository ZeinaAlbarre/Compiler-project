package AstClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ComplexType extends TypeAnnotation {
    public List<ObjectType> objectTypes;

    public ComplexType() {
        super("object");
        this.objectTypes = new ArrayList<>();
    }

    public void setNgDirectives(ObjectType objectType) {
        objectTypes.add(objectType);
    }

    @Override
    public void PrintAst() {
        if (objectTypes != null) {
            for (ObjectType htmlElement : objectTypes) {
                htmlElement.PrintAst();
            }
        }
    }

    @Override
    public String generate() {
        return "{" + objectTypes.stream()
                .map(ObjectType::generate)
                .collect(Collectors.joining("; ")) + "}";
    }

    @Override
    public String generateJs() { return ""; }
    @Override
    public String generateHtml() { return ""; }
    @Override
    public String generateCss() { return ""; }
}
