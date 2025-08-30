package AstClasses;

public class StmtComponent extends Statement {
    private ComponentDeclaration componentDeclaration;

    public ComponentDeclaration getComponentDeclaration() {
        return componentDeclaration;
    }

    public void setComponentDeclaration(ComponentDeclaration componentDeclaration) {
        this.componentDeclaration = componentDeclaration;
    }

    @Override
    public void PrintAst() {
        System.out.println("StmtComponent:");
        if (componentDeclaration != null) {
            componentDeclaration.PrintAst();
        }
    }

    @Override
    public String generate() {
        return (componentDeclaration != null) ? componentDeclaration.generate() : "";
    }

    @Override
    public String generateHtml() {
        return (componentDeclaration != null) ? componentDeclaration.generateHtml() : "";
    }

    @Override
    public String generateCss() {
        return (componentDeclaration != null) ? componentDeclaration.generateCss() : "";
    }

    @Override
    public String generateJs() {
        return (componentDeclaration != null) ? componentDeclaration.generateJs() : "";
    }
}
