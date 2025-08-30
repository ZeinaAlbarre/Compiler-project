package AstClasses;

public class PropertyAssignment extends ASTNode{
    PropertyAssignmentDefinition propertyAssignmentDefinition;
    ShorthandPropertyAssignment shorthandPropertyAssignment;

    SpreadProperty spreadProperty;
    public PropertyAssignmentDefinition getPropertyAssignmentDefinition() {
        return propertyAssignmentDefinition;
    }

    public void setPropertyAssignmentDefinition(PropertyAssignmentDefinition propertyAssignmentDefinition) {
        this.propertyAssignmentDefinition = propertyAssignmentDefinition;
    }

    public ShorthandPropertyAssignment getShorthandPropertyAssignment() {
        return shorthandPropertyAssignment;
    }

    public void setShorthandPropertyAssignment(ShorthandPropertyAssignment shorthandPropertyAssignment) {
        this.shorthandPropertyAssignment = shorthandPropertyAssignment;
    }

    public void setSpreadProperty(SpreadProperty spreadProperty) {
        this.spreadProperty = spreadProperty;
    }

    public void PrintAst() {
        if (propertyAssignmentDefinition != null) {
            propertyAssignmentDefinition.PrintAst();
        }
        if (shorthandPropertyAssignment != null) {
            shorthandPropertyAssignment.PrintAst();
        }
        if (spreadProperty != null) {
            spreadProperty.PrintAst();
        }
    }


    @Override
    public String generate() {
        if (propertyAssignmentDefinition != null) {
            return propertyAssignmentDefinition.generate();
        }
        if (shorthandPropertyAssignment != null) {
            return shorthandPropertyAssignment.generate();
        }
        if (spreadProperty != null) {
            return spreadProperty.generate();
        }
        return "";
    }
}
