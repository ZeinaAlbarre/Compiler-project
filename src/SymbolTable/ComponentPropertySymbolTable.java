package SymbolTable;

import java.util.HashSet;
import java.util.Set;

public class ComponentPropertySymbolTable {
    private static final ComponentPropertySymbolTable instance = new ComponentPropertySymbolTable();

    private ComponentPropertySymbolTable() {}

    public static ComponentPropertySymbolTable getInstance() {
        return instance;
    }

    private final Set<String> propertyNames = new HashSet<>();

    public boolean addProperty(String name) {
        return propertyNames.add(name);
    }

    public void reset() {
        propertyNames.clear();
    }
}
