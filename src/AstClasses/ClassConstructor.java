package AstClasses;

import java.util.List;
import java.util.stream.Collectors;

public class ClassConstructor extends ClassMember {
    private List<Decorator> decorators;
    private ConstructorDeclaration constructor;

    public List<Decorator> getDecorators() { return decorators; }
    public void setDecorators(List<Decorator> decorators) { this.decorators = decorators; }
    public ConstructorDeclaration getConstructor() { return constructor; }
    public void setConstructor(ConstructorDeclaration constructor) { this.constructor = constructor; }

    @Override
    public void PrintAst() {
        System.out.println("ClassConstructor:");
        if (decorators != null) for (Decorator d : decorators) d.PrintAst();
        if (constructor != null) constructor.PrintAst();
    }

    @Override
    public String generate() {
        String decos = (decorators == null) ? "" :
                decorators.stream().map(Decorator::generate)
                        .filter(s -> s != null && !s.isEmpty())
                        .collect(Collectors.joining("\n"));
        String decl = constructor != null ? constructor.generate() : "";
        return (decos.isEmpty() ? "" : decos + "\n") + decl;
    }


    @Override
    public String generateJs() {
        return  generate().replace("\n", "\n// ");
    }
}
