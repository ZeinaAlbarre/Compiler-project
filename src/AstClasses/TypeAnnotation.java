package AstClasses;

public class TypeAnnotation extends ASTNode {
    private String type;

    public TypeAnnotation(String type) {
        this.type = type;
    }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    @Override
    public void PrintAst() {
        System.out.print(type);
    }

    public String generate() { return type; }
    public String generateJs() { return ""; }
    public String generateHtml() { return ""; }
    public String generateCss() { return ""; }
}
