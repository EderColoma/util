package util;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static util.ArithmeticValidator.validateScopes;
import org.junit.Test;

/**
 * Tests the methods of the {@link ArithmeticValidator} class.
 */
public class ArithmeticValidatorTest {

	/**
	 * Tests the validation of scopes in an arithmetic expression.
	 */
	@Test
	public void validateScopesTest() {
		assertTrue(validateScopes("(X + Y) + {[(X * X) - (Y * Y)] + (X * Y)} - 9"));
	}
	
	/**
	 * Tests the validation of scopes in an arithmetic expression without scopes.
	 */
	@Test
	public void validateScopesNoScopesTest() {
		assertTrue(validateScopes("X + Y - 9"));
	}
	
	/**
	 * Tests the validation of scopes in an arithmetic expression without an opening parenthesis.
	 */
	@Test
	public void validateScopesMissingOpenParenthesisTest() {
		assertFalse(validateScopes("(X + Y) + {[X * X) - (Y * Y)] + (X * Y)} - 9"));
	}
	
	/**
	 * Tests the validation of scopes in an arithmetic expression without a closing parenthesis.
	 */
	@Test
	public void validateScopesMissingCloseParenthesisTest() {
		assertFalse(validateScopes("(X + Y) + {[(X * X) - (Y * Y] + (X * Y)} - 9"));
	}
	
	/**
	 * Tests the validation of scopes in an arithmetic expression without an opening brace.
	 */
	@Test
	public void validateScopesMissingOpenBraceTest() {
		assertFalse(validateScopes("(X + Y) + [(X * X) - (Y * Y)] + (X * Y)} - 9"));
	}
	
	
	/**
	 * Tests the validation of scopes in an arithmetic expression without a closing brace.
	 */
	@Test
	public void validateScopesMissingClsoeBraceTest() {
		assertFalse(validateScopes("(X + Y) + {[(X * X) - (Y * Y)] + (X * Y) - 9"));
	}
	
	/**
	 * Tests the validation of scopes in an arithmetic expression without an opening bracket.
	 */
	@Test
	public void validateScopesMissingOpenBracketTest() {
		assertFalse(validateScopes("(X + Y) + {(X * X) - (Y * Y)] + (X * Y)} - 9"));
	}
	
	
	/**
	 * Tests the validation of scopes in an arithmetic expression without a closing bracket.
	 */
	@Test
	public void validateScopesMissingClsoeBraketTest() {
		assertFalse(validateScopes("(X + Y) + {[(X * X) - (Y * Y) + (X * Y) - 9"));
	}
	
}
