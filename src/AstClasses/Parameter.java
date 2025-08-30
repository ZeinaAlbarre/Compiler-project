package AstClasses;

public class Parameter extends ASTNode {
    ParameterDefinition parameterDefinition;

    public ParameterDefinition getParameterDefinition() {
        return parameterDefinition;
    }

    public void setParameterDefinition(ParameterDefinition parameterDefinition) {
        this.parameterDefinition = parameterDefinition;
    }

    public void PrintAst() {
        if (parameterDefinition != null) {
            parameterDefinition.PrintAst();
        }
    }
}
