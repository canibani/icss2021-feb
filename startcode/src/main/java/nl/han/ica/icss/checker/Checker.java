package nl.han.ica.icss.checker;

import nl.han.ica.datastructures.HANLinkedList;
import nl.han.ica.datastructures.IHANLinkedList;
import nl.han.ica.icss.ast.*;
import nl.han.ica.icss.ast.literals.*;
import nl.han.ica.icss.ast.operations.AddOperation;
import nl.han.ica.icss.ast.operations.MultiplyOperation;
import nl.han.ica.icss.ast.operations.SubtractOperation;
import nl.han.ica.icss.ast.types.ExpressionType;

import java.util.HashMap;


public class Checker {

    private IHANLinkedList<HashMap<String, ExpressionType>> variableTypesList;
    private int currentScope;

    public void check(AST ast) {
        variableTypesList = new HANLinkedList<>();
        currentScope = 0;
        variableTypesList.add(new HashMap<>());
        check(ast.root);
    }

    public void check(ASTNode root) {
        for(ASTNode node : root.getChildren()) {
            checkVariables(node);
            checkOperation(node);
            checkDeclaration(node);
            checkIfStatement(node);
            check(node);
        }
    }

    public void checkVariables(ASTNode node) {
        if (node instanceof Stylerule) {
            currentScope++;
            variableTypesList.add(new HashMap<>());
        }

        if (node instanceof VariableAssignment) {
            String name = ((VariableAssignment) node).name.name;
            ExpressionType expressionType = getExpressionType(((VariableAssignment) node).expression);
            variableTypesList.get(currentScope).put(name, expressionType);
        }

        if (node instanceof VariableReference) {
            String name = ((VariableReference) node).name;
            if (!variableTypesList.get(currentScope).containsKey(name) &&
                !variableTypesList.get(0).containsKey(name)) {
                node.setError("Variable " + ((VariableReference) node).name + " not defined!");
            }
        }
    }

    private ExpressionType checkOperation(ASTNode node) {
        if (node instanceof Operation) {
            Operation operation = (Operation) node;
            ExpressionType left = getExpressionType((operation).lhs);
            ExpressionType right = getExpressionType((operation).rhs);

            if (left == ExpressionType.BOOL || left == ExpressionType.COLOR || right == ExpressionType.BOOL || right == ExpressionType.COLOR) {
                node.setError("No Booleans or Color literals allowed in operations");
                return ExpressionType.UNDEFINED;
            }

            if (operation instanceof MultiplyOperation) {
                if (left != ExpressionType.SCALAR && right != ExpressionType.SCALAR) {
                    node.setError("When doing multiplications at most one of the values has to be a scalar literal");
                } else {
                    if (left == ExpressionType.SCALAR) {
                        return right;
                    } else if (right== ExpressionType.SCALAR){
                        return left;
                    }
                }
            } else if ((operation instanceof AddOperation || operation instanceof SubtractOperation)) {
                if (left != right) {
                    node.setError("left and right are not the same type");
                    return ExpressionType.UNDEFINED;
                } else {
                    return left;
                }
            }
        }
        return ExpressionType.UNDEFINED;
    }

    public ExpressionType getExpressionType(Expression expression) {
        if (expression instanceof PercentageLiteral) {
            return ExpressionType.PERCENTAGE;
        } else if (expression instanceof PixelLiteral) {
            return ExpressionType.PIXEL;
        } else if (expression instanceof ColorLiteral) {
            return ExpressionType.COLOR;
        } else if (expression instanceof ScalarLiteral) {
            return ExpressionType.SCALAR;
        } else if (expression instanceof BoolLiteral) {
            return ExpressionType.BOOL;
        } else if (expression instanceof VariableReference) {
            ExpressionType expressionType = variableTypesList.get(currentScope).get(((VariableReference) expression).name);
            if (expressionType == null) {
                expressionType = variableTypesList.get(0).get(((VariableReference) expression).name);
            }
            return expressionType;
        } else if (expression instanceof Operation) {
            return checkOperation(expression);
        }
        return ExpressionType.UNDEFINED;
    }

    public void checkDeclaration(ASTNode node) {
        if (node instanceof Declaration) {
            Declaration declaration = (Declaration) node;
            ExpressionType expressionType = this.getExpressionType(declaration.expression);

            switch (declaration.property.name) {
                case "background-color":
                    if (expressionType != ExpressionType.COLOR ) {
                        node.setError("Background-color can only be declared a color literal");
                    }
                    break;
                case "color":
                    if (expressionType != ExpressionType.COLOR ) {
                        node.setError("Color can only be declared a color literal");
                    }
                    break;
                case "height":
                    if (expressionType != ExpressionType.PIXEL ) {
                        node.setError("Height can only be declared a pixel literal.");
                    }
                    break;
                case "width":
                    System.out.println(expressionType);
                    if (expressionType != ExpressionType.PIXEL ) {
                        node.setError("Width can only be declared a pixel literal.");
                    }
                    break;
            }
        }
    }

    private void checkIfStatement(ASTNode node) {
        if (node instanceof IfClause) {
            IfClause ifClause = (IfClause) node;
            ExpressionType expressionType = getExpressionType(ifClause.conditionalExpression);
            if (expressionType != ExpressionType.BOOL) {
                node.setError("The condition inside an if-statement has to be of expressiontype Boolean");
            }
        }
    }
}
