package chapters.chapter03;

import java.util.Scanner;

public class Checkpoint_13 {

	public static void main(String[] args) {
				
		Scanner keyboard = new Scanner(System.in);
			
			System.out.println("Enter a num: ");
			int num = keyboard.nextInt();
			
			if(num % 2 == 0 && num % 3 == 0) {
				System.out.println("Your nums are dividing 2 and 3. ");
			}if (num % 2 == 0 || num % 3 == 0) {
				System.out.println("Your nums are dividing 2 or 3. ");
			}if (num % 2 == 0 ^ num % 3 == 0) {
				System.out.println("The number you entered is divisible or two and three, but not both.");
		}
	}
}

		
		
	


