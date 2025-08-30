package AstClasses;

public class InterfaceProperty extends ASTNode {

    InterfacePropertyDefinition interfacePropertyDefinition;

    public InterfacePropertyDefinition getInterfacePropertyDefinition() {
        return interfacePropertyDefinition;
    }

    public void setInterfacePropertyDefinition(InterfacePropertyDefinition interfacePropertyDefinition) {
        this.interfacePropertyDefinition = interfacePropertyDefinition;
    }

    public String getName() {
        if (interfacePropertyDefinition != null) {
            return interfacePropertyDefinition.getName();
        }
        return null;
    }


    @Override
    public void PrintAst() {
        if(interfacePropertyDefinition !=null) {
            interfacePropertyDefinition.PrintAst();
        }
    }
}