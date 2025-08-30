package AstClasses;

public class IdePart extends TemplatePart {
    private final boolean hasHash;
    private final String name;

    public IdePart(boolean hasHash, String name) {
        this.hasHash = hasHash;
        this.name = name;
    }

    public boolean hasHash() {
        return hasHash;
    }

    public String getName() {
        return name;
    }

    @Override
    public void PrintAst() {
        System.out.println("IdePart: " + (hasHash ? "#" : "") + name);
    }

    @Override
    public String generate() {
        return (hasHash ? "#" : "") + name;
    }



    @Override
    public String generateJs() {
        return generate();
    }
}
