// Generated from ru\nsu\fit\ojp\u005Cushaev\ojp_4\Zarf.g4 by ANTLR 4.9.2
package ru.nsu.fit.ojp.ushaev.ojp_4;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ZarfParser}.
 */
public interface ZarfListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ZarfParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(ZarfParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZarfParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(ZarfParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZarfParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(ZarfParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZarfParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(ZarfParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZarfParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(ZarfParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZarfParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(ZarfParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZarfParser#flagDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFlagDeclaration(ZarfParser.FlagDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZarfParser#flagDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFlagDeclaration(ZarfParser.FlagDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZarfParser#gotoStatement}.
	 * @param ctx the parse tree
	 */
	void enterGotoStatement(ZarfParser.GotoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZarfParser#gotoStatement}.
	 * @param ctx the parse tree
	 */
	void exitGotoStatement(ZarfParser.GotoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZarfParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(ZarfParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZarfParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(ZarfParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ADD}
	 * labeled alternative in {@link ZarfParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterADD(ZarfParser.ADDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ADD}
	 * labeled alternative in {@link ZarfParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitADD(ZarfParser.ADDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VARREFERENCEE}
	 * labeled alternative in {@link ZarfParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVARREFERENCEE(ZarfParser.VARREFERENCEEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VARREFERENCEE}
	 * labeled alternative in {@link ZarfParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVARREFERENCEE(ZarfParser.VARREFERENCEEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code conditionalExpression}
	 * labeled alternative in {@link ZarfParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(ZarfParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code conditionalExpression}
	 * labeled alternative in {@link ZarfParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(ZarfParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MULTIPLY}
	 * labeled alternative in {@link ZarfParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMULTIPLY(ZarfParser.MULTIPLYContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MULTIPLY}
	 * labeled alternative in {@link ZarfParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMULTIPLY(ZarfParser.MULTIPLYContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VALUEE}
	 * labeled alternative in {@link ZarfParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVALUEE(ZarfParser.VALUEEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VALUEE}
	 * labeled alternative in {@link ZarfParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVALUEE(ZarfParser.VALUEEContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZarfParser#varReference}.
	 * @param ctx the parse tree
	 */
	void enterVarReference(ZarfParser.VarReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZarfParser#varReference}.
	 * @param ctx the parse tree
	 */
	void exitVarReference(ZarfParser.VarReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZarfParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(ZarfParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZarfParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(ZarfParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZarfParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(ZarfParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZarfParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(ZarfParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZarfParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(ZarfParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZarfParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(ZarfParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZarfParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(ZarfParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZarfParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(ZarfParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZarfParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(ZarfParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZarfParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(ZarfParser.StatementsContext ctx);
}