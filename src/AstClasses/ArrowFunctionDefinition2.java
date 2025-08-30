package AstClasses;

import java.util.List;

public class ArrowFunctionDefinition2 extends ArrowFunction {
    private List<ArrowParam> params;
    private ArrowBody body;

    public ArrowFunctionDefinition2(List<ArrowParam> params, ArrowBody body) {
        this.params = params;
        this.body = body;
    }

    public List<ArrowParam> getParams() {
        return params;
    }

    public ArrowBody getBody() {
        return body;
    }

    @Override
    public void PrintAst() {
        System.out.println("ArrowFunction:");
        System.out.println("  Params:");
        for (ArrowParam p : params) {
            System.out.print("    ");
            p.PrintAst();
        }
        System.out.println("  Body:");
        if (body != null) body.PrintAst();
    }

    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        if (params != null) {
            for (int i = 0; i < params.size(); i++) {
                sb.append(params.get(i).generate());
                if (i < params.size() - 1) sb.append(", ");
            }
        }
        sb.append(") => ");
        if (body != null) sb.append(body.generate());
        return sb.toString();
    }


    @Override
    public String generateJs() {
        return generate();
    }
}
