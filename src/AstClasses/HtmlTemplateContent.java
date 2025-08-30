package AstClasses;

import java.util.ArrayList;
import java.util.List;

public class HtmlTemplateContent extends HtmlTemplate {
    public final List<HtmlElement> htmlElements = new ArrayList<>();

    public void addHtmlElement(HtmlElement el) {
        if (el != null) htmlElements.add(el);
    }

    @Override
    public void PrintAst() {
        System.out.println("template content");
        for (HtmlElement el : htmlElements) el.PrintAst();
    }

    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        for (HtmlElement el : htmlElements) sb.append(el.generate());
        return sb.toString();
    }

    @Override
    public String generateHtml() {
        StringBuilder sb = new StringBuilder();
        for (HtmlElement el : htmlElements) sb.append(el.generateHtml());
        return sb.toString();
    }

    @Override
    public String generateCss() { return ""; }

    @Override
    public String generateJs() { return "// " + generate().replace("\n", "\n// "); }
}