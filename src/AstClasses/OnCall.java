package AstClasses;

public class OnCall extends OnExpression {
    private String actionName;
    private ArrowFunction handler;

    public OnCall(String actionName, ArrowFunction handler) {
        this.actionName = actionName;
        this.handler = handler;
    }

    public String getActionName() {
        return actionName;
    }

    public ArrowFunction getHandler() {
        return handler;
    }

    @Override
    public void PrintAst() {
        System.out.println("OnExpression:");
        System.out.println("  Action: " + actionName);
        if (handler != null) {
            System.out.print("  Handler: ");
            handler.PrintAst();
        }
    }

    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        sb.append("OnExpression { action: ").append(actionName);
        if (handler != null) {
            sb.append(", handler: ").append(handler.generate());
        }
        sb.append(" }");
        return sb.toString();
    }


}
