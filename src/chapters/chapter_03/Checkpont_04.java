package chapters.chapter03;

import java.util.Scanner;

public class Checkpoint_04 {

	public static void main(String[] args) {
		//SimpleIfDemo
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int number = input.nextInt();
		
		if(number % 5 == 0 ) {
			System.out.println("Hi Five");
		}
		if(number % 2 == 0) {
			System.out.println("Hi Even");
			System.out.println("Hello my friend.");
		}

	}

}
