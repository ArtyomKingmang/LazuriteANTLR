package com.kingmang.lzrANTLR.gen.com.kingmang.lzrANTLR;


import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\crowb\\OneDrive\\Рабочий стол\\Lazurite ANTLR\\src\\com\\kingmang\\lzrANTLR\\gen\\com\\kingmang\\lzrANTLR\\";
        String fileName = path + "program.txt";
        String input = new String(Files.readAllBytes(Paths.get(fileName)));

        SimpleLanguageLexer lexer = new SimpleLanguageLexer(CharStreams.fromString(input));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SimpleLanguageParser parser = new SimpleLanguageParser(tokens);

        ParseTree tree = parser.program();
        SimpleLanguageVisitorImpl visitor = new SimpleLanguageVisitorImpl();
        visitor.visit(tree);
    }
    static class SimpleLanguageVisitorImpl extends SimpleLanguageBaseVisitor<Void> {


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
        public Void visitWhileStatement(SimpleLanguageParser.WhileStatementContext ctx) {
            String condition = ctx.expression().getText();
            System.out.println("While Statement: " + condition);
            return null;
        }

    }

}


