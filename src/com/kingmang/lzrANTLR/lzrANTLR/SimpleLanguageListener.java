/*
@author Artyom Kingmang
 */
package com.kingmang.lzrANTLR.lzrANTLR;
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
	 * Enter a parse tree produced by {@link SimpleLanguageParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(SimpleLanguageParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLanguageParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(SimpleLanguageParser.AssignmentContext ctx);
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
	 * Enter a parse tree produced by {@link SimpleLanguageParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(SimpleLanguageParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLanguageParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(SimpleLanguageParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLanguageParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(SimpleLanguageParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLanguageParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(SimpleLanguageParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLanguageParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(SimpleLanguageParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLanguageParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(SimpleLanguageParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLanguageParser#caseStatement}.
	 * @param ctx the parse tree
	 */
	void enterCaseStatement(SimpleLanguageParser.CaseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLanguageParser#caseStatement}.
	 * @param ctx the parse tree
	 */
	void exitCaseStatement(SimpleLanguageParser.CaseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLanguageParser#defaultStatement}.
	 * @param ctx the parse tree
	 */
	void enterDefaultStatement(SimpleLanguageParser.DefaultStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLanguageParser#defaultStatement}.
	 * @param ctx the parse tree
	 */
	void exitDefaultStatement(SimpleLanguageParser.DefaultStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLanguageParser#inputStatement}.
	 * @param ctx the parse tree
	 */
	void enterInputStatement(SimpleLanguageParser.InputStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLanguageParser#inputStatement}.
	 * @param ctx the parse tree
	 */
	void exitInputStatement(SimpleLanguageParser.InputStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLanguageParser#conversionStatement}.
	 * @param ctx the parse tree
	 */
	void enterConversionStatement(SimpleLanguageParser.ConversionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLanguageParser#conversionStatement}.
	 * @param ctx the parse tree
	 */
	void exitConversionStatement(SimpleLanguageParser.ConversionStatementContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link SimpleLanguageParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(SimpleLanguageParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLanguageParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(SimpleLanguageParser.TypeContext ctx);
}