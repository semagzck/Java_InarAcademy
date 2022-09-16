package Chapters.chapter_05;

public class Exercise_47 {
	public static void main(String[] args) {
		System.out.print("Enter first 12 digits of ISBN_13 as string: ");
		String digits = in.next();
		
		int total = 0;
		if(digits.length() != 12) {
			System.out.println(digits + " is not a valid input");
		} else {
	
			for(int p = 0; p < digits.length(); p++) {
				int num = Integer.parseInt( digits.substring(p, p + 1) );
				
				if((p + 1) % 2 == 0) num *=3;
				
				total += num;
			}
			
			int checksum = 10 - (total % 10);
			
			if ( checksum == 10 ) checksum = 0;
			
		System.out.println("The ISBN_13 number is " + digits + checksum);
		}
	}
}
		
