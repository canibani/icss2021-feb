package nl.han.ica.icss.parser;

import java.util.List;
import java.util.Properties;
import java.util.Stack;

import com.sun.javafx.geom.AreaOp;
import nl.han.ica.icss.ast.*;
import nl.han.ica.icss.ast.literals.*;
import nl.han.ica.icss.ast.operations.AddOperation;
import nl.han.ica.icss.ast.operations.MultiplyOperation;
import nl.han.ica.icss.ast.operations.SubtractOperation;
import nl.han.ica.icss.ast.selectors.ClassSelector;
import nl.han.ica.icss.ast.selectors.IdSelector;
import nl.han.ica.icss.ast.selectors.TagSelector;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * This class extracts the ICSS Abstract Syntax Tree from the Antlr Parse tree.
 */
public class ASTListener extends ICSSBaseListener {

	//Accumulator attributes:
	private AST ast;

	//Use this to keep track of the parent nodes when recursively traversing the ast
	private Stack<ASTNode> currentContainer;
	// private IHANStack<ASTNode> currentContainer;

	public ASTListener() {
		ast = new AST();
		currentContainer = new Stack<>();
	}
	public AST getAST() {
		return ast;
	}

	private void printInfo(String text, ParserRuleContext ctx) {
		printIdent(ctx.depth());
		System.out.println(text + "\t");
		printChildren(ctx.children);
	}

	private void printChildren(List<ParseTree> children) {
		for (ParseTree tree : children) {
			System.out.println(tree.getText() + "\t");
		}
		System.out.println();
	}

	private void printIdent(int depth) {
		for (int i=0;i<depth;i++) {
			System.out.println("\t");
		}
	}

	@Override public void enterStylesheet(ICSSParser.StylesheetContext ctx) {
		currentContainer.push(ast.root);
	}

	@Override public void exitStylesheet(ICSSParser.StylesheetContext ctx) { currentContainer.pop(); }

	@Override public void enterIdSelector(ICSSParser.IdSelectorContext ctx) {
		Selector idSelector = new IdSelector(ctx.getText());
		currentContainer.peek().addChild(idSelector);
		currentContainer.push(idSelector);
	}

	@Override public void exitIdSelector(ICSSParser.IdSelectorContext ctx) { currentContainer.pop(); }

	@Override public void enterClassSelector(ICSSParser.ClassSelectorContext ctx) {
		Selector classSelector = new ClassSelector(ctx.getText());
		currentContainer.peek().addChild(classSelector);
		currentContainer.push(classSelector);
	}

	@Override public void exitClassSelector(ICSSParser.ClassSelectorContext ctx) { currentContainer.pop(); }

	@Override public void enterTagSelector(ICSSParser.TagSelectorContext ctx) {
		Selector tagSelector = new TagSelector(ctx.getText());
		currentContainer.peek().addChild(tagSelector);
		currentContainer.push(tagSelector);
	}

	@Override public void exitTagSelector(ICSSParser.TagSelectorContext ctx) { currentContainer.pop(); }

	@Override public void enterColorliteral(ICSSParser.ColorliteralContext ctx) {
		Literal colorLiteral = new ColorLiteral(ctx.getText());
		currentContainer.peek().addChild(colorLiteral);
		currentContainer.push(colorLiteral);
	}

	@Override public void exitColorliteral(ICSSParser.ColorliteralContext ctx) { currentContainer.pop(); }

	@Override public void enterPixelliteral(ICSSParser.PixelliteralContext ctx) {
		Literal pixelLiteral = new PixelLiteral(ctx.getText());
		currentContainer.peek().addChild(pixelLiteral);
		currentContainer.push(pixelLiteral);
	}

	@Override public void exitPixelliteral(ICSSParser.PixelliteralContext ctx) { currentContainer.pop(); }

	@Override public void enterBoolliteral(ICSSParser.BoolliteralContext ctx) {
		Literal boolLiteral = new BoolLiteral(ctx.getText());
		currentContainer.peek().addChild(boolLiteral);
		currentContainer.push(boolLiteral);
	}

	@Override public void exitBoolliteral(ICSSParser.BoolliteralContext ctx) { currentContainer.pop(); }

	@Override public void enterPercentageliteral(ICSSParser.PercentageliteralContext ctx) {
		Literal percentageLiteral = new PercentageLiteral(ctx.getText());
		currentContainer.peek().addChild(percentageLiteral);
		currentContainer.push(percentageLiteral);
	}

	@Override public void exitPercentageliteral(ICSSParser.PercentageliteralContext ctx) { currentContainer.pop(); }

	@Override public void enterScalarliteral(ICSSParser.ScalarliteralContext ctx) {
		Literal scalarLiteral = new ScalarLiteral(ctx.getText());
		currentContainer.peek().addChild(scalarLiteral);
		currentContainer.push(scalarLiteral);
	}

	@Override public void exitScalarliteral(ICSSParser.ScalarliteralContext ctx) { currentContainer.pop(); }

	@Override public void enterStylerule(ICSSParser.StyleruleContext ctx) {
		ASTNode stylerule = new Stylerule();
		currentContainer.peek().addChild(stylerule);
		currentContainer.push(stylerule);
	}

	@Override public void exitStylerule(ICSSParser.StyleruleContext ctx) { currentContainer.pop(); }

	@Override public void enterDecleration(ICSSParser.DeclerationContext ctx) {
		Declaration declaration = new Declaration();
		currentContainer.peek().addChild(declaration);
		currentContainer.push(declaration);
	}

	@Override public void exitDecleration(ICSSParser.DeclerationContext ctx) { currentContainer.pop(); }

	@Override public void enterPropertyname(ICSSParser.PropertynameContext ctx) {
		PropertyName propertyName = new PropertyName(ctx.getText());
		currentContainer.peek().addChild(propertyName);
		currentContainer.push(propertyName);
	}

	@Override public void exitPropertyname(ICSSParser.PropertynameContext ctx) { currentContainer.pop(); }

	@Override public void enterVariableassignment(ICSSParser.VariableassignmentContext ctx) {
		ASTNode variableAssignment = new VariableAssignment();
		currentContainer.peek().addChild(variableAssignment);
		currentContainer.push(variableAssignment);
	}

	@Override public void exitVariableassignment(ICSSParser.VariableassignmentContext ctx) { currentContainer.pop(); }

	@Override public void enterVariablereference(ICSSParser.VariablereferenceContext ctx) {
		VariableReference variableReference = new VariableReference(ctx.getText());
		currentContainer.peek().addChild(variableReference);
		currentContainer.push(variableReference);
	}

	@Override public void exitVariablereference(ICSSParser.VariablereferenceContext ctx) { currentContainer.pop(); }

	@Override public void enterAddition(ICSSParser.AdditionContext ctx) {
		Operation addOperation = new AddOperation();
		currentContainer.peek().addChild(addOperation);
		currentContainer.push(addOperation);
	}

	@Override public void exitAddition(ICSSParser.AdditionContext ctx) { currentContainer.pop(); }

	@Override public void enterSubtraction(ICSSParser.SubtractionContext ctx) {
		Operation subtractOperation = new SubtractOperation();
		currentContainer.peek().addChild(subtractOperation);
		currentContainer.push(subtractOperation);
	}

	@Override public void exitSubtraction(ICSSParser.SubtractionContext ctx) { currentContainer.pop(); }

	@Override public void enterMultiplication(ICSSParser.MultiplicationContext ctx) {
		Operation multiplyOperation = new MultiplyOperation();
		currentContainer.peek().addChild(multiplyOperation);
		currentContainer.push(multiplyOperation);
	}

	@Override public void exitMultiplication(ICSSParser.MultiplicationContext ctx) { currentContainer.pop(); }

	@Override public void enterIfstatement(ICSSParser.IfstatementContext ctx) {
		ASTNode ifClause = new IfClause();
		currentContainer.peek().addChild(ifClause);
		currentContainer.push(ifClause);
	}

	@Override public void exitIfstatement(ICSSParser.IfstatementContext ctx) { currentContainer.pop(); }

	@Override public void enterElsestatement(ICSSParser.ElsestatementContext ctx) {
		ASTNode elseClause = new ElseClause();
		currentContainer.peek().addChild(elseClause);
		currentContainer.push(elseClause);
	}

	@Override public void exitElsestatement(ICSSParser.ElsestatementContext ctx) { currentContainer.pop(); }

	@Override public void enterBool(ICSSParser.BoolContext ctx) {
		Literal boolliteral = new BoolLiteral(ctx.getText());
		currentContainer.peek().addChild(boolliteral);
		currentContainer.push(boolliteral);
	}

	@Override public void exitBool(ICSSParser.BoolContext ctx) { currentContainer.pop(); }

	@Override public void enterEveryRule(ParserRuleContext ctx) { }

	@Override public void exitEveryRule(ParserRuleContext ctx) { }
}
