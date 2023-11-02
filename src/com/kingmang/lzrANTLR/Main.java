package com.kingmang.lzrANTLR;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {

    public static void main(String[] args) {

        String prog = "x = 1000;" +
                "print(x);";

        SimpleLanguageLexer lexer = new SimpleLanguageLexer(CharStreams.fromString(prog));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SimpleLanguageParser parser = new SimpleLanguageParser(tokens);

        ParseTree tree = parser.program(); // Начинаем разбор с правила program

        SimpleLanguageVisitorImpl visitor = new SimpleLanguageVisitorImpl();
        visitor.visit(tree);
    }
}

class SimpleLanguageVisitorImpl extends SimpleLanguageBaseVisitor<Void> {

    @Override
    public Void visitFuncDeclaration(SimpleLanguageParser.FuncDeclarationContext ctx) {
        String functionName = ctx.IDENTIFIER().getText();
        System.out.println("Functions: " + functionName);
        return null;
    }

    @Override
    public Void visitAssignment(SimpleLanguageParser.AssignmentContext ctx) {
        String variable = ctx.IDENTIFIER().getText();
        String value = ctx.expression().getText();
        System.out.println("Variables: " + variable + " = " + value);
        return null;
    }

    @Override
    public Void visitPrintStatement(SimpleLanguageParser.PrintStatementContext ctx) {
        String expression = ctx.expression().getText();
        System.out.println("Output: " + expression);
        return null;
    }

    @Override
    public Void visitWhileStatement(SimpleLanguageParser.WhileStatementContext ctx) {
        String condition = ctx.expression().getText();
        System.out.println("while: " + condition);
        return null;
    }
}