package AstClasses;

public class ObjectTypeMemberDefinition extends ObjectTypeMember {
    private final String key;
    private final TypeAnnotation type;

    public ObjectTypeMemberDefinition(String key, TypeAnnotation type) {
        this.key = key;
        this.type = type;
    }

    public String getKey() { return key; }
    public TypeAnnotation getType() { return type; }

    @Override
    public void PrintAst() {
        System.out.print(key + ": ");
        if (type != null) type.PrintAst();
    }

    @Override
    public String generate() {
        return key + ": " + (type != null ? type.generate() : "any");
    }

    @Override public String generateJs()   { return ""; }
    @Override public String generateHtml() { return ""; }
    @Override public String generateCss()  { return ""; }
}