package AstClasses;

public abstract class Statement extends ASTNode {
    StmImport stmImport;
    StmtInterface stmtInterface;
    StmtClass stmtClass;
    StmtComponent stmtComponent;
    StmtExport stmtExport;
    StmtExpression stmtExpression;
    StmtIf stmtIf;
    StmtFor stmtFor;
    StmtVariable stmtVariable;

    public StmImport getStmImport() {
        return stmImport;
    }

    public void setStmImport(StmImport stmImport) {
        this.stmImport = stmImport;
    }

    public StmtInterface getStmtInterface() {
        return stmtInterface;
    }

    public void setStmtInterface(StmtInterface stmtInterface) {
        this.stmtInterface = stmtInterface;
    }

    public StmtClass getStmtClass() {
        return stmtClass;
    }

    public void setStmtClass(StmtClass stmtClass) {
        this.stmtClass = stmtClass;
    }

    public StmtComponent getStmtComponent() {
        return stmtComponent;
    }

    public void setStmtComponent(StmtComponent stmtComponent) {
        this.stmtComponent = stmtComponent;
    }

    public StmtExport getStmtExport() {
        return stmtExport;
    }

    public void setStmtExport(StmtExport stmtExport) {
        this.stmtExport = stmtExport;
    }

    public StmtExpression getStmtExpression() {
        return stmtExpression;
    }

    public void setStmtExpression(StmtExpression stmtExpression) {
        this.stmtExpression = stmtExpression;
    }

    public StmtIf getStmtIf() {
        return stmtIf;
    }

    public void setStmtIf(StmtIf stmtIf) {
        this.stmtIf = stmtIf;
    }

    public StmtFor getStmtFor() {
        return stmtFor;
    }

    public void setStmtFor(StmtFor stmtFor) {
        this.stmtFor = stmtFor;
    }


    public StmtVariable getStmtVariable() {
        return stmtVariable;
    }

    public void setStmtVariable(StmtVariable stmtVariable) {
        this.stmtVariable = stmtVariable;
    }

    public void PrintAst() {
        if(stmImport !=null) {
            stmImport.PrintAst();
        }
        if(stmtInterface !=null) {
            stmtInterface.PrintAst();
        }
        if(stmtClass !=null) {
            stmtClass.PrintAst();
        }
        if(stmtComponent !=null) {
            stmtComponent.PrintAst();
        }
        if(stmtExport !=null) {
            stmtExport.PrintAst();
        }
        if(stmtVariable !=null) {
            stmtVariable.PrintAst();
        }
        if(stmtFor !=null) {
            stmtFor.PrintAst();
        }
        if(stmtIf !=null) {
            stmtIf.PrintAst();
        }
        if(stmtExpression !=null) {
            stmtExpression.PrintAst();
        }




    }
}

