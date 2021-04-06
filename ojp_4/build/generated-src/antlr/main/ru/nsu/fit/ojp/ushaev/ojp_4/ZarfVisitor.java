// Generated from ru\nsu\fit\ojp\u005Cushaev\ojp_4\Zarf.g4 by ANTLR 4.9.2
package ru.nsu.fit.ojp.ushaev.ojp_4;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ZarfParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ZarfVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ZarfParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(ZarfParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZarfParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(ZarfParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZarfParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(ZarfParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZarfParser#flagDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlagDeclaration(ZarfParser.FlagDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZarfParser#gotoStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGotoStatement(ZarfParser.GotoStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZarfParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(ZarfParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ADD}
	 * labeled alternative in {@link ZarfParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitADD(ZarfParser.ADDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VARREFERENCEE}
	 * labeled alternative in {@link ZarfParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVARREFERENCEE(ZarfParser.VARREFERENCEEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code conditionalExpression}
	 * labeled alternative in {@link ZarfParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(ZarfParser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MULTIPLY}
	 * labeled alternative in {@link ZarfParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMULTIPLY(ZarfParser.MULTIPLYContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VALUEE}
	 * labeled alternative in {@link ZarfParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVALUEE(ZarfParser.VALUEEContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZarfParser#varReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarReference(ZarfParser.VarReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZarfParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(ZarfParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZarfParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(ZarfParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZarfParser#assignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(ZarfParser.AssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZarfParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(ZarfParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZarfParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(ZarfParser.StatementsContext ctx);
}