package util;

import static util.StringUtil.toList;

import java.util.ArrayList;
import java.util.List;

import data_structures.Stack;

/**
 * Provides mathematical utility functions.
 */
public class MathUtil {

	/**
	 * Makes the constructor private so the class can not be instantiated.
	 */
	private MathUtil() {}
	
	//TODO: Implement
	public static Double calculate(final String expression) {
		return null;
	}
	
	/**
	 * Validates the opening and closing of scopes in an expression.
	 * 
	 * @param expression The expression to be evaluated.
	 * @return true, if the expression is valid, false otherwise.
	 */
	public static Boolean validateScopes(final String expression) {
		
		final Stack<String> scopeOpenChars = new Stack<>();
		final List<String> charList = toList(expression);
		
		for(final String character : charList) {
			if(isOpenScopeCharacter(character)) {
				scopeOpenChars.push(character);
			}else if(isCloseScopeCharacter(character)){
				final String expectedCloseCharacter = scopeOpenChars.isEmpty().booleanValue() ? "" : getCloseScopeCharacter(scopeOpenChars.pop());
				if(!character.equals(expectedCloseCharacter)) {
					return false;
				}
			}
		}
		
		return scopeOpenChars.isEmpty();
	}
	
	/**
	 * Verify if the given character opens a scope.
	 * 
	 * @param character The character to be verified.
	 * @return true, if the character opens a scope, false otherwise.
	 */
	private static boolean isOpenScopeCharacter(final String character) {
		return character.equals("(") || character.equals("{") || character.equals("[");
	}

	/**
	 * Verify if the given character closes a scope.
	 * 
	 * @param character The character to be verified.
	 * @return true, if the character closes a scope, false otherwise.
	 */
	private static boolean isCloseScopeCharacter(final String character) {
		return character.equals(")") || character.equals("}") || character.equals("]");
	}
	
	/**
	 * Return the character which closes the scope opened by the given character.
	 * 
	 * @param character The character which the close scope equivalent is required.
	 * @return The character which closes the scope opened by the given character.
	 */
	private static String getCloseScopeCharacter(final String character) {
		switch (character) {
			case "(":
				return ")";
			case "{":
				return "}";
			case "[":
				return "]";
			default:
				return null;
		}
	}
	
	/**
	 * Calculates of the factorial of a given number.
	 * 
	 * @param n The number which will have its factorial calculated.
	 * @return The factorial of the given number.
	 */
	public static Long factorial(final Long n) {
		return n.equals(Long.valueOf(0)) ? Long.valueOf(1) : n * factorial(n - 1);
	}
	
	/**
	 * Multiply two numbers.
	 * 
	 * @param a The multiplicand.
	 * @param b The multiplier.
	 * @return The product.
	 */
	public static Long multiply(final Long a, final Long b) {
		return b.equals(Long.valueOf(0)) ? 0 : a + multiply(a, b - 1);
	}
	
	/**
	 * Calculates the first n elements of the Fibonacci sequence.
	 * 
	 * @param n The amount of number which shall be calculated.
	 * @return The n firts numbers of the Fibonacci sequence.
	 */
	public static List<Integer> fibonacci(final Integer n){
		final List<Integer> sequence = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			sequence.add(getFibonacciInPosition(i));
		}
		
		return sequence;
	}
	
	/**
	 * Obtains a number from the Fibonacci sequence.
	 * 
	 * @param position The positio which should be obtained.
	 * @return The obtained number.
	 */
	public static Integer getFibonacciInPosition(final Integer position) {
		if(position == 0) {
			return 0;
		}
		
		if(position == 1) {
			return 1;
		}
		
		return getFibonacciInPosition(position - 2) + getFibonacciInPosition(position - 1);
	}
	
	/**
	 * Calculates the ackermann function.
	 * 
	 * @param a The first argument of the function.
	 * @param b The second argument of the function.
	 * @return The result of the ackermann function.
	 */
	public static Integer ackerman(final Integer a, final Integer b) {
		
		if(a.equals(0)) {
			return b + 1;
		}
		
		if(b == 0) {
			return ackerman(a - 1, 1);
		}
		
		return ackerman(a - 1, ackerman(a, b - 1));
	}

}
