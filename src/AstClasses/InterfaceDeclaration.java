package AstClasses;

public abstract class InterfaceDeclaration extends ASTNode {
    InterfaceDefinition interfaceDefinition;

    public InterfaceDefinition getInterfaceDefinition() {
        return interfaceDefinition;
    }

    public void setInterfaceDefinition(InterfaceDefinition interfaceDefinition) {
        this.interfaceDefinition = interfaceDefinition;
    }


    @Override
    public void PrintAst() {
        if(interfaceDefinition !=null) {
            interfaceDefinition.PrintAst();
        }
    }
}
