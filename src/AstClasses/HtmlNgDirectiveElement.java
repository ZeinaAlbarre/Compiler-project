package AstClasses;

import java.util.ArrayList;
import java.util.List;

public class HtmlNgDirectiveElement extends HtmlElement {
    public final List<NgDirective> ngDirectives = new ArrayList<>();

    public void addNgDirective(NgDirective d) {
        if (d != null) ngDirectives.add(d);
    }

    @Override
    public void PrintAst() {
        for (NgDirective d : ngDirectives) d.PrintAst();
    }

    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        for (NgDirective d : ngDirectives) {
            if (sb.length() > 0) sb.append(" ");
            sb.append(d.generate());
        }
        return sb.toString();
    }

    @Override
    public String generateHtml() { return generate(); }

    @Override
    public String generateJs() { return  generate(); }
}