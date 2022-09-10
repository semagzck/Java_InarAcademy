package chapters.chapter_02;

import java.util.Scanner;
public class checkpoint_07{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an amount in double");
		double amount = input.nextDouble();
		
		//Convert the amount
		int remainingAmount = (int)(amount * 100);
		int numberOfOneDollars = remainingAmount / 100;
		
		 remainingAmount = remainingAmount % 100;
		 int numberOfQuarters = remainingAmount / 25;
		 
		 remainingAmount = remainingAmount % 25;
		 int numberOfDimes = remainingAmount / 10;
		 
		 remainingAmount = remainingAmount % 10;
		 int numberOfNickels = remainingAmount / 5;
		 
		 remainingAmount = remainingAmount % 5;
		 int numberOfPennies = remainingAmount;
		 
		// Display results
		  System.out.println("Your amount " + amount + " consists of"); 
		  System.out.println(" " + numberOfOneDollars + " dollars");
		  System.out.println(" " + numberOfQuarters + " quarters ");
		  System.out.println(" " + numberOfDimes + " dimes"); 
		  System.out.println(" " + numberOfNickels + " nickels");
		  System.out.println(" " + numberOfPennies + " pennies");
		 
		
		 
	}

}
