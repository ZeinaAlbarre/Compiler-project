package AstClasses;

import java.util.List;

public class ArrowDestructuredParam extends ArrowParam {
    private List<DestructuredProperty> properties;

    public ArrowDestructuredParam(List<DestructuredProperty> properties) {
        this.properties = properties;
    }

    public List<DestructuredProperty> getProperties() {
        return properties;
    }

    @Override
    public void PrintAst() {
        System.out.println("ArrowDestructuredParam {");
        for (DestructuredProperty prop : properties) {
            System.out.print("  ");
            prop.PrintAst();
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