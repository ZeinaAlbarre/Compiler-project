package AstClasses;

import java.util.List;

public class MethodDefinition extends MethodDeclaration {
    private String accessModifier;
    private String identifier;
    private List<ParameterList> parameterList;
    private TypeAnnotation typeAnnotation;
    private List<Statement> statements;


    public String getAccessModifier() {
        return accessModifier;
    }

    public void setAccessModifier(String accessModifier) {
        this.accessModifier = accessModifier;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public List<ParameterList> getParameterList() {
        return parameterList;
    }

    public void setParameterList(List<ParameterList> parameterList) {
        this.parameterList = parameterList;
    }

    public TypeAnnotation getTypeAnnotation() {
        return typeAnnotation;
    }

    public void setTypeAnnotation(TypeAnnotation typeAnnotation) {
        this.typeAnnotation = typeAnnotation;
    }

    public List<Statement> getStatements() {
        return statements;
    }

    public void setStatements(List<Statement> statements) {
        this.statements = statements;
    }

    @Override
    public void PrintAst() {
        System.out.println("MethodDefinition: " + identifier );
        if (typeAnnotation != null) typeAnnotation.PrintAst();
        if (parameterList != null) {
            for (ParameterList p : parameterList) p.PrintAst();
        }
        if (statements != null) {
            for (Statement s : statements) s.PrintAst();
        }
    }
    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        if (accessModifier != null) {
            sb.append(accessModifier).append(" ");
        }
        sb.append(identifier).append("(");
        if (parameterList != null && !parameterList.isEmpty()) {
            sb.append(String.join(", ",
                    parameterList.stream().map(ParameterList::generate)
                            .collect(java.util.stream.Collectors.toList())));
        }
        sb.append(")");
        if (typeAnnotation != null) {
            sb.append(": ").append(typeAnnotation.generate());
        }
        sb.append(" {\n");
        if (statements != null) {
            for (Statement s : statements) {
                sb.append("  ").append(s.generate()).append("\n");
            }
        }
        sb.append("}");
        return sb.toString();
    }

    @Override
    public String generateJs() {
        StringBuilder sb = new StringBuilder();
        sb.append(identifier).append("(");
        if (parameterList != null && !parameterList.isEmpty()) {
            sb.append(String.join(", ",
                    parameterList.stream().map(ParameterList::generateJs)
                            .collect(java.util.stream.Collectors.toList())));
        }
        sb.append(") {\n");
        if (statements != null) {
            for (Statement s : statements) {
                sb.append("  ").append(s.generateJs()).append("\n");
            }
        }
        sb.append("}");
        return sb.toString();
    }

    @Override
    public String generateHtml() { return ""; }

    @Override
    public String generateCss() { return ""; }

}
