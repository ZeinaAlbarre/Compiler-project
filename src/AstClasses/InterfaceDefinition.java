package AstClasses;

import java.util.ArrayList;
import java.util.List;

public class InterfaceDefinition extends InterfaceDeclaration{

    public String name;
    public String superInterface;
    public List<InterfaceProperty> properties;


    public InterfaceDefinition(String name, String superInterface, InterfaceProperty propertied) {
        this.name = name;
        this.superInterface = superInterface;
        this.properties = new ArrayList<>();
    }

    public void setInterfaceProperty(InterfaceProperty propertie) {
        properties.add(propertie);
    }


    @Override
    public void PrintAst() {
        System.out.println("interface " + name +
                (superInterface != null ? " extends " + superInterface : "") + " {");
        if (properties != null) {
            for (InterfaceProperty prop : properties) {
                System.out.print("    ");
                prop.PrintAst();
                System.out.println(";");
            }
        }
        System.out.println("}");
    }

    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        sb.append("interface ").append(name);
        if (superInterface != null) {
            sb.append(" extends ").append(superInterface);
        }
        sb.append(" {\n");
        for (InterfaceProperty prop : properties) {
            sb.append("  ").append(prop.generate()).append(";\n");
        }
        sb.append("}");
        return sb.toString();
    }

    @Override
    public String generateJs() {
        return generate().replace("\n", "\n// ");
    }
}