package AstClasses;

public class PrimaryExpression extends Expression{
    public IdentifierExpr identifierExpr;
    public LiteralExpr literalExpr;
    public ArrayExpr arrayExpr;
    public ObjectExpr objectExpr;
    public TemplateExpr templateExpr;
    public ParenExpr parenExpr;
    public PareceExpr pareceExpr;
    public StringLiteral stringLiteral;
    public AllparenExpr allparenExpr;
    public Null nullExpr;
    public RoundType2 roundType2;

    public void setIdentifierExpr(IdentifierExpr identifierExpr) {
        this.identifierExpr = identifierExpr;
    }

    public void setLiteralExpr(LiteralExpr literalExpr) {
        this.literalExpr = literalExpr;
    }

    public void setArrayExpr(ArrayExpr arrayExpr) {
        this.arrayExpr = arrayExpr;
    }

    public void setObjectExpr(ObjectExpr objectExpr) {
        this.objectExpr = objectExpr;
    }

    public void setTemplateExpr(TemplateExpr templateExpr) {
        this.templateExpr = templateExpr;
    }

    public void setParenExpr(ParenExpr parenExpr) {
        this.parenExpr = parenExpr;
    }

    public void setPareceExpr(PareceExpr pareceExpr) {
        this.pareceExpr = pareceExpr;
    }

    public void setStringLiteral(StringLiteral stringLiteral) {
        this.stringLiteral = stringLiteral;
    }

    public void setAllparenExpr(AllparenExpr allparenExpr) {this.allparenExpr = allparenExpr;}

    public void setNullExpr(Null nullExpr) {this.nullExpr = nullExpr;}

    public void setRoundType2(RoundType2 roundType2) {this.roundType2 = roundType2;}

    @Override
    public void PrintAst() {
        if (identifierExpr != null) {
            identifierExpr.PrintAst();
        }
        if (literalExpr != null) {
            literalExpr.PrintAst();
        }
        if (arrayExpr != null) {
            arrayExpr.PrintAst();
        }
        if (objectExpr != null) {
            objectExpr.PrintAst();
        }
        if (templateExpr != null) {
            templateExpr.PrintAst();
        }
        if (parenExpr != null) {
            parenExpr.PrintAst();
        }
        if (pareceExpr != null) {
            pareceExpr.PrintAst();
        }
        if (stringLiteral != null) {
            stringLiteral.PrintAst();
        }
        if (allparenExpr != null) {
            allparenExpr.PrintAst();
        }
        if(nullExpr!=null){
            nullExpr.PrintAst();
        }
        if (roundType2 != null) {
            roundType2.PrintAst();
        }
    }
}
