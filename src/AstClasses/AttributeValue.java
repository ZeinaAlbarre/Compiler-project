package AstClasses;

public class AttributeValue extends ASTNode{
    StringAttributeValue stringAttributeValue;
    ExpressionAttributeValue expressionAttributeValue;

    public StringAttributeValue getStringAttributeValue() {
        return stringAttributeValue;
    }

    public void setStringAttributeValue(StringAttributeValue stringAttributeValue) {
        this.stringAttributeValue = stringAttributeValue;
    }

    public ExpressionAttributeValue getExpressionAttributeValue() {
        return expressionAttributeValue;
    }

    public void setExpressionAttributeValue(ExpressionAttributeValue expressionAttributeValue) {
        this.expressionAttributeValue = expressionAttributeValue;
    }

    public void PrintAst() {
        if(stringAttributeValue !=null) {
            stringAttributeValue.PrintAst();
        }
        if(expressionAttributeValue !=null) {
            expressionAttributeValue.PrintAst();
        }
    }
}
