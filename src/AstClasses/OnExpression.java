package AstClasses;

public class OnExpression extends Expression{
    public OnCall onCall;

    public OnCall getOnCall() {
        return onCall;
    }

    public void setOnCall(OnCall onCall) {
        this.onCall = onCall;
    }

    @Override
    public void PrintAst() {
        if (onCall != null) {
            onCall.PrintAst();
        }
    }
}
