package chapters.chapter_03;


import java.util.*;

public class Exercise_15 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
    int lottery = 188;
		int ld1 = lottery / 100;
		int ld2 = (lottery % 100) / 10;
		int ld3 = lottery % 10;
		System.out.println("Enter your lottery  (three digits): ");
		int lotteryGuess = input.nextInt();
		// Finding digits of guess lottery number
		int gd1 = lotteryGuess / 100;
		int gd2 = (lotteryGuess % 100) / 10;
		int gd3 = lotteryGuess % 10;

		if (lotteryGuess > 100 && lotteryGuess < 1000) {
			if (lottery == lotteryGuess) {
				System.out.println("Congratulations! You knew the lottery number in the exact order. You won $10.000");
			} else if ((ld1 == gd1 || ld1 == gd2 || ld1 == gd3) && (ld2 == gd1 || ld2 == gd2 || ld2 == gd3)
					&& (ld3 == gd1 || ld3 == gd2 || ld3 == gd3) ) {
				System.out.println("Match all digits in the lottery number. You won $3.000");

			} else if ((ld1 == gd1 || ld1 == gd2 || ld1 == gd3) || (ld2 == gd1 || ld2 == gd2 || ld2 == gd3)
					|| (ld3 == gd1 || ld3 == gd2 || ld3 == gd3)) {
				System.out.println("One digit matches a digit in the lottery number. You won $1.000");
			} else {
				System.out.println("Your guess is incorrect. Please try again!!!");
			}
		} else {
			System.out.println("You should have entered three digit numbers ");

		}
		System.out.println("Lottery number : " + lottery);
		System.out.println("Your guess  : " + lotteryGuess);
	}
}



