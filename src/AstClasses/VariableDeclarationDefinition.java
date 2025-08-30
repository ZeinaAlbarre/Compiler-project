package AstClasses;

public class VariableDeclarationDefinition extends VariableDeclaration {
    public String identifier;
    public TypeAnnotation typeAnnotation;
    public Expression expression;

    public VariableDeclarationDefinition(String identifier, TypeAnnotation typeAnnotation, Expression expression) {
        this.identifier = identifier;
        this.typeAnnotation = typeAnnotation;
        this.expression = expression;
    }

    @Override
    public void PrintAst() {
        System.out.println("VariableDeclarationDefinition(");
        System.out.println("  Identifier: " + identifier);

        System.out.print("  Type: ");
        if (typeAnnotation != null)
            typeAnnotation.PrintAst();
        else
            System.out.println("null");

        System.out.print("  InitialValue: ");
        if (expression != null)
            expression.PrintAst();
        else
            System.out.println("null");

        System.out.println(")");
    }

    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder("let ").append(identifier);
        if (typeAnnotation != null) sb.append(": ").append(typeAnnotation.generate());
        if (expression != null) sb.append(" = ").append(expression.generate());
        return sb.toString();
    }

    @Override
    public String generateJs() {
        StringBuilder sb = new StringBuilder("let ").append(identifier);
        if (expression != null) sb.append(" = ").append(expression.generateJs());
        return sb.toString();
    }


}
