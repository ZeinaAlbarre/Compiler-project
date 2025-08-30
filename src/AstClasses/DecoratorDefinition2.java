package AstClasses;

public class DecoratorDefinition2 extends Decorator {
    private String keyword;

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    @Override
    public void PrintAst() {
        System.out.println("DecoratorDefinition2:");
        System.out.println("  Keyword: " + keyword);
    }

    @Override
    public String generate() {
        return "@" + keyword.charAt(0) + keyword.substring(1).toLowerCase();
    }

    @Override
    public String generateJs() {
        return " @" + keyword;
    }
}
