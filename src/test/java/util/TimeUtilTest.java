package util;

import static org.junit.Assert.assertEquals;
import static util.TimeUtil.timeInWords;

import org.junit.Test;

/**
 * Tests the method of the {@link TimeUtil} class.
 */
public class TimeUtilTest {

	/**
	 * Tests the return of a time in words when the time minute is 0.
	 */
	@Test
	public void timeInWordsZeroTest() {
		assertEquals("two o' clock", timeInWords(2, 0));
	}
	
	/**
	 * Tests the return of a time in words when the time minute is 0.
	 */
	@Test
	public void timeInWordsHalfTest() {
		assertEquals("half past five", timeInWords(5, 30));
	}
	
	/**
	 * Tests the return of a time in words when the minute is before 30.
	 */
	@Test
	public void timeInWordsBeforeHalfTest() {
		assertEquals("quarter past ten", timeInWords(10, 15));
	}
	
	/**
	 * Tests the return of a time in words when the time minute is after 30.
	 */
	@Test
	public void timeInWordsAfterHalfTest() {
		assertEquals("five minutes to three", timeInWords(2, 55));
	}
	
	/**
	 * Tests the return of a time in words when the minute is one.
	 */
	@Test
	public void timeInWordsOneMinutePastTest() {
		assertEquals("one minute past one", timeInWords(1, 1));
	}
	
	/**
	 * Tests the return of a time in words when it is one minute to the next hour.
	 */
	@Test
	public void timeInWordsOneMinuteToTest() {
		assertEquals("one minute to sixteen", timeInWords(15, 59));
	}
}
