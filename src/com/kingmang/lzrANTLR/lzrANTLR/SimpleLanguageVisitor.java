/*
@author Artyom Kingmang
 */
package com.kingmang.lzrANTLR.lzrANTLR;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SimpleLanguageParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SimpleLanguageVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SimpleLanguageParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(SimpleLanguageParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLanguageParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(SimpleLanguageParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLanguageParser#funcDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDeclaration(SimpleLanguageParser.FuncDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLanguageParser#paramList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamList(SimpleLanguageParser.ParamListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLanguageParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(SimpleLanguageParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLanguageParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(SimpleLanguageParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLanguageParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(SimpleLanguageParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLanguageParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(SimpleLanguageParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLanguageParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(SimpleLanguageParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLanguageParser#switchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStatement(SimpleLanguageParser.SwitchStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLanguageParser#caseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseStatement(SimpleLanguageParser.CaseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLanguageParser#defaultStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultStatement(SimpleLanguageParser.DefaultStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLanguageParser#inputStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputStatement(SimpleLanguageParser.InputStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLanguageParser#conversionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConversionStatement(SimpleLanguageParser.ConversionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLanguageParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(SimpleLanguageParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLanguageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SimpleLanguageParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLanguageParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(SimpleLanguageParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLanguageParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(SimpleLanguageParser.TypeContext ctx);
}