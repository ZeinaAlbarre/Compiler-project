package AstClasses;

import java.util.ArrayList;
import java.util.List;

public class TemplateStringDefinition extends TemplateString {
    private final List<TemplateContent> templateContents = new ArrayList<>();
    private final List<HtmlTemplate>     htmlTemplates    = new ArrayList<>();

    public void setTemplateContents(TemplateContent c) {
        if (c != null) templateContents.add(c);
    }
    public void setHtmlTemplates(HtmlTemplate h) {
        if (h != null) htmlTemplates.add(h);
    }

    @Override
    public void PrintAst() {
        System.out.println("");
        for (TemplateContent c : templateContents) c.PrintAst();
        for (HtmlTemplate h : htmlTemplates)       h.PrintAst();
        System.out.println("");
    }

    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        sb.append('`');
        for (TemplateContent c : templateContents) sb.append(c.generate());
        for (HtmlTemplate h : htmlTemplates)       sb.append(h.generate());
        sb.append('`');
        return sb.toString();
    }

    @Override
    public String generateHtml() {
        StringBuilder sb = new StringBuilder();
        for (TemplateContent c : templateContents) sb.append(c.generateHtml());
        for (HtmlTemplate h : htmlTemplates)       sb.append(h.generateHtml());
        return sb.toString();
    }

    @Override
    public String generateCss() { return ""; }

    @Override
    public String generateJs() {
        return generate().replace("\n", "\n// ");
    }
}