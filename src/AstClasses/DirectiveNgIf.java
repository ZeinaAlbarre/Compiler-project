package AstClasses;

import java.util.ArrayList;
import java.util.List;

public class DirectiveNgIf extends NgDirective {
    private final List<NgDirective> parts = new ArrayList<>();

    public void add(NgDirective d) {
        if (d != null) parts.add(d);
    }

    @Override
    public void PrintAst() {
        for (NgDirective d : parts) d.PrintAst();
    }

    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < parts.size(); i++) {
            if (i > 0) sb.append(" ");
            sb.append(parts.get(i).generate());
        }
        return sb.toString();
    }

    @Override
    public String generateHtml() { return generate(); }

    @Override
    public String generateJs() { return  generate(); }
}