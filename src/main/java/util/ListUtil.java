package util;

import java.util.ArrayList;
import java.util.List;

/**
 * Provides utility methods for searching collections.
 */
public class ListUtil {

	private ListUtil(){}
	
	/**
	 * Searches for the position of an element in the collection.
	 * 
	 * @param elements The collection to be searched.
	 * @param elementToFind The element to be found.
	 * @param firstElementIndex The index of the first element of the collection.
	 * @param lastElementIndex The index of the last element of the collection.
	 * @return The index of the found element or -1 if it is not found.
	 */
	public static Integer binarySearch(final List<Integer> elements, final Integer elementToFind, final Integer firstElementIndex, final Integer lastElementIndex) {
		final Integer mid = (firstElementIndex + lastElementIndex) / 2;
		
		if(firstElementIndex > elements.size() - 1) {
			return -1;
		}
		
		if(elements.get(mid).equals(elementToFind)) {
			return mid;
		}
		
		if(elements.get(mid) > elementToFind) {
			return(binarySearch(elements, elementToFind, firstElementIndex, mid - 1));
		}
		
		return(binarySearch(elements, elementToFind, mid + 1, lastElementIndex));
		
	}
	
	/**
	 * Searches for the position of an element in the collection.
	 * 
	 * @param elements The collection to be searched.
	 * @param elementToFind The element to be found.
	 * @return The index of the found element or -1 if it is not found.
	 */
	public static Integer binarySearch(final List<Integer> elements, final Integer elementToFind) {
		
		Integer firstElementIndex = 0;
		Integer lastElementIndex = elements.size() - 1;
		
		while(firstElementIndex <= lastElementIndex) {
			final Integer mid = (firstElementIndex + lastElementIndex) / 2;
			if(elements.get(mid).equals(elementToFind)) {
				return mid;
			}
			
			if(elements.get(mid) > elementToFind) {
				lastElementIndex = mid - 1; 
			}else {
				firstElementIndex = mid + 1;
			}
		}
		
		return -1;

	}
	
	/**
	 * Searches for the largest value in the collection.
	 * 
	 * @param values The collection to be searched.
	 * @return The largest value found in the collection.
	 */
	public static Integer getLargestValue(final List<Integer> values) {
		if(values.size() == 1) {
			return values.get(0);
		}
		
		final List<Integer> valuesList = new ArrayList<>();
		for(int i = 1; i < values.size(); i++) {
			valuesList.add(values.get(i));
		}
		
		if(values.get(0) > getLargestValue(valuesList)) {
			return values.get(0);
		}else {
			return getLargestValue(valuesList);
		}
	}
	
	/**
	 * Searches for the lowest value in the collection.
	 * 
	 * @param values The collection to be searched.
	 * @return The lowest value found in the collection.
	 */
	public static Integer getLowestValue(final List<Integer> values) {
		if(values.size() == 1) {
			return values.get(0);
		}
		
		final List<Integer> valuesList = new ArrayList<>();
		for(int i = 1; i < values.size(); i++) {
			valuesList.add(values.get(i));
		}
		
		if(values.get(0) < getLowestValue(valuesList)) {
			return values.get(0);
		}else {
			return getLowestValue(valuesList);
		}
	}

	/**
	 * Adds up the elements of the list.
	 * 
	 * @param values The list which will have its elements added up.
	 * @return The sum of the list elements.
	 */
	public static Integer getSum(final List<Integer> values) {
		if(values.size() == 1) {
			return values.get(0);
		}
		
		final List<Integer> valuesList = new ArrayList<>();
		for(int i = 1; i < values.size(); i++) {
			valuesList.add(values.get(i));
		}
		
		return values.get(0) + getSum(valuesList);
	}
	
	/**
	 * Multiplies the elements of the list.
	 * 
	 * @param values The list which will have its elements multiplied.
	 * @return The product of the list elements.
	 */
	public static Integer getProduct(final List<Integer> values) {
		if(values.size() == 1) {
			return values.get(0);
		}
		
		final List<Integer> valuesList = new ArrayList<>();
		for(int i = 1; i < values.size(); i++) {
			valuesList.add(values.get(i));
		}
		
		return values.get(0) * getProduct(valuesList);
	}

	/**
	 * Calculates the average of the elements in a list.
	 * 
	 * @param values The list which will have its average calculated.
	 * @return The average of the list elements.
	 */
	public static Integer getAverage(final List<Integer> values) {
		return getSum(values) / values.size();
	}

}