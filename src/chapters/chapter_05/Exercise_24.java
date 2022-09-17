package Chapters.chapter_05;

public class Exercise_24 {

	public static void main(String[] args) {
		// add 1/3 + 3/5 + ... + 97 / 99
		double ans = 0;
		for(double num = 97.0, den = 99.0; num >= 1; num -=2, den -= 2) {
			
			ans += (num / den);
			
			System.out.println("Now it is: " + ans);
		}
		System.out.println("The answer is: " + ans);
		
		System.out.println("What is 97 / 99 ? :  " + 97.0 / 99.0);
	}

}

