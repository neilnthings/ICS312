// Generated from MyLanguageV1Code.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MyLanguageV1CodeParser}.
 */
public interface MyLanguageV1CodeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MyLanguageV1CodeParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(@NotNull MyLanguageV1CodeParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageV1CodeParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(@NotNull MyLanguageV1CodeParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageV1CodeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull MyLanguageV1CodeParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageV1CodeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull MyLanguageV1CodeParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageV1CodeParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void enterIfstmt(@NotNull MyLanguageV1CodeParser.IfstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageV1CodeParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void exitIfstmt(@NotNull MyLanguageV1CodeParser.IfstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageV1CodeParser#dostmt}.
	 * @param ctx the parse tree
	 */
	void enterDostmt(@NotNull MyLanguageV1CodeParser.DostmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageV1CodeParser#dostmt}.
	 * @param ctx the parse tree
	 */
	void exitDostmt(@NotNull MyLanguageV1CodeParser.DostmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageV1CodeParser#printstmt}.
	 * @param ctx the parse tree
	 */
	void enterPrintstmt(@NotNull MyLanguageV1CodeParser.PrintstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageV1CodeParser#printstmt}.
	 * @param ctx the parse tree
	 */
	void exitPrintstmt(@NotNull MyLanguageV1CodeParser.PrintstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageV1CodeParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull MyLanguageV1CodeParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageV1CodeParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull MyLanguageV1CodeParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageV1CodeParser#printterm}.
	 * @param ctx the parse tree
	 */
	void enterPrintterm(@NotNull MyLanguageV1CodeParser.PrinttermContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageV1CodeParser#printterm}.
	 * @param ctx the parse tree
	 */
	void exitPrintterm(@NotNull MyLanguageV1CodeParser.PrinttermContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageV1CodeParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(@NotNull MyLanguageV1CodeParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageV1CodeParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(@NotNull MyLanguageV1CodeParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageV1CodeParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(@NotNull MyLanguageV1CodeParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageV1CodeParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(@NotNull MyLanguageV1CodeParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageV1CodeParser#comma}.
	 * @param ctx the parse tree
	 */
	void enterComma(@NotNull MyLanguageV1CodeParser.CommaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageV1CodeParser#comma}.
	 * @param ctx the parse tree
	 */
	void exitComma(@NotNull MyLanguageV1CodeParser.CommaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageV1CodeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull MyLanguageV1CodeParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageV1CodeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull MyLanguageV1CodeParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageV1CodeParser#numterm}.
	 * @param ctx the parse tree
	 */
	void enterNumterm(@NotNull MyLanguageV1CodeParser.NumtermContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageV1CodeParser#numterm}.
	 * @param ctx the parse tree
	 */
	void exitNumterm(@NotNull MyLanguageV1CodeParser.NumtermContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageV1CodeParser#assignstmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignstmt(@NotNull MyLanguageV1CodeParser.AssignstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageV1CodeParser#assignstmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignstmt(@NotNull MyLanguageV1CodeParser.AssignstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageV1CodeParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(@NotNull MyLanguageV1CodeParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageV1CodeParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(@NotNull MyLanguageV1CodeParser.TermContext ctx);
}