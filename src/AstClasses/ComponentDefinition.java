package AstClasses;

import java.util.ArrayList;
import java.util.List;

public class ComponentDefinition extends ComponentDeclaration {
    private List<ComponentMetadata> componentMetadata;

    public ComponentDefinition() {
        this.componentMetadata = new ArrayList<>();
    }

    public void setComponentMetadata(ComponentMetadata metadata) {
        if (metadata != null) {
            this.componentMetadata.add(metadata);
        }
    }

    @Override
    public void PrintAst() {
        System.out.println("@Component(");
        if (componentMetadata != null) {
            for (ComponentMetadata metadata : componentMetadata) {
                metadata.PrintAst();
            }
        }
        System.out.println(")");
    }

    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        sb.append("@Component(\n");

        java.util.List<String> blocks = new java.util.ArrayList<>();
        if (componentMetadata != null) {
            for (ComponentMetadata m : componentMetadata) {
                if (m == null) continue;
                String g = m.generate();
                if (g != null && !g.trim().isEmpty()) blocks.add(g.trim());
            }
        }

        for (int i = 0; i < blocks.size(); i++) {
            sb.append("  ").append(blocks.get(i));
            if (i < blocks.size() - 1) sb.append(",");
            sb.append("\n");
        }
        sb.append(")");
        return sb.toString();
    }

    @Override
    public String generateHtml() {
        StringBuilder sb = new StringBuilder();
        if (componentMetadata != null) {
            for (ComponentMetadata metadata : componentMetadata) {
                sb.append(metadata.generateHtml());
            }
        }
        return sb.toString();
    }

    @Override
    public String generateCss() {
        StringBuilder sb = new StringBuilder();
        if (componentMetadata != null) {
            for (ComponentMetadata metadata : componentMetadata) {
                sb.append(metadata.generateCss());
            }
        }
        return sb.toString();
    }

    @Override
    public String generateJs() {
        return generate().replace("\n", "\n// ");
    }
}
