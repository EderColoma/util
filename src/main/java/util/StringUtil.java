package util;

import java.util.ArrayList;
import java.util.List;

/**
 * Utility methods for String objects.
 */
public class StringUtil {

	/**
	 * Makes the constructor private so the class can not be instantiated.
	 */
	private StringUtil() {}
	
	/**
	 * Converts a text into a list of characters.
	 * 
	 * @param text The text to be converted.
	 * @return The list of characters of the givent text.
	 */
	public static List<String> toList(String text){
		List<String> stringList = new ArrayList<String>();
		
		for(int i = 0; i < text.length(); i++) {
			stringList.add(text.substring(i, i+1));
		}
		
		return stringList;
	}
	
}
