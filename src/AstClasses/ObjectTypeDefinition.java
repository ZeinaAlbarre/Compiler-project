package AstClasses;

import java.util.ArrayList;
import java.util.List;

public class ObjectTypeDefinition extends ObjectType {
    private final List<ObjectTypeMemberDefinition> members = new ArrayList<>();

    public void addMember(ObjectTypeMemberDefinition m) {
        if (m != null) members.add(m);
    }

    public List<ObjectTypeMemberDefinition> getMembers() {
        return members;
    }

    @Override
    public void PrintAst() {
        System.out.println("ObjectTypeDefinition {");
        for (ObjectTypeMemberDefinition m : members) {
            System.out.print("  ");
            m.PrintAst();
            System.out.println();
        }
        System.out.println("}");
    }

    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder("{ ");
        for (int i = 0; i < members.size(); i++) {
            if (i > 0) sb.append(", ");
            sb.append(members.get(i).generate());
        }
        sb.append(" }");
        return sb.toString();
    }

    @Override public String generateJs()   { return ""; }
    @Override public String generateHtml() { return ""; }
    @Override public String generateCss()  { return ""; }
}