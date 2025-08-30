package AstClasses;

public abstract class ClassMember extends ASTNode {
    ClassProperty classProperty;
    ClassMethod classMethod;
    ClassConstructor classConstructor;

    public ClassProperty getClassProperty() {
        return classProperty;
    }

    public void setClassProperty(ClassProperty classProperty) {
        this.classProperty = classProperty;
    }

    public ClassMethod getClassMethod() {
        return classMethod;
    }

    public void setClassMethod(ClassMethod classMethod) {
        this.classMethod = classMethod;
    }

    public ClassConstructor getClassConstructor() {
        return classConstructor;
    }

    public void setClassConstructor(ClassConstructor classConstructor) {
        this.classConstructor = classConstructor;
    }

    @Override
    public void PrintAst() {
        if (classProperty != null) classProperty.PrintAst();
        if (classMethod != null) classMethod.PrintAst();
        if (classConstructor != null) classConstructor.PrintAst();
    }

    @Override
    public String generate() {
        if (classProperty != null) return classProperty.generate();
        if (classMethod != null) return classMethod.generate();
        if (classConstructor != null) return classConstructor.generate();
        return "";
    }

    @Override
    public String generateJs() {
        if (classProperty != null) return classProperty.generateJs();
        if (classMethod != null) return classMethod.generateJs();
        if (classConstructor != null) return classConstructor.generateJs();
        return "";
    }


}