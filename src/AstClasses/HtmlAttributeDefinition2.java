package AstClasses;

public class HtmlAttributeDefinition2 extends HtmlAttribute {
    public String objectName;
    public String propertyName;
    public int leftCurlies = 2;
    public int rightCurlies = 2;

    public HtmlAttributeDefinition2(String objectName, String propertyName) {
        this.objectName = objectName;
        this.propertyName = propertyName;
    }

    public void setCurliesCount(int left, int right) {
        this.leftCurlies = left;
        this.rightCurlies = right;
    }

    @Override
    public void PrintAst() {
        System.out.print("{{ " + objectName + "." + propertyName + " }}");
    }

    @Override
    public String generate() {
        return "{{ " + objectName + "." + propertyName + " }}";
    }

    @Override
    public String generateHtml() {
        return generate();
    }


}
