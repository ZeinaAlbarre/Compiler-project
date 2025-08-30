package AstClasses;

import java.util.ArrayList;
import java.util.List;

public class TypeArguments extends ASTNode {
    private final List<TypeAnnotation> typeAnnotations = new ArrayList<>();

    public void addTypeAnnotation(TypeAnnotation type) {
        if (type != null) {
            typeAnnotations.add(type);
        }
    }

    public List<TypeAnnotation> getTypeAnnotations() {
        return typeAnnotations;
    }

    @Override
    public void PrintAst() {
        System.out.print("<");
        for (int i = 0; i < typeAnnotations.size(); i++) {
            typeAnnotations.get(i).PrintAst();
            if (i < typeAnnotations.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.print(">");
    }
    @Override
    public String generate() {
        if (typeAnnotations.isEmpty()) return "";
        return "<" + String.join(", ",
                typeAnnotations.stream().map(TypeAnnotation::generate)
                        .collect(java.util.stream.Collectors.toList())) + ">";
    }

    @Override
    public String generateJs() {

        return "";
    }


}