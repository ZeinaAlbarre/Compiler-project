package SymbolTable;

import java.util.HashMap;
import java.util.Map;

public class ImportSymbolTable {
    private Map<String, String> imports = new HashMap<>();
    public boolean addImport(String name, String fromPath) {
        if (imports.containsKey(name)) {
            return false;
        }
        imports.put(name, fromPath);
        return true;
    }
}