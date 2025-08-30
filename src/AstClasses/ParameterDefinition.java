package AstClasses;

public class ParameterDefinition extends Parameter{
    private String identifier;
    private TypeAnnotation typeAnnotation;

    public String getIdentifier() { return identifier; }
    public void setIdentifier(String identifier) { this.identifier = identifier; }

    public TypeAnnotation getTypeAnnotation() { return typeAnnotation; }
    public void setTypeAnnotation(TypeAnnotation typeAnnotation) { this.typeAnnotation = typeAnnotation; }

    @Override
    public void PrintAst() {
        System.out.println("Parameter: " + (identifier != null ? identifier : ""));
        if (typeAnnotation != null) typeAnnotation.PrintAst();
    }

    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        sb.append(identifier != null ? identifier : "");
        if (typeAnnotation != null) {
            sb.append(": ").append(typeAnnotation.generate());
        }
        return sb.toString();
    }

    @Override
    public String generateJs() {
        return identifier != null ? identifier : "";
    }


}