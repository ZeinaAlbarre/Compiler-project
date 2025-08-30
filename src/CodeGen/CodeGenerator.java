// CodeGen/CodeGenerator.java
package CodeGen;

import AstClasses.Program;
import java.io.*;

public class CodeGenerator {
    private final Program root;
    private final File outputFolder;

    public CodeGenerator(Program root, File outputFolder) {
        this.root = root;
        this.outputFolder = outputFolder;
    }

    public void generateFiles(String inputFileName) {
        try {
            // 1. ملف TS رئيسي (inline)
            String code = root.generate();
            File tsFile = new File(outputFolder, "main.ts");
            try (FileWriter fw = new FileWriter(tsFile)) {
                fw.write(code);
            }

            // 2. ملفات منفصلة
            String html = root.generateHtml(); // يلم كل الـ templates
            try (FileWriter fw = new FileWriter(new File(outputFolder, "component.html"))) {
                fw.write(html);
            }

            String css = root.generateCss(); // يلم كل الـ styles
            try (FileWriter fw = new FileWriter(new File(outputFolder, "component.css"))) {
                fw.write(css);
            }

            String js = root.generateJs(); // لو بدك نسخة جافاسكربت صافية
            try (FileWriter fw = new FileWriter(new File(outputFolder, "component.js"))) {
                fw.write(js);
            }

            System.out.println("✅ Generated TS + HTML + CSS + JS");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}