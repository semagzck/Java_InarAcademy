package chapters.chapter03;

import java.util.Scanner;

public class checkpoint06 {

	public static void main(String[] args) {
		//Course Score.
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter your course score: (Between 0 and 100)");
		
		int courseScore = keyboard.nextInt();
		
		if(courseScore >= 90) {
			System.out.println("Course Score is A");
		}else if (courseScore >= 80) {
			System.out.println("Course score is B");
		}else if (courseScore >= 70) {
			System.out.println("Course score is C");
		}else if (courseScore >= 60) {
			System.out.println("Course score is D");
		}else {
			System.out.println("Course score is F");
		}

	}

}
