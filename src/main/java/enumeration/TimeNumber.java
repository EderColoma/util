package enumeration;

import lombok.Getter;

@Getter
public enum TimeNumber {

	ZERO(0, "zero"),
	ONE(1, "one"),
	TWO(2, "two"),
	THREE(3, "three"),
	FOUR(4, "four"),
	FIVE(5, "five"),
	SIX(6, "six"),
	SEVEN(7, "seven"),
	EIGHT(8, "eight"),
	NINE(9, "nine"),
	TEN(10, "ten"),
	ELEVEN(11, "eleven"),
	TWELVE(12, "twelve"),
	THIRTEEN(13, "thirteen"),
	FOUTEEN(14, "fourteen"),
	FIFTEEN(15, "quarter"),
	SIXTEEN(16, "sixteen"),
	SEVENTEEN(17, "seventeen"),
	EIGHTEEN(18, "eighteen"),
	NINETEEN(19, "nineteen"),
	TWENTY(20, "twenty"),
	TWENTY_ONE(21, "twenty one"),
	TWENTY_TWO(22, "twenty two"),
	TWENTY_THREE(23, "twenty three"),
	TWENTY_FOUR(24, "twenty four"),
	TWENTY_FIVE(25, "twenty five"),
	TWENTY_SIX(26, "twenty six"),
	TWENTY_SEVEN(27, "twenty seven"),
	TWENTY_EIGHT(28, "twenty eight"),
	TWENTY_NINE(29, "twenty nine"),
	THIRTY(30, "half");

	private Integer intNumber;
	private String word;
	
	/**
	 * Standard construtor.
	 * 
	 * @param number The number represented by the enumeration.
	 * @param word The word that describes the number.
	 */
	private TimeNumber(final Integer number, final String word){
		this.intNumber = number;
		this.word = word;
	}
	
	/**
	 * Returns the number by its integer value.
	 * 
	 * @param number The number to be returned.
	 * @return The {@link TimeNumber} corresponding to the given number.
	 */
	public static TimeNumber getFromNumber(final Integer number) {
		for (final TimeNumber e : values()) {
	        if (e.intNumber.equals(number)) {
	            return e;
	        }
	    }

	    return null;
	}
}
