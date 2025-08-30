package ErrorHandler;

public class VariableTypeErrorHandler {
    private static final VariableTypeErrorHandler instance = new VariableTypeErrorHandler();

    private VariableTypeErrorHandler() {}

    public static VariableTypeErrorHandler getInstance() {
        return instance;
    }

    public void log(int line, String propertyName, String objectName) {
        System.err.println("Error at line " + line + "Invalid property '" + propertyName + "' for variable '" + objectName + "'");
    }
}
