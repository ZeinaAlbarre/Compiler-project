package AstClasses;

import java.util.ArrayList;
import java.util.List;

public class ObjectLiteralDefinition extends ObjectLiteral {
    public List<PropertyAssignment> properties;

    public ObjectLiteralDefinition() {
        this.properties = new ArrayList<>();
    }

    public void addProperty(PropertyAssignment property) {
        properties.add(property);
    }

    @Override
    public void PrintAst() {
        System.out.println("{");
        for (int i = 0; i < properties.size(); i++) {
            System.out.print(" ");
            properties.get(i).PrintAst();
            if (i < properties.size() - 1) {
                System.out.println(",");
            } else {
                System.out.println();
            }
        }
        System.out.print("  }");
    }

    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder("{ ");
        for (int i = 0; i < properties.size(); i++) {
            sb.append(properties.get(i).generate());
            if (i < properties.size() - 1) sb.append(", ");
        }
        sb.append(" }");
        return sb.toString();
    }

    @Override
    public String generateJs() {
        return generate();
    }

}
