// Generated from C:/Users/crowb/OneDrive/������� ����/Lazurite ANTLR/src/com/kingmang/lzrANTLR/SimpleLanguage.g4 by ANTLR 4.13.1
package com.kingmang.lzrANTLR.gen.com.kingmang.lzrANTLR;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleLanguageParser}.
 */
public interface SimpleLanguageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimpleLanguageParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SimpleLanguageParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLanguageParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SimpleLanguageParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLanguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(SimpleLanguageParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLanguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(SimpleLanguageParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLanguageParser#funcDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFuncDeclaration(SimpleLanguageParser.FuncDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLanguageParser#funcDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFuncDeclaration(SimpleLanguageParser.FuncDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLanguageParser#paramList}.
	 * @param ctx the parse tree
	 */
	void enterParamList(SimpleLanguageParser.ParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLanguageParser#paramList}.
	 * @param ctx the parse tree
	 */
	void exitParamList(SimpleLanguageParser.ParamListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLanguageParser#assigment}.
	 * @param ctx the parse tree
	 */
	void enterAssigment(SimpleLanguageParser.AssigmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLanguageParser#assigment}.
	 * @param ctx the parse tree
	 */
	void exitAssigment(SimpleLanguageParser.AssigmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLanguageParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(SimpleLanguageParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLanguageParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(SimpleLanguageParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLanguageParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(SimpleLanguageParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLanguageParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(SimpleLanguageParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLanguageParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(SimpleLanguageParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLanguageParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(SimpleLanguageParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SimpleLanguageParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SimpleLanguageParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLanguageParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(SimpleLanguageParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLanguageParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(SimpleLanguageParser.LiteralContext ctx);
}