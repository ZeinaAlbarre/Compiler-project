package ErrorHandler;

public class ClickMethodErrorHandler extends ErrorHandler{

    private static final ClickMethodErrorHandler instance = new ClickMethodErrorHandler();

    private ClickMethodErrorHandler() {
    }

    public static ClickMethodErrorHandler getInstance() {
        return instance;
    }

    public void log(int line, String message) {
        System.err.println("Error at line " + line + ": " + message);
    }
}
