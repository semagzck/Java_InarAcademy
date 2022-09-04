package chapters.chapter_04;


import java.util.Scanner;

public class Exercise_26 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);




		System.out.println("Enter an amount in double, for example 11,56: ");
		
		String amount = input.next();
		
//0,indiksinden , görene kadar al ,   . yı gördükten sonrA +1DEN BAŞLA SONUNA KADAR GİT
		int numberOfDollars = Integer.parseInt(amount.substring(0, amount.indexOf(',')));
		int numberOfCents = Integer.parseInt(amount.substring(amount.indexOf(',') + 1));

		// Calculate cents
		int numberOfQuarters = numberOfCents / 25;
		numberOfCents = numberOfCents % 25;

		int numberOfDimes = numberOfCents / 10;
		numberOfCents = numberOfCents % 10;

		int numberOfNickels = numberOfCents / 5;
		numberOfCents = numberOfCents % 5;

		int numberOfPennies = numberOfCents;

		System.out.println(
				"Your amount consists of \t" + numberOfDollars + " dollars \t" + numberOfQuarters + " quarters \t"
						+ numberOfDimes + " dimes \t" + numberOfNickels + " nickels \t" + numberOfPennies + " pennies");

	}

}

