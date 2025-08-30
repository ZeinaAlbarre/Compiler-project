package AstClasses;

import java.util.ArrayList;
import java.util.List;

public class StyleUrlsDefinition2 extends StyleProperty {

    private final List<StyleContent> contents = new ArrayList<>();

    public void addContent(StyleContent content) {
        if (content != null) contents.add(content);
    }

    @Override
    public void PrintAst() {
        System.out.println("styles {");
        if (contents != null) {
            for (StyleContent c : contents) {
                System.out.print("  ");
                c.PrintAst();
            }
        }
        System.out.println("}");
    }

    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        sb.append("styles: [`\n");
        if (contents != null) {
            for (StyleContent c : contents) {
                sb.append("  ").append(c.generate()).append("\n");
            }
        }
        sb.append("`]");
        return sb.toString();
    }

    @Override
    public String generateCss() {
        StringBuilder sb = new StringBuilder();
        if (contents != null) {
            for (StyleContent c : contents) {
                sb.append(c.generateCss()).append("\n");
            }
        }
        return sb.toString();
    }

    @Override
    public String generateHtml() {
        return "";
    }

    @Override
    public String generateJs() {
        return "// " + generate().replace("\n", "\n// ");
    }
}
