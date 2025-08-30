package SymbolTable;

import java.util.*;

public class ObjectPropertySymbolTable {
    private static final ObjectPropertySymbolTable instance = new ObjectPropertySymbolTable();

    private final Map<String, Set<String>> objectProperties = new HashMap<>();

    public static ObjectPropertySymbolTable getInstance() {
        return instance;
    }

    public void addObjectProperty(String objectName, String propertyName) {
        objectProperties.computeIfAbsent(objectName, k -> new HashSet<>()).add(propertyName);
    }

    public void addObjectProperties(String objectName, Collection<String> properties) {
        if (properties == null) return;
        objectProperties.computeIfAbsent(objectName, k -> new HashSet<>()).addAll(properties);
    }

    public Set<String> getProperties(String objectName) {
        return objectProperties.get(objectName);
    }

    public void copyProperties(String fromName, String toName) {
        Set<String> props = objectProperties.get(fromName);
        if (props != null) {
            addObjectProperties(toName, props);
        }
    }

    public boolean hasProperty(String objectName, String propertyName) {
        return objectProperties.containsKey(objectName) && objectProperties.get(objectName).contains(propertyName);
    }
}