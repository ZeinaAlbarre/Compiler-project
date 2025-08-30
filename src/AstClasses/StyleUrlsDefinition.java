package AstClasses;

import java.util.ArrayList;
import java.util.List;

public class StyleUrlsDefinition extends StyleProperty {
    private final List<String> urls = new ArrayList<>();

    public void addUrl(String url) {
        urls.add(url);
    }

    public List<String> getUrls() {
        return urls;
    }

    @Override
    public void PrintAst() {
        System.out.print("styleUrls: [");
        for (int i = 0; i < urls.size(); i++) {
            if (i > 0) System.out.print(", ");
            System.out.print("'" + urls.get(i) + "'");
        }
        System.out.println("]");
    }

    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        sb.append("styleUrls: [");
        for (int i = 0; i < urls.size(); i++) {
            if (i > 0) sb.append(", ");
            sb.append("'").append(urls.get(i)).append("'");
        }
        sb.append("]");
        return sb.toString();
    }

    @Override
    public String generateJs() {
        return "// " + generate();
    }
}
