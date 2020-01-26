package util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static  util.StringUtil.toList;

import java.util.List;

import org.junit.Test;

/**
 * Tests the method of the {@link StringUtil} class.
 */
public class StringUtilTest {

	/**
	 * Tests the conversion of a text into a list of characters.
	 */
	@Test
	public void toListTest(){
		List<String> charList = toList("ABCDEF,123");
		
		assertEquals("A", charList.get(0));
		assertEquals("B", charList.get(1));
		assertEquals("C", charList.get(2));
		assertEquals("D", charList.get(3));
		assertEquals("E", charList.get(4));
		assertEquals("F", charList.get(5));
		assertEquals(",", charList.get(6));
		assertEquals("1", charList.get(7));
		assertEquals("2", charList.get(8));
		assertEquals("3", charList.get(9));
		
	}
	
	
	/**
	 * Tests the conversion of an empty text into a list of characters.
	 */
	@Test
	public void toListEpmtyTest(){
		List<String> charList = toList("");
		assertTrue(charList.isEmpty());
	}
}