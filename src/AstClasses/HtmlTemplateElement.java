package AstClasses;

import java.util.ArrayList;
import java.util.List;

public class HtmlTemplateElement extends HtmlElement {
    public List<TemplatePart> templateParts;

    public HtmlTemplateElement() {
        this.templateParts = new ArrayList<>();
    }

    public void setTemplateParts(TemplatePart templatePart) {
        templateParts.add(templatePart);
    }

    @Override
    public void PrintAst() {
        if (templateParts != null) {
            for (TemplatePart part : templateParts) {
                part.PrintAst();
            }
        }
    }

    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        if (templateParts != null) {
            for (TemplatePart part : templateParts) {
                sb.append(part.generate());
            }
        }
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
        return "// " + generate();
    }
}
