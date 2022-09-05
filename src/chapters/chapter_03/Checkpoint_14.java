package chapters.chapter03;

import java.util.Scanner;

public class Checkpoint_14 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a year: ");
		int year = keyboard.nextInt();
		
		boolean leapyear = year % 4 == 0;
		
		leapyear = leapyear && year % 100 != 0;
		leapyear = leapyear || year % 400 == 0;
		
		if(leapyear) {
			System.out.println(year + " this is a leap year. ");
		}else {
			System.out.println(year + " this isn't leap year. ");
		}
		
	}

}

