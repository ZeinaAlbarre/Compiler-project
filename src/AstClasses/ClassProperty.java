package AstClasses;

import java.util.List;
import java.util.stream.Collectors;

public class ClassProperty extends ClassMember {
    private List<Decorator> decorators;
    private PropertyDeclaration declaration;

    public List<Decorator> getDecorators() { return decorators; }
    public void setDecorators(List<Decorator> decorators) { this.decorators = decorators; }
    public PropertyDeclaration getDeclaration() { return declaration; }
    public void setDeclaration(PropertyDeclaration declaration) { this.declaration = declaration; }

    @Override
    public void PrintAst() {
        System.out.println("ClassProperty:");
        if (decorators != null) for (Decorator d : decorators) d.PrintAst();
        if (declaration != null) declaration.PrintAst();
    }

    @Override
    public String generate() {
        String decos = (decorators == null) ? "" :
                decorators.stream().map(Decorator::generate)
                        .filter(s -> s != null && !s.isEmpty())
                        .collect(Collectors.joining("\n"));
        String decl = declaration != null ? declaration.generate() : "";
        return (decos.isEmpty() ? "" : decos + "\n") + decl;
    }


    @Override
    public String generateJs() {
        String decos = (decorators == null) ? "" :
                decorators.stream().map(Decorator::generateJs)
                        .filter(s -> s != null && !s.isEmpty())
                        .collect(Collectors.joining("\n"));
        String decl = declaration != null ? declaration.generateJs() : "";
        return (decos.isEmpty() ? "" : decos + "\n") + decl;
    }
}
