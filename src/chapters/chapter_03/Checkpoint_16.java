package chapters.chapter03;

import java.util.Scanner;

public class Checkpoint_16 {

	public static void main(String[] args) {
		// statements, weekday -weekend.
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a num for day (Sunday is 1, Monday is 7)");
		
		int day = keyboard.nextInt();
		
		switch (day) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("Weekday");
			break;
		case 6:
		case 7:
			System.out.println("Weekend");
			break;
			default:
				System.out.println("Wrong Input");
		}
	}
}

