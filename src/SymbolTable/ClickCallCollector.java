package SymbolTable;

import ErrorHandler.ClickMethodErrorHandler;
import java.util.ArrayList;
import java.util.List;

public class ClickCallCollector {

    private final List<ClickCall> calls = new ArrayList<>();

    public void addEventCall(String eventName, String methodName, int line) {
        calls.add(new ClickCall(eventName, methodName, line));
    }

    public void addClickCall(String methodName, int line) {
        addEventCall("click", methodName, line);
    }

    public void checkAll() {
        for (ClickCall c : calls) {
            if (!ClickMethodSymbolTable.getInstance().hasMethod(c.methodName)) {
                ClickMethodErrorHandler.getInstance()
                        .log(c.line, "Method '" + c.methodName + "' (for event '" + c.eventName + "') is not defined.");
            }
        }
    }

    public static class ClickCall {
        public final String eventName;
        public final String methodName;
        public final int line;

        public ClickCall(String eventName, String methodName, int line) {
            this.eventName = eventName;
            this.methodName = methodName;
            this.line = line;
        }
    }
}