package AstClasses;

public abstract class ParameterList extends ASTNode{
    ParameterListDefinition parameterListDefinition;

    public ParameterListDefinition getParameterListDefinition() {
        return parameterListDefinition;
    }

    public void setParameterListDefinition(ParameterListDefinition parameterListDefinition) {
        this.parameterListDefinition = parameterListDefinition;
    }

    public void PrintAst() {
        if(parameterListDefinition !=null) {
            parameterListDefinition.PrintAst();
        }
    }
}
