package chapters.chapter03;

import java.util.Scanner;

public class Checkpoint_15 {

	public static void main(String[] args) {
		
		
		int lotteryNum = (int)(Math.random() * 90) +10;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a two digits number for the lottery:");
		int guess = keyboard.nextInt();
		
		int lotteryFirstNum = lotteryNum % 10;
		int lotterySecondNum = lotteryNum / 10;
		
		int guessFirstNum = guess % 10;
		int guessSecondNum = guess / 10;
		
		System.out.println("Lottery Number: " +lotteryNum);
		
		if(lotteryNum == guess) {
			System.out.println("Won LOOOTTERY! 10000 TL.");
		}else if(lotteryFirstNum == guessFirstNum && lotterySecondNum == guessFirstNum) {
			System.out.println("Won LOOOTTERY! 3000 TL.");
		}else if(lotteryFirstNum == guessFirstNum || lotteryFirstNum == guessSecondNum || lotterySecondNum == guessFirstNum || lotterySecondNum == guessSecondNum) {
			System.out.println("Won LOOOTTERY! 1000 TL.");
		}else{
			System.out.println("Lose LOOOTTERY!.");
		}
	}
}
	


