package AstClasses;

import java.util.ArrayList;
import java.util.List;

public class HtmlAttributeDefinition1 extends HtmlAttribute {

    public String identifier;
    public int leftBrackets = 0;
    public int rightBrackets = 0;
    public List<AttributeValue> attributeValues;

    public HtmlAttributeDefinition1(String identifier) {
        this.identifier = identifier;
        this.attributeValues = new ArrayList<>();
    }

    public void addAttributeValue(AttributeValue value) {
        attributeValues.add(value);
    }

    public void setBracketCounts(int left, int right) {
        this.leftBrackets = left;
        this.rightBrackets = right;
    }

    @Override
    public void PrintAst() {
        if (leftBrackets > 0) System.out.print("[");
        System.out.print(identifier);
        if (rightBrackets > 0) System.out.print("]");

        if (attributeValues != null && !attributeValues.isEmpty()) {
            System.out.print("=\"");
            for (AttributeValue val : attributeValues) {
                val.PrintAst();
            }
            System.out.print("\"");
        }
    }



    @Override
    public String generate() {
        StringBuilder name = new StringBuilder();
        for (int i = 0; i < leftBrackets; i++) name.append('[');
        name.append(identifier);
        for (int i = 0; i < rightBrackets; i++) name.append(']');

        if (attributeValues != null && !attributeValues.isEmpty()) {
            StringBuilder val = new StringBuilder();
            for (AttributeValue v : attributeValues) val.append(v.generateHtml());
            return name + "=" + val ;
        }
        return name.toString();
    }
    @Override public String generateHtml() { return generate(); }
    @Override public String generateJs()   { return generate(); }


}
