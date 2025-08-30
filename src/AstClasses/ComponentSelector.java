package AstClasses;

public class ComponentSelector extends ComponentProperty {
    private SelectorProperty selectorProperty;

    public SelectorProperty getSelectorProperty() {
        return selectorProperty;
    }

    public void setSelectorProperty(SelectorProperty selectorProperty) {
        this.selectorProperty = selectorProperty;
    }

    @Override
    public String getKey() {
        return "selector";
    }

    @Override
    public void PrintAst() {
        System.out.print("selector: ");
        if (selectorProperty != null) {
            selectorProperty.PrintAst();
        }
        System.out.println();
    }

    @Override
    public String generate() {
        return (selectorProperty != null)
                ? "selector: \"" + selectorProperty.generate() + "\""
                : "selector: \"\"";
    }

    @Override
    public String generateJs() {
        return  generate();
    }
}
