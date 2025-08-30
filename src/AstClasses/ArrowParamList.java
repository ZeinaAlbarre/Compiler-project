package AstClasses;

import java.util.List;

public class ArrowParamList extends ArrowParams {
    private List<ArrowParam> params;

    public ArrowParamList(List<ArrowParam> params) {
        this.params = params;
    }

    public List<ArrowParam> getParams() {
        return params;
    }

    @Override
    public void PrintAst() {
        System.out.println("ArrowParamList:");
        for (ArrowParam p : params) {
            System.out.print("  ");
            p.PrintAst();
        }
    }
    @Override
    public String generate() {
        return "(" + String.join(", ",
                params.stream().map(ArrowParam::generate)
                        .collect(java.util.stream.Collectors.toList())) + ")";
    }

    @Override
    public String generateJs() {
        return "(" + String.join(", ",
                params.stream().map(ArrowParam::generateJs)
                        .collect(java.util.stream.Collectors.toList())) + ")";
    }


}