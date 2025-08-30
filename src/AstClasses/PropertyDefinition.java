package AstClasses;

public class PropertyDefinition extends PropertyDeclaration {
    private String accessModifier;
    private String identifier;
    private TypeAnnotation typeAnnotation;
    private Expression expression;

    public String getAccessModifier() { return accessModifier; }
    public void setAccessModifier(String accessModifier) { this.accessModifier = accessModifier; }
    public String getIdentifier() { return identifier; }
    public void setIdentifier(String identifier) { this.identifier = identifier; }
    public TypeAnnotation getTypeAnnotation() { return typeAnnotation; }
    public void setTypeAnnotation(TypeAnnotation typeAnnotation) { this.typeAnnotation = typeAnnotation; }
    public Expression getExpression() { return expression; }
    public void setExpression(Expression expression) { this.expression = expression; }

    @Override
    public void PrintAst() {
        if (accessModifier != null) System.out.print(accessModifier + " ");
        System.out.print(identifier);
        if (typeAnnotation != null) { System.out.print(": "); typeAnnotation.PrintAst(); }
        if (expression != null) { System.out.print(" = "); expression.PrintAst(); }
        System.out.println(";");
    }

    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        if (accessModifier != null) sb.append(accessModifier).append(" ");
        sb.append(identifier);
        if (typeAnnotation != null) sb.append(": ").append(typeAnnotation.generate());
        if (expression != null) sb.append(" = ").append(expression.generate());
        sb.append(";");
        return sb.toString();
    }

    @Override
    public String generateJs() {
        StringBuilder sb = new StringBuilder();
        sb.append(identifier);
        if (expression != null) sb.append(" = ").append(expression.generateJs().isEmpty() ? expression.generate() : expression.generateJs());
        sb.append(";");
        return sb.toString();
    }
}