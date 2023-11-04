package com.kingmang.lzrANTLR.lzrANTLR;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) {
        String fileName = "C:\\Users\\crowb\\OneDrive\\Рабочий стол\\Infinity\\test.lzr";
        String prog = "";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                prog += line + "\n";
            }
        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }

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
        System.out.println("Function: " + functionName);
        return null;
    }

    @Override
    public Void visitAssignment(SimpleLanguageParser.AssignmentContext ctx) {
        String variable = ctx.IDENTIFIER().getText();
        String value = ctx.expression().getText();
        System.out.println("Assignment: " + variable + " = " + value);
        return null;
    }

    @Override
    public Void visitPrintStatement(SimpleLanguageParser.PrintStatementContext ctx) {
        String expression = ctx.expression().getText();
        System.out.println("Output: " + expression);
        return null;
    }

    @Override
    public Void visitIfStatement(SimpleLanguageParser.IfStatementContext ctx) {
        String expression = ctx.expression().getText();
        System.out.println("If Statement: " + expression);
        return null;
    }

    @Override
    public Void visitWhileStatement(SimpleLanguageParser.WhileStatementContext ctx) {
        String condition = ctx.expression().getText();
        System.out.println("While Statement: " + condition);
        return null;
    }
}
