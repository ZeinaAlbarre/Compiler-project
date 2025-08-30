package AstClasses;

import java.util.ArrayList;
import java.util.List;

public class DirectiveNgStyle extends NgDirective {
    public List<NgStyleDirective> ngStyleDirectives;

    public DirectiveNgStyle() {
        this.ngStyleDirectives = new ArrayList<>();
    }

    public void setHtmlElements(NgStyleDirective ngStyleDirective) {
        ngStyleDirectives.add(ngStyleDirective);
    }

    @Override
    public void PrintAst() {
        if (ngStyleDirectives != null) {
            for (NgStyleDirective directive : ngStyleDirectives) {
                directive.PrintAst();
            }
        }
    }

    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        if (ngStyleDirectives != null) {
            for (NgStyleDirective directive : ngStyleDirectives) {
                sb.append(directive.generate());
            }
        }
        return sb.toString();
    }

    @Override
    public String generateHtml() {
        StringBuilder sb = new StringBuilder();
        if (ngStyleDirectives != null) {
            for (NgStyleDirective directive : ngStyleDirectives) {
                sb.append(directive.generateHtml());
            }
        }
        return sb.toString();
    }

    @Override
    public String generateCss() {
        StringBuilder sb = new StringBuilder();
        if (ngStyleDirectives != null) {
            for (NgStyleDirective directive : ngStyleDirectives) {
                sb.append(directive.generateCss());
            }
        }
        return sb.toString();
    }

    @Override
    public String generateJs() {
        return  generate().replace("\n", "\n// ");
    }
}
