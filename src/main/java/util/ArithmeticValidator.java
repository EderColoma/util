package util;

import java.util.List;

import data_structures.Stack;

public class ArithmeticValidator {

	/**
	 * Makes the constructor private so the class can not be instantiated.
	 */
	private ArithmeticValidator() {}
	
	/**
	 * Validates the opening and closing of scopes in an expresssion.
	 * 
	 * @param expression The expression to be evaluated.
	 * @return true, if the expression is valid, false otherwise.
	 */
	public static Boolean validateScopes(final String expression) {
		
		Stack<String> scopeOpenChars = new Stack<>();
		List<String> charList = StringUtil.toList(expression);
		
		for(String character : charList) {
			if(isOpenScopeCharacter(character)) {
				scopeOpenChars.push(character);
			}else if(isCloseScopeCharacter(character)){
				String expectedCloseCharacter = scopeOpenChars.isEmpty().booleanValue() ? "" : getCloseScopeCharacter(scopeOpenChars.pop());
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
	private static boolean isOpenScopeCharacter(String character) {
		return character.equals("(") || character.equals("{") || character.equals("[");
	}

	/**
	 * Verify if the given character closes a scope.
	 * 
	 * @param character The character to be verified.
	 * @return true, if the character closes a scope, false otherwise.
	 */
	private static boolean isCloseScopeCharacter(String character) {
		return character.equals(")") || character.equals("}") || character.equals("]");
	}
	
	/**
	 * Return the character which closes the scope opened by the given character.
	 * 
	 * @param character The character which the close scope equivalent is required.
	 * @return The character which closes the scope opened by the given character.
	 */
	private static String getCloseScopeCharacter(String character) {
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
}
