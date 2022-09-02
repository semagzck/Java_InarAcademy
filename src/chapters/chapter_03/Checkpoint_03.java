package chapters.chapter03;

import java.util.Scanner;

public class Checkpoint_03 {

	public static void main(String[] args) {
		
		//Random proces
		int num1 = (int)(System.currentTimeMillis() %10);
		int num2 = (int)(System.currentTimeMillis() / 9 % 10);
		
		
		System.out.println(num1 + " + " + num2 + " = ?");
		Scanner input = new Scanner(System.in);
		
		int total = input.nextInt();
		if(num1 + num2 == total) {
			System.out.println("Answer is true");
		}else {
			System.out.println("Answer is false");
		}

	}

}

