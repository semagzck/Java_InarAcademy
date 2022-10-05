package chapter_06;

public class Exercise_30 {
	public static int shootCrap() {
		int result = 0;
		int die1 = rollDie();
		int die2 = rollDie();
		result = die1 + die2;
		System.out.println("You rolled " + die1 + " + " + die2 + " = " + result);
		return result;
	}
	
	public static int rollDie() {
		int die = (int)(Math.random() * 6) + 1;
		return die;
	}
}

