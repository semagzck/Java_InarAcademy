package chapter_06;

public class Exercise_37 {
	public static String format(int number, int width) {
		String numStr = "" + number;
		String numFormatted = "";
		int numLength = numStr.length();
		
		if( numLength < width ) {
			int zeros = width - numLength;
			for(int i = 0; i < zeros; i++) {
				numFormatted += "0";
			}
			numFormatted += numStr;
		}
		return ( numLength < width ) ? numFormatted : numStr;
	}
}

