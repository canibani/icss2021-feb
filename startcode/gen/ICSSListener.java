// Generated from C:/Users/Can Ugurlu/Documents/School/APP/icss2021-feb/startcode/src/main/antlr4/nl/han/ica/icss/parser\ICSS.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ICSSParser}.
 */
public interface ICSSListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ICSSParser#stylesheet}.
	 * @param ctx the parse tree
	 */
	void enterStylesheet(ICSSParser.StylesheetContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#stylesheet}.
	 * @param ctx the parse tree
	 */
	void exitStylesheet(ICSSParser.StylesheetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idSelector}
	 * labeled alternative in {@link ICSSParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterIdSelector(ICSSParser.IdSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idSelector}
	 * labeled alternative in {@link ICSSParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitIdSelector(ICSSParser.IdSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code classSelector}
	 * labeled alternative in {@link ICSSParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterClassSelector(ICSSParser.ClassSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classSelector}
	 * labeled alternative in {@link ICSSParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitClassSelector(ICSSParser.ClassSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tagSelector}
	 * labeled alternative in {@link ICSSParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterTagSelector(ICSSParser.TagSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tagSelector}
	 * labeled alternative in {@link ICSSParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitTagSelector(ICSSParser.TagSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code colorliteral}
	 * labeled alternative in {@link ICSSParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterColorliteral(ICSSParser.ColorliteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code colorliteral}
	 * labeled alternative in {@link ICSSParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitColorliteral(ICSSParser.ColorliteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pixelliteral}
	 * labeled alternative in {@link ICSSParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterPixelliteral(ICSSParser.PixelliteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pixelliteral}
	 * labeled alternative in {@link ICSSParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitPixelliteral(ICSSParser.PixelliteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolliteral}
	 * labeled alternative in {@link ICSSParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterBoolliteral(ICSSParser.BoolliteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolliteral}
	 * labeled alternative in {@link ICSSParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitBoolliteral(ICSSParser.BoolliteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code percentageliteral}
	 * labeled alternative in {@link ICSSParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterPercentageliteral(ICSSParser.PercentageliteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code percentageliteral}
	 * labeled alternative in {@link ICSSParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitPercentageliteral(ICSSParser.PercentageliteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code scalarliteral}
	 * labeled alternative in {@link ICSSParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterScalarliteral(ICSSParser.ScalarliteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code scalarliteral}
	 * labeled alternative in {@link ICSSParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitScalarliteral(ICSSParser.ScalarliteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#stylerule}.
	 * @param ctx the parse tree
	 */
	void enterStylerule(ICSSParser.StyleruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#stylerule}.
	 * @param ctx the parse tree
	 */
	void exitStylerule(ICSSParser.StyleruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(ICSSParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(ICSSParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#decleration}.
	 * @param ctx the parse tree
	 */
	void enterDecleration(ICSSParser.DeclerationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#decleration}.
	 * @param ctx the parse tree
	 */
	void exitDecleration(ICSSParser.DeclerationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#propertyname}.
	 * @param ctx the parse tree
	 */
	void enterPropertyname(ICSSParser.PropertynameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#propertyname}.
	 * @param ctx the parse tree
	 */
	void exitPropertyname(ICSSParser.PropertynameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#variableassignment}.
	 * @param ctx the parse tree
	 */
	void enterVariableassignment(ICSSParser.VariableassignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#variableassignment}.
	 * @param ctx the parse tree
	 */
	void exitVariableassignment(ICSSParser.VariableassignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#variablereference}.
	 * @param ctx the parse tree
	 */
	void enterVariablereference(ICSSParser.VariablereferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#variablereference}.
	 * @param ctx the parse tree
	 */
	void exitVariablereference(ICSSParser.VariablereferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subtraction}
	 * labeled alternative in {@link ICSSParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSubtraction(ICSSParser.SubtractionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subtraction}
	 * labeled alternative in {@link ICSSParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSubtraction(ICSSParser.SubtractionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplication}
	 * labeled alternative in {@link ICSSParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplication(ICSSParser.MultiplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplication}
	 * labeled alternative in {@link ICSSParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplication(ICSSParser.MultiplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableexpression}
	 * labeled alternative in {@link ICSSParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVariableexpression(ICSSParser.VariableexpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableexpression}
	 * labeled alternative in {@link ICSSParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVariableexpression(ICSSParser.VariableexpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalexpression}
	 * labeled alternative in {@link ICSSParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLiteralexpression(ICSSParser.LiteralexpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalexpression}
	 * labeled alternative in {@link ICSSParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLiteralexpression(ICSSParser.LiteralexpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addition}
	 * labeled alternative in {@link ICSSParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddition(ICSSParser.AdditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addition}
	 * labeled alternative in {@link ICSSParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddition(ICSSParser.AdditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#ifstatement}.
	 * @param ctx the parse tree
	 */
	void enterIfstatement(ICSSParser.IfstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#ifstatement}.
	 * @param ctx the parse tree
	 */
	void exitIfstatement(ICSSParser.IfstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#elsestatement}.
	 * @param ctx the parse tree
	 */
	void enterElsestatement(ICSSParser.ElsestatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#elsestatement}.
	 * @param ctx the parse tree
	 */
	void exitElsestatement(ICSSParser.ElsestatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(ICSSParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(ICSSParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(ICSSParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(ICSSParser.BoolContext ctx);
}