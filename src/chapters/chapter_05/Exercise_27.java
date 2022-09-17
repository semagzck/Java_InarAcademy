package Chapters.chapter_05;

public class Exercise_27 {
	public static void main(String[] args) {

	//isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
	
	int count = 0;
	for(int year = 101; year <= 2100; year ++) {
		if( (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ) {
			count++;
		System.out.print(year + " ");
			if(count % 10 == 0) System.out.println();
		}
	}
	
	System.out.println("\nThe number of leap years listed is: " + count);
}
}
