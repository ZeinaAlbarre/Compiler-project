package AstClasses;

import java.util.ArrayList;
import java.util.List;

public class DirectiveNgFor extends NgDirective {
    private final List<NgDirective> defs = new ArrayList<>();

    public void addDef(NgDirective def) {
        if (def != null) defs.add(def);
    }

    @Override
    public void PrintAst() {
        for (NgDirective d : defs) d.PrintAst();
    }

    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        for (NgDirective d : defs) {
            if (sb.length() > 0) sb.append(" ");
            sb.append(d.generate());
        }
        return sb.toString();
    }

    @Override
    public String generateHtml() { return generate(); }

    @Override
    public String generateJs() { return generate(); }
}