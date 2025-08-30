package AstClasses;

import java.util.ArrayList;
import java.util.List;

public class StmtInterface extends Statement{
    public List<InterfaceDeclaration> interfaceDeclarations;

    public StmtInterface() {
        this.interfaceDeclarations = new ArrayList<>();
    }

    public void setInterfaceDeclarations(InterfaceDeclaration interfaceDeclaration) {
        interfaceDeclarations.add(interfaceDeclaration);
    }

    public void PrintAst() {
        if (interfaceDeclarations != null) {
            for (InterfaceDeclaration interfaceDeclaration : interfaceDeclarations) {
                interfaceDeclaration.PrintAst();
            }
        }
    }

    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        for (InterfaceDeclaration idecl : interfaceDeclarations) {
            sb.append(idecl.generate()).append("\n");
        }
        return sb.toString();
    }

    @Override
    public String generateJs() {
        StringBuilder sb = new StringBuilder();
        for (InterfaceDeclaration idecl : interfaceDeclarations) {
            sb.append("// ").append(idecl.generate()).append("\n");
        }
        return sb.toString();
    }
}
