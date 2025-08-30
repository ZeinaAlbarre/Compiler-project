package AstClasses;

public class HtmlAttributeDefinition3 extends HtmlAttribute {
    public String eventName;
    public String handler;

    public HtmlAttributeDefinition3(String eventName, String handler) {
        this.eventName = eventName;
        this.handler = handler;
    }

    @Override
    public void PrintAst() {
        String cleanHandler = handler.startsWith("\"") ? handler.substring(1, handler.length() - 1) : handler;
        System.out.print("(" + eventName + ")=\"" + cleanHandler + "\"");
    }

    @Override
    public String generate() {
        String ev = eventName != null ? eventName.trim() : "";
        String h  = handler != null ? handler.trim() : "";

        if (h.startsWith("\"") && h.endsWith("\"") && h.length() >= 2) {
            h = h.substring(1, h.length() - 1).trim();
        }
        return "(" + ev + ")=\"" + h + "\"";
    }

    @Override
    public String generateHtml() {
        return generate();
    }


}
