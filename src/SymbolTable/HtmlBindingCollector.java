package SymbolTable;

import ErrorHandler.VariableTypeErrorHandler;

import java.util.ArrayList;
import java.util.List;

public class HtmlBindingCollector {

    private final List<HtmlBinding> bindings = new ArrayList<>();

    public void addBinding(String objectName, String propertyName, int line) {
        bindings.add(new HtmlBinding(objectName, propertyName, line));
    }

    public void checkAll() {
        for (HtmlBinding binding : bindings) {
            if (!ObjectPropertySymbolTable.getInstance().hasProperty(binding.objectName, binding.propertyName)) {
                VariableTypeErrorHandler.getInstance().log(binding.line, binding.propertyName ,binding.objectName);

            }
        }
    }

    public static class HtmlBinding {
        public final String objectName;
        public final String propertyName;
        public final int line;

        public HtmlBinding(String objectName, String propertyName, int line) {
            this.objectName = objectName;
            this.propertyName = propertyName;
            this.line = line;
        }
    }
}
