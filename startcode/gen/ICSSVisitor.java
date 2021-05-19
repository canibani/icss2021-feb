// Generated from C:/Users/Can Ugurlu/Documents/School/APP/icss2021-feb/startcode/src/main/antlr4/nl/han/ica/icss/parser\ICSS.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ICSSParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ICSSVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ICSSParser#stylesheet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStylesheet(ICSSParser.StylesheetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idSelector}
	 * labeled alternative in {@link ICSSParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdSelector(ICSSParser.IdSelectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code classSelector}
	 * labeled alternative in {@link ICSSParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassSelector(ICSSParser.ClassSelectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tagSelector}
	 * labeled alternative in {@link ICSSParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagSelector(ICSSParser.TagSelectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code colorliteral}
	 * labeled alternative in {@link ICSSParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColorliteral(ICSSParser.ColorliteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pixelliteral}
	 * labeled alternative in {@link ICSSParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPixelliteral(ICSSParser.PixelliteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolliteral}
	 * labeled alternative in {@link ICSSParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolliteral(ICSSParser.BoolliteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code percentageliteral}
	 * labeled alternative in {@link ICSSParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPercentageliteral(ICSSParser.PercentageliteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code scalarliteral}
	 * labeled alternative in {@link ICSSParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScalarliteral(ICSSParser.ScalarliteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ICSSParser#stylerule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStylerule(ICSSParser.StyleruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ICSSParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(ICSSParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ICSSParser#decleration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecleration(ICSSParser.DeclerationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ICSSParser#propertyname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyname(ICSSParser.PropertynameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ICSSParser#variableassignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableassignment(ICSSParser.VariableassignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ICSSParser#variablereference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariablereference(ICSSParser.VariablereferenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subtraction}
	 * labeled alternative in {@link ICSSParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtraction(ICSSParser.SubtractionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplication}
	 * labeled alternative in {@link ICSSParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplication(ICSSParser.MultiplicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableexpression}
	 * labeled alternative in {@link ICSSParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableexpression(ICSSParser.VariableexpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalexpression}
	 * labeled alternative in {@link ICSSParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralexpression(ICSSParser.LiteralexpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addition}
	 * labeled alternative in {@link ICSSParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddition(ICSSParser.AdditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ICSSParser#ifstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfstatement(ICSSParser.IfstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ICSSParser#elsestatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElsestatement(ICSSParser.ElsestatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ICSSParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(ICSSParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ICSSParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(ICSSParser.BoolContext ctx);
}