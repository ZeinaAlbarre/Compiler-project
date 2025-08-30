import Antlr.LexerAng;
import Antlr.ParserAng;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import VisitorParseTree.Visitor;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import org.antlr.v4.runtime.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String source = "tests/test1.txt";
        CharStream cs = CharStreams.fromFileName(source);
        LexerAng lexer = new LexerAng(cs);
        CommonTokenStream token = new CommonTokenStream(lexer);
        ParserAng parser = new ParserAng(token);
        ParseTree tree = parser.program();

        Visitor visitor = new Visitor();
        AstClasses.Program startProgram = (AstClasses.Program) visitor.visit(tree);


        startProgram.PrintAst();

        visitor.getClickCollector().checkAll();
        visitor.getBindingCollector().checkAll();

        String baseName = new File(source).getName();
        if (baseName.contains(".")) baseName = baseName.substring(0, baseName.lastIndexOf('.'));

        File outDir = new File("output");
        if (!outDir.exists()) outDir.mkdirs();

        try (FileWriter fw = new FileWriter(new File(outDir, baseName + ".ts"))) {
            fw.write(startProgram.generate());
        }

        try (FileWriter fw = new FileWriter(new File(outDir, baseName + ".html"))) {
            fw.write(startProgram.generateHtml());
        }

        try (FileWriter fw = new FileWriter(new File(outDir, baseName + ".css"))) {
            fw.write(startProgram.generateCss());
        }

        try (FileWriter fw = new FileWriter(new File(outDir, baseName + ".js"))) {
            fw.write(startProgram.generateJs());
        }

        System.out.println("Files generated in: " + outDir.getAbsolutePath());
    }
}
