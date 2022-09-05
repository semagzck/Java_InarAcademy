package chapters.chapter03;

import java.util.Scanner;

public class Checkpoint_10 {

	public static void main(String[] args) {
		//Math Random 
		//0-1 ile arasında bir degerdir.
		//System.out.println(Math.random());
		
		int num1 = (int) (Math.random() * 10);
		int num2 = (int) (Math.random() * 10);
		
		//swap algoritmasi.
		if(num2 > num1) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
			
		}
		
		System.out.println(num1 + " - " +num2 + " = ?");
		Scanner keyboard = new Scanner(System.in);
		int result = keyboard.nextInt();
		
		if(num1 - num2 == result) {
			System.out.println("Answer is True.");
		}else {
			System.out.println("Answer is False. Correct answer is: " + num1 + " - " + num2 + " = " + (num1 - num2));
		}

	}

}
