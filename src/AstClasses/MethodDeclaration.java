package AstClasses;

public abstract class MethodDeclaration extends ASTNode{
    MethodDefinition methodDefinition;

    public MethodDefinition getMethodDefinition() {
        return methodDefinition;
    }

    public void setMethodDefinition(MethodDefinition methodDefinition) {
        this.methodDefinition = methodDefinition;
    }


    public void PrintAst() {
        if (methodDefinition != null) {
            methodDefinition.PrintAst();
        }
    }
}
