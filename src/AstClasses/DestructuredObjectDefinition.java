package AstClasses;

import java.util.ArrayList;
import java.util.List;

public class DestructuredObjectDefinition extends DestructuredObject {
    private final List<DestructuredProperty> properties = new ArrayList<>();

    public void addProperty(DestructuredProperty prop) {
        if (prop != null) properties.add(prop);
    }

    public List<DestructuredProperty> getProperties() {
        return properties;
    }

    @Override
    public void PrintAst() {
        System.out.println("DestructuredObjectDefinition {");
        for (DestructuredProperty p : properties) {
            System.out.print("  ");
            p.PrintAst();
        }
        System.out.println("}");
    }
    @Override
    public String generate() {
        return "{ " + String.join(", ",
                properties.stream().map(DestructuredProperty::generate)
                        .collect(java.util.stream.Collectors.toList())) + " }";
    }

    @Override
    public String generateJs() {
        return "{ " + String.join(", ",
                properties.stream().map(DestructuredProperty::generateJs)
                        .collect(java.util.stream.Collectors.toList())) + " }";
    }


}