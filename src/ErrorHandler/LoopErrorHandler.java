package ErrorHandler;

public class LoopErrorHandler extends ErrorHandler{
    private static final LoopErrorHandler instance = new LoopErrorHandler();

    private LoopErrorHandler() {}

    public static LoopErrorHandler getInstance() {
        return instance;
    }

    public void log(String message) {
        System.err.println(message);
    }
}
