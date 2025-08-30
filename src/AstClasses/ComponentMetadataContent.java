package AstClasses;

import java.util.ArrayList;
import java.util.List;

public class ComponentMetadataContent extends ComponentMetadata {
    public List<ComponentProperty> componentProperties;

    public ComponentMetadataContent() {
        this.componentProperties = new ArrayList<>();
    }

    public void setComponentProperties(ComponentProperty componentPropertie) {
        if (componentPropertie != null) {
            componentProperties.add(componentPropertie);
        }
    }

    @Override
    public void PrintAst() {
        System.out.println("{");
        if (componentProperties != null) {
            for (ComponentProperty componentProperty : componentProperties) {
                componentProperty.PrintAst();
            }
        }
        System.out.println("}");
    }

    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        sb.append("{\n");

        java.util.List<String> parts = new java.util.ArrayList<>();
        if (componentProperties != null) {
            for (ComponentProperty p : componentProperties) {
                if (p == null) continue;
                String g = p.generate();
                if (g != null && !g.trim().isEmpty()) parts.add(g.trim());
            }
        }

        for (int i = 0; i < parts.size(); i++) {
            sb.append("  ").append(parts.get(i));
            if (i < parts.size() - 1) sb.append(",");
            sb.append("\n");
        }
        sb.append("}");
        return sb.toString();
    }

    @Override
    public String generateHtml() {
        StringBuilder sb = new StringBuilder();
        if (componentProperties != null) {
            for (ComponentProperty componentProperty : componentProperties) {
                sb.append(componentProperty.generateHtml());
            }
        }
        return sb.toString();
    }

    @Override
    public String generateCss() {
        StringBuilder sb = new StringBuilder();
        if (componentProperties != null) {
            for (ComponentProperty componentProperty : componentProperties) {
                sb.append(componentProperty.generateCss());
            }
        }
        return sb.toString();
    }

    @Override
    public String generateJs() {
        return  generate().replace("\n", "\n// ");
    }
}
