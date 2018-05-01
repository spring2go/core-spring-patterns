package io.spring2go.corespring.interpreter;

import java.util.Stack;

// Interpreter
public class App {

	/**
	 * Expression can be evaluated using prefix, infix or postfix notations
	 * This sample uses postfix, where operator comes after the operands.
	 */
	public static void main(String[] args) {
		String tokenString = "4 3 2 - 1 + *"; // (3 - 2 + 1) * 4
		Stack<Expression> stack = new Stack<>();
		
		String[] tokenList = tokenString.split(" ");
		for(String s : tokenList) {
			if (isOperator(s)) {
				Expression rightExpression = stack.pop();
				Expression leftExpression = stack.pop();
				Expression operator = 
						getOperatorInstance(s, leftExpression, rightExpression);
				int result = operator.interpret();
				NumberExpression resultExpression = new NumberExpression(result);
				stack.push(resultExpression);
			} else {
				Expression i = new NumberExpression(s);
				stack.push(i);
			}
		}
		
		System.out.println("result: " + stack.pop().interpret());
	}

	public static boolean isOperator(String s) {
		return s.equals("+") || s.equals("-") || s.equals("*");
 	}
	
	// Get expression for string
	public static Expression getOperatorInstance(
			String s, Expression left, Expression right) {
		switch (s) {
		case "+":
			return new PlusExpression(left, right);
		case "-":
			return new MinusExpression(left, right);
		case "*":
			return new MultiplyExpression(left, right);
		default:
			return new MultiplyExpression(left, right);
		}
	}

}
