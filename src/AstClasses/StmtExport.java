package AstClasses;

import java.util.ArrayList;
import java.util.List;

public class StmtExport extends Statement {

    public List<ExportStatement> exportStatements;

    public StmtExport() {
        this.exportStatements = new ArrayList<>();
    }

    public void setExportStatements(ExportStatement exportStatement) {
        exportStatements.add(exportStatement);
    }

    @Override
    public void PrintAst() {
        if (exportStatements != null) {
            for (ExportStatement exp : exportStatements) {
                exp.PrintAst();
            }
        }
    }

    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        if (exportStatements != null) {
            for (int i = 0; i < exportStatements.size(); i++) {
                sb.append(exportStatements.get(i).generate());
                if (i < exportStatements.size() - 1) sb.append(", ");
            }
        }
        return sb.toString();
    }



    @Override
    public String generateJs() {
        return   generate().replace("\n", "\n// ");
    }
}
