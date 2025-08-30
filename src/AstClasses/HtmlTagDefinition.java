package AstClasses;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HtmlTagDefinition extends HtmlTag {
    private final String openTagToken;
    private String closeTagToken;
    private final boolean selfClosing;

    private final List<HtmlElement> innerElements    = new ArrayList<>();
    private final List<HtmlElement> trailingElements = new ArrayList<>();
    private final List<HtmlAttribute> attributes     = new ArrayList<>();
    private final List<NgDirective> directives       = new ArrayList<>();

    public HtmlTagDefinition(String openTagToken, String closeTagToken, boolean selfClosing) {
        this.openTagToken  = openTagToken;
        this.closeTagToken = closeTagToken;
        this.selfClosing   = selfClosing;
    }

    public void addInnerElement(HtmlElement el)    { if (el != null) innerElements.add(el); }
    public void addTrailingElement(HtmlElement el) { if (el != null) trailingElements.add(el); }
    public void addAttribute(HtmlAttribute a)      { if (a  != null) attributes.add(a); }
    public void addDirective(NgDirective d)        { if (d  != null) directives.add(d); }

    @Override
    public void PrintAst() {
        String open = normalizeTagName(openTagToken);
        String close= (closeTagToken != null) ? normalizeTagName(closeTagToken) : open;
        System.out.println("HtmlTagDefinition <" + open + ">" + (selfClosing ? " (selfClosing)" : ""));
        for (HtmlAttribute a : attributes) { System.out.print("  Attr: "); a.PrintAst(); System.out.println(); }
        for (NgDirective d : directives)   { System.out.print("  Dir : "); d.PrintAst(); System.out.println(); }
        for (HtmlElement e : innerElements){ System.out.print("  In  : "); e.PrintAst(); }
        for (HtmlElement e : trailingElements){ System.out.print("  After: "); e.PrintAst(); }
    }

    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();

        String openName = normalizeTagName(openTagToken);
        String closeNameFromToken = (closeTagToken != null && !closeTagToken.isEmpty())
                ? normalizeTagName(closeTagToken)
                : openName;

        String closeName = openName.equalsIgnoreCase(closeNameFromToken)
                ? closeNameFromToken
                : openName;

        for (java.util.Iterator<HtmlElement> it = innerElements.iterator(); it.hasNext();) {
            HtmlElement el = it.next();
            if (el instanceof HtmlNgDirectiveElement) {
                HtmlNgDirectiveElement nde = (HtmlNgDirectiveElement) el;
                if (nde.ngDirectives != null) {
                    directives.addAll(nde.ngDirectives);
                }
                it.remove();
            }
        }
        for (java.util.Iterator<HtmlElement> it = trailingElements.iterator(); it.hasNext();) {
            HtmlElement el = it.next();
            if (el instanceof HtmlNgDirectiveElement) {
                HtmlNgDirectiveElement nde = (HtmlNgDirectiveElement) el;
                if (nde.ngDirectives != null) directives.addAll(nde.ngDirectives);
                it.remove();
            }
        }

        sb.append("<").append(openName);

        for (NgDirective d : directives) {
            sb.append(" ").append(d.generate());
        }

        List<HtmlAttribute> normalAttrs = new ArrayList<>();
        List<HtmlAttribute> interps = new ArrayList<>();

        for (HtmlAttribute a : attributes) {
            if (a instanceof HtmlAttributeDefinition2) {
                interps.add(a);
            } else {
                normalAttrs.add(a);
            }
        }

        for (HtmlAttribute a : normalAttrs) {
            sb.append(" ").append(a.generate());
        }

        StringBuilder ngHeader = new StringBuilder();
        if ("ng-template".equalsIgnoreCase(openName)) {
            for (java.util.Iterator<HtmlElement> it2 = innerElements.iterator(); it2.hasNext();) {
                HtmlElement el2 = it2.next();
                if (el2 instanceof HtmlTemplateElement) {
                    String header = el2.generate();
                    if (header != null && !header.trim().isEmpty()) {
                        if (ngHeader.length() > 0) ngHeader.append(" ");
                        ngHeader.append(header.trim());
                    }
                    it2.remove();
                }
            }
            if (ngHeader.length() > 0) {
                sb.append(" ").append(ngHeader);
            }
        }

        boolean hasInner = !innerElements.isEmpty();
        if (selfClosing && !hasInner) {
            sb.append(" />");
        } else {
            sb.append(">");
            for (HtmlAttribute a : interps) {
                sb.append(a.generateHtml());
            }
            for (HtmlElement e : innerElements) {
                sb.append(e.generate());
            }
            sb.append("</").append(closeName).append(">");
        }

        boolean stopAfterNgTemplate = false;
        for (HtmlElement e : trailingElements) {
            if (e == null) continue;
            String gen = e.generate();
            if (gen == null) continue;
            String trimmed = gen.trim();
            if (trimmed.isEmpty()) continue;
            if (trimmed.startsWith("<ng-template")) {
                sb.append("</div>").append(gen);
                break;
            }
            if (trimmed.equalsIgnoreCase("</div>") || trimmed.startsWith("</")) {
                continue;
            }
            sb.append(gen);
        }

        String out = sb.toString();
        out = out.replaceAll("(?is)(</ng-template>)[\\s\\r\\n]*</\\s*div\\s*>\\s*$", "$1");
        out = out.replaceAll("(?is)<ng-template>(\\s*)#(\\w+)(\\s*)</ng-template>", "<ng-template #$2></ng-template>");
        out = out.replaceAll("(?is)<ng-template>(\\s*)</ng-template>\\s*#(\\w+)", "<ng-template #$2></ng-template>");

        return out;
    }
    private String getOpenRawToken() {
        return openTagToken;
    }

    @Override public String generateHtml() { return generate(); }
    @Override public String generateCss()  { return ""; }
    @Override public String generateJs()   { return "// " + generate().replace("\n", "\n// "); }
    private static String normalizeTagName(String t) {
        if (t == null) return "";
        t = t.trim();
        if (t.startsWith("</")) t = t.substring(2);
        else if (t.startsWith("<")) t = t.substring(1);
        if (t.endsWith("/>")) t = t.substring(0, t.length() - 2);
        else if (t.endsWith(">"))  t = t.substring(0, t.length() - 1);
        return t.trim();
    }
}