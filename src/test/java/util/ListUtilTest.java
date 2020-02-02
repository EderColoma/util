package util;

import static org.junit.Assert.assertEquals;
import static util.ListUtil.binarySearch;
import static util.ListUtil.getAverage;
import static util.ListUtil.getLargestValue;
import static util.ListUtil.getLowestValue;
import static util.ListUtil.getProduct;
import static util.ListUtil.getSum;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * Tests the methods of the {@link ListUtil} class.
 */
public class ListUtilTest {

	/**
	 * Tests the search for the element in the middle of the collection.
	 */
	@Test
	public void recursiveBinarySearchMiddleTest() {
		final List<Integer> elements = new ArrayList<>();
		elements.add(1);
		elements.add(5);
		elements.add(7);
		
		assertEquals(Integer.valueOf(1), binarySearch(elements, 5, 0, 2));
	}
	
	/**
	 * Tests the search for the element in at the beginning of the collection.
	 */
	@Test
	public void recursiveBinarySearchBeginningTest() {
		final List<Integer> elements = new ArrayList<>();
		elements.add(1);
		elements.add(5);
		elements.add(7);
		
		assertEquals(Integer.valueOf(0), binarySearch(elements, 1, 0, 2));
	}
	
	/**
	 * Tests the search for the element at the end of the collection.
	 */
	@Test
	public void recursiveBinarySearchEndingTest() {
		final List<Integer> elements = new ArrayList<>();
		elements.add(1);
		elements.add(5);
		elements.add(7);
		
		assertEquals(Integer.valueOf(2), binarySearch(elements, 7, 0, 2));
	}
	
	/**
	 * Tests the search for an element not in the collection.
	 */
	@Test
	public void recursiveBinarySearchUnexistingTest() {
		final List<Integer> elements = new ArrayList<>();
		elements.add(1);
		elements.add(5);
		elements.add(7);

		assertEquals(Integer.valueOf(-1), binarySearch(elements, 9, 0, 2));
	}
	
	/**
	 * Tests the search for the element in the middle of the collection.
	 */
	@Test
	public void binarySearchMiddleTest() {
		final List<Integer> elements = new ArrayList<>();
		elements.add(1);
		elements.add(5);
		elements.add(7);
		
		assertEquals(Integer.valueOf(1), binarySearch(elements, 5));
	}
	
	/**
	 * Tests the search for the element in at the beginning of the collection.
	 */
	@Test
	public void binarySearchBeginningTest() {
		final List<Integer> elements = new ArrayList<>();
		elements.add(1);
		elements.add(5);
		elements.add(7);
		
		assertEquals(Integer.valueOf(0), binarySearch(elements, 1));
	}
	
	/**
	 * Tests the search for the element at the end of the collection.
	 */
	@Test
	public void binarySearchEndingTest() {
		final List<Integer> elements = new ArrayList<>();
		elements.add(1);
		elements.add(5);
		elements.add(7);
		
		assertEquals(Integer.valueOf(2), binarySearch(elements, 7));
	}
	
	/**
	 * Tests the search for an element not in the collection.
	 */
	@Test
	public void binarySearchUnexistingTest() {
		final List<Integer> elements = new ArrayList<>();
		elements.add(1);
		elements.add(5);
		elements.add(7);

		assertEquals(Integer.valueOf(-1), binarySearch(elements, 9));
	}
	
	/**
	 * Tests the search for the largest value in the collection when the largest values is at the end of the collection.
	 */
	@Test
	public void getLargestValueLastTest() {
		final List<Integer> elements = new ArrayList<>();
		elements.add(1);
		elements.add(5);
		elements.add(7);
		
		assertEquals(Integer.valueOf(7), getLargestValue(elements));
	}
	
	/**
	 * Tests the search for the largest value in the collection when the largest values is at the beginning of the collection.
	 */
	@Test
	public void getLargestValueFirstTest() {
		final List<Integer> elements = new ArrayList<>();
		elements.add(7);
		elements.add(1);
		elements.add(5);
		
		assertEquals(Integer.valueOf(7), getLargestValue(elements));
	}
	
	/**
	 * Tests the search for the largest value in the collection when the largest values is at the middle of the collection.
	 */
	@Test
	public void getLargestValueMiddleTest() {
		final List<Integer> elements = new ArrayList<>();
		elements.add(1);
		elements.add(7);
		elements.add(5);
		
		assertEquals(Integer.valueOf(7), getLargestValue(elements));
	}
	
	/**
	 * Tests the search for the lowest value in the collection when the lowest values is at the end of the collection.
	 */
	@Test
	public void getLowestValueLastTest() {
		final List<Integer> elements = new ArrayList<>();
		elements.add(7);
		elements.add(5);
		elements.add(1);
		
		assertEquals(Integer.valueOf(1), getLowestValue(elements));
	}
	
	/**
	 * Tests the search for the lowest value in the collection when the lowest values is at the beginning of the collection.
	 */
	@Test
	public void getLowestValueFirstTest() {
		final List<Integer> elements = new ArrayList<>();
		elements.add(7);
		elements.add(5);
		elements.add(1);
		
		assertEquals(Integer.valueOf(1), getLowestValue(elements));
	}
	
	/**
	 * Tests the search for the lowest value in the collection when the lowest values is at the middle of the collection.
	 */
	@Test
	public void getLowestValueMiddleTest() {
		final List<Integer> elements = new ArrayList<>();
		elements.add(7);
		elements.add(1);
		elements.add(5);
		
		assertEquals(Integer.valueOf(1), getLowestValue(elements));
	}
	
	/**
	 * Tests the sum of the elements in a list.
	 */
	@Test
	public void getSumTest() {
		final List<Integer> elements = new ArrayList<>();
		elements.add(7);
		elements.add(1);
		elements.add(5);
		
		assertEquals(Integer.valueOf(13), getSum(elements));
	}
	
	/**
	 * Tests the multiplication of the elements in a list.
	 */
	@Test
	public void getProductTest() {
		final List<Integer> elements = new ArrayList<>();
		elements.add(7);
		elements.add(1);
		elements.add(5);
		
		assertEquals(Integer.valueOf(35), getProduct(elements));
	}
	
	/**
	 * Tests the multiplication of the elements in a list.
	 */
	@Test
	public void getAverageTest() {
		final List<Integer> elements = new ArrayList<>();
		elements.add(7);
		elements.add(1);
		elements.add(5);
		
		assertEquals(Integer.valueOf(4), getAverage(elements));
	}
}
