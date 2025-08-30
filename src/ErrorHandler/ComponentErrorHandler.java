package ErrorHandler;

public class ComponentErrorHandler extends ErrorHandler{

    private static final ComponentErrorHandler instance = new ComponentErrorHandler();

    private ComponentErrorHandler() {}

    public static ComponentErrorHandler getInstance() {
        return instance;
    }

    public void log(int line, String message) {
        System.err.println("Error at line " + line + ": [DuplicateProperty] " + message );
    }
}
