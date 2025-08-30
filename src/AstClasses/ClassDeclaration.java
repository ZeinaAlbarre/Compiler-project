package AstClasses;

public abstract class ClassDeclaration extends ASTNode {

    ClassDefinition classDefinition;

    public ClassDefinition getClassDefinition() {
        return classDefinition;
    }

    public void setClassDefinition(ClassDefinition classDefinition) {
        this.classDefinition = classDefinition;
    }

    public void PrintAst() {
        if (classDefinition != null) {
            classDefinition.PrintAst();
        }
    }
}

