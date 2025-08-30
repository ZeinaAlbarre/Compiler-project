package AstClasses;

import java.util.ArrayList;
import java.util.List;

public class HtmlTagElement extends HtmlElement {
    public final List<HtmlTag> htmlTags = new ArrayList<>();

    public void addHtmlTag(HtmlTag tag) {
        if (tag != null) htmlTags.add(tag);
    }

    @Override
    public void PrintAst() {
        System.out.println("tag element");
        for (HtmlTag t : htmlTags) t.PrintAst();
    }

    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        for (HtmlTag t : htmlTags) sb.append(t.generate());
        return sb.toString();
    }

    @Override
    public String generateHtml() {
        StringBuilder sb = new StringBuilder();
        for (HtmlTag t : htmlTags) sb.append(t.generateHtml());
        return sb.toString();
    }

    @Override
    public String generateCss() { return ""; }

    @Override
    public String generateJs() { return "// " + generate().replace("\n", "\n// "); }
}