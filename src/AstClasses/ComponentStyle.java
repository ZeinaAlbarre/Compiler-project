package AstClasses;

public class ComponentStyle extends ComponentProperty {
    private StyleProperty style;

    public ComponentStyle(StyleProperty style) {
        this.style = style;
    }

    public StyleProperty getStyle() { return style; }
    public void setStyle(StyleProperty style) { this.style = style; }

    @Override
    public String getKey() {
        if (style instanceof StyleUrlsDefinition) return "styleUrls";
        else if (style instanceof StyleUrlsDefinition2) return "styles";
        else return "style";
    }

    @Override
    public void PrintAst() {
        System.out.println(getKey() + ":");
        if (style != null) {
            System.out.print("  ");
            style.PrintAst();
        }
    }

    @Override
    public String generate() {
        return (style != null) ? style.generate() : "";
    }


    @Override
    public String generateCss() {
        return (style != null) ? style.generateCss() : "";
    }

    @Override
    public String generateJs() {
        return  generate();
    }
}
