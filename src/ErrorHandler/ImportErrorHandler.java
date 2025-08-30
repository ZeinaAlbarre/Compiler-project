package ErrorHandler;

public class ImportErrorHandler extends ErrorHandler{

    private static final ImportErrorHandler instance = new ImportErrorHandler();

    private ImportErrorHandler() {}

    public static ImportErrorHandler getInstance() {
        return instance;
    }

    public void log(int line, String importedName) {
        System.err.println("Error at line " + line + ":" + "Import identifier '" + importedName + "' is already imported from another module.");
    }
}

