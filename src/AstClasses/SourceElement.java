package AstClasses;

public abstract class SourceElement extends ASTNode {

    protected SourceElementDef sourceElementDef;

    public SourceElementDef getSourceElementDef() {
        return sourceElementDef;
    }

    public void setSourceElementDef(SourceElementDef sourceElementDef) {
        this.sourceElementDef = sourceElementDef;
    }

    @Override
    public void PrintAst() {
        if (sourceElementDef != null) {
            sourceElementDef.PrintAst();
        }
    }

}