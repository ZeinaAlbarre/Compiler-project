package AstClasses;

// Program.java
public abstract class Program extends ASTNode {
    protected ProgramDef programDef;

    public ProgramDef getProgramDef() { return programDef; }
    public void setProgramDef(ProgramDef programDef) { this.programDef = programDef; }

    @Override public void PrintAst() { if (programDef != null) programDef.PrintAst(); }
    @Override public String generate()      { return programDef != null ? programDef.generate()      : ""; }
    @Override public String generateHtml()  { return programDef != null ? programDef.generateHtml()  : ""; }
    @Override public String generateCss()   { return programDef != null ? programDef.generateCss()   : ""; }
    @Override public String generateJs()    { return programDef != null ? programDef.generateJs()    : ""; }

}

