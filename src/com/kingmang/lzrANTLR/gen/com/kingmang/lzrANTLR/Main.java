package com.kingmang.lzrANTLR.gen.com.kingmang.lzrANTLR;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {

    public static void main(String args[]){
        String prog;

    SimpleLanguageLexer lexer = new SimpleLanguageLexer(CharStream.fromString(prog));
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    SimpleLanguageParser parser = new SimpleLanguageParser(tokens);
    ParseTree tree = parser.program();
    SimpleLanguageVisitorImpl visitor = new SimpleLanguageVisitorImpl();
    visitor.visit(tree);

    }
    class SimpleLanguageVisitorImpl extends SimpleLanguageBaseVisitor<Void>{
        @Override
        public Void visitFuncDeclaration(SimpleLanguageParser.FuncDeclarationContext ctx){

            String functionName = ctx.INDENTIFIER().getText();
            System.out.println("Function: " + functionName);
            return null;
        }

        @Override
        public Void visitAssigment(SimpleLanguageParser.AssigmentContext ctx){

            String variable = ctx.INDENTIFIER().getText();
            String value = ctx.expression().getText();
            System.out.println("Variable: " + variable + "=" + value);
            return null;
        }

        @Override
        public Void visitPrintStatement(SimpleLanguageParser.PrintStatementContext ctx){
            String expression = ctx.expression().getText();
            System.out.println("Output: " + expression);
            return null;
        }
        @Override
        public Void visitWhileStatement(SimpleLanguageParser.WhileStatementContext ctx){
            String cond = ctx.expression().getText();
            System.out.println("while: " + cond);
            return null;
        }
    }


}
