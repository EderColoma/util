package util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static util.MathUtil.ackerman;
import static util.MathUtil.factorial;
import static util.MathUtil.fibonacci;
import static util.MathUtil.getFibonacciInPosition;
import static util.MathUtil.multiply;
import static util.MathUtil.validateScopes;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * Tests the methods of the {@link MathUtil} class.
 */
public class MathUtilTest {

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
	
	/**
	 * Tests the calculation of the factorial of a given number.
	 */
	@Test
	public void factorialTest() {
		assertEquals(Long.valueOf(120), factorial(Long.valueOf(5)));
	}
	
	/**
	 * Tests the multiplication of two numbers.
	 */
	@Test
	public void multiplyTest() {
		assertEquals(Long.valueOf(10), multiply(Long.valueOf(2), Long.valueOf(5)));
	}
	
	/**
	 * Tests the obtaining of a number from the Fibonacci sequence. 
	 */
	@Test
	public void fibonacciInPositionTest() {
		assertEquals(Integer.valueOf(8), getFibonacciInPosition(6));
	}
	
	/**
	 * Tests the obtaining of the Fibonacci sequence.
	 */
	@Test
	public void fibonacciTest() {
		final List<Integer> sequence = new ArrayList<>();
		sequence.add(0);
		sequence.add(1);
		sequence.add(1);
		sequence.add(2);
		sequence.add(3);
		sequence.add(5);
		sequence.add(8);
		sequence.add(13);
		sequence.add(21);
		sequence.add(34);
		
		assertEquals(sequence, fibonacci(10));
	}
	
	/**
	 * Tests the result of the ackermann function.
	 */
	@Test
	public void ackermanTest() {
		assertEquals(Integer.valueOf(7), ackerman(2, 2));
	}
}
