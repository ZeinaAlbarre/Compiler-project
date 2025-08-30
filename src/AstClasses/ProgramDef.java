package AstClasses;

// ProgramDef.java
public class ProgramDef extends Program {
    private SourceElement sourceElement;

    public void setSourceElement(SourceElement s){ this.sourceElement = s; }

    @Override
    public void PrintAst() {
        if (sourceElement != null) sourceElement.PrintAst();
    }

    @Override
    public String generate() {
        return (sourceElement != null) ? sourceElement.generate() : "";
    }

    @Override
    public String generateHtml() {
        return (sourceElement != null) ? sourceElement.generateHtml() : "";
    }

    @Override
    public String generateCss() {
        return (sourceElement != null) ? sourceElement.generateCss() : "";
    }

    @Override
    public String generateJs() {
        return (sourceElement != null) ? sourceElement.generateJs() : "";
    }
}