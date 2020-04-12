package util;

import static  enumeration.TimeNumber.getFromNumber;

public class TimeUtil {

	/**
	 * Makes the constructor private so the class can not be instantiated.
	 */
	private TimeUtil() {}
	
	/**
	 * Transforms a time into words.
	 * 
	 * @param h The hour.
	 * @param m The minutes.
	 * @return The text representing the given time.
	 */
	public static String timeInWords(final int h, final int m) {

		if(m == 0) {
			return  getFromNumber(h).getWord() + " " + minuteInWord(m);
		} else if (m > 30) {
			return minuteInWord(60 - m) + " to " + getFromNumber(h + 1).getWord();
		} else {
			return minuteInWord(m) + " past " + getFromNumber(h).getWord();
		}

    }

	/**
	 * Return the minute in words.
	 * 
	 * @param minute The minute to be returned in words.
	 * @return The given minute in words.
	 */
	private static String minuteInWord(final int minute) {
		if( minute == 0 ) {
			return "o' clock";
		}else if(minute == 15 || minute == 30) {
			return getFromNumber(minute).getWord();
		} else {
			return getFromNumber(minute).getWord() + (minute > 1 ? " minutes" : " minute");
		}
	}
}
