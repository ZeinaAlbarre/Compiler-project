package SymbolTable;

import java.util.HashMap;
import java.util.Map;

public class ClickMethodSymbolTable {
    private static final ClickMethodSymbolTable instance = new ClickMethodSymbolTable();

    public static ClickMethodSymbolTable getInstance() {
        return instance;
    }

    private final Map<String, String> componentMethods = new HashMap<>();

    public void addComponentMethod(String name) {
        componentMethods.put(name, name);
    }
    public boolean hasMethod(String name) {
        return componentMethods.containsKey(name);
    }

    public String getMethod(String name) {
        return componentMethods.get(name);
    }
}
