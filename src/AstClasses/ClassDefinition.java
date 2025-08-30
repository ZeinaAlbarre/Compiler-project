package AstClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ClassDefinition extends ClassDeclaration {
    private final String name;
    private final String superClass;
    private final String interfaceName;
    private final List<Decorator> decorators = new ArrayList<>();
    private final List<ClassMember> members = new ArrayList<>();

    public ClassDefinition(String name, String superClass, String interfaceName) {
        this.name = name;
        this.superClass = superClass;
        this.interfaceName = interfaceName;
    }

    public void addDecorator(Decorator d) { if (d != null) decorators.add(d); }
    public void addMember(ClassMember m)  { if (m != null) members.add(m); }

    @Override
    public void PrintAst() {
        System.out.println("ClassDefinition: " + name);
        if (!decorators.isEmpty()) {
            System.out.println("  Decorators:");
            for (Decorator d : decorators) { System.out.print("    "); d.PrintAst(); }
        }
        if (superClass != null) System.out.println("  Extends: " + superClass);
        if (interfaceName != null) System.out.println("  Implements: " + interfaceName);
        if (!members.isEmpty()) {
            System.out.println("  Members:");
            for (ClassMember m : members) { System.out.print("    "); m.PrintAst(); }
        }
    }

    @Override
    public String generate() {
        String decos = decorators.stream()
                .map(Decorator::generate)
                .filter(s -> s != null && !s.isEmpty())
                .collect(Collectors.joining("\n"));

        StringBuilder header = new StringBuilder();
        if (decos != null && !decos.isEmpty()) header.append(decos).append("\n");

        header.append("export class ").append(name);
        if (superClass != null) header.append(" extends ").append(superClass);
        if (interfaceName != null) header.append(" implements ").append(interfaceName);
        header.append(" {\n");

        StringBuilder body = new StringBuilder();
        for (ClassMember m : members) {
            String g = m.generate();
            if (g != null && !g.isEmpty()) {
                body.append("  ").append(g.replace("\n", "\n  ")).append("\n");
            }
        }

        return header.toString() + body + "}";
    }

    @Override
    public String generateJs() {
        String decos = decorators.stream()
                .map(Decorator::generateJs)
                .filter(s -> s != null && !s.isEmpty())
                .collect(Collectors.joining("\n"));
        StringBuilder header = new StringBuilder();
        if (decos != null && !decos.isEmpty()) header.append(decos).append("\n");

        header.append("class ").append(name);
        if (superClass != null) header.append(" extends ").append(superClass);
        header.append(" {\n");

        StringBuilder body = new StringBuilder();
        for (ClassMember m : members) {
            String g = m.generateJs();
            if (g != null && !g.isEmpty()) {
                body.append("  ").append(g.replace("\n", "\n  ")).append("\n");
            }
        }

        body.append("}");

        return header + body.toString();
    }

    @Override public String generateHtml() { return ""; }
    @Override public String generateCss()  { return ""; }
}