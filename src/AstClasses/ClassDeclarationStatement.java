package AstClasses;

public class ClassDeclarationStatement extends Statement {
    public ClassDeclaration classDecl;

    public ClassDeclarationStatement(ClassDeclaration classDecl) {
        this.classDecl = classDecl;
    }

    @Override
    public void PrintAst() {
        System.out.println("ClassDeclarationStatement:");
        if (classDecl != null) classDecl.PrintAst();
    }
}