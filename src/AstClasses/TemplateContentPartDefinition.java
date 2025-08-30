package AstClasses;

import java.util.ArrayList;
import java.util.List;

public class TemplateContentPartDefinition extends TemplateContent {
    public List<TemplatePart> templateParts;

    public TemplateContentPartDefinition() {
        this.templateParts = new ArrayList<>();
    }

    public void setTemplateParts(TemplatePart templatePart) {
        templateParts.add(templatePart);
    }

    @Override
    public void PrintAst() {
        System.out.println("`");
        if (templateParts != null) {
            for (TemplatePart part : templateParts) {
                part.PrintAst();
            }
        }
        System.out.println("`");
    }

    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        sb.append("`");
        if (templateParts != null) {
            for (TemplatePart part : templateParts) {
                sb.append(part.generate());
            }
        }
        sb.append("`");
        return sb.toString();
    }

    @Override
    public String generateHtml() {
        StringBuilder sb = new StringBuilder();
        if (templateParts != null) {
            for (TemplatePart part : templateParts) {
                sb.append(part.generateHtml());
            }
        }
        return sb.toString();
    }


    @Override
    public String generateJs() {
        return "// " + generate().replace("\n", "\n// ");
    }
}
