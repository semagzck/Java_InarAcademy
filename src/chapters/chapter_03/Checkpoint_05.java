package chapters.chapter03;

import java.util.Scanner;

public class Checkpoint_05 {

	public static void main(String[] args) {
		//Course score
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your course score: 0 and 100");
		
		int courseScore = input.nextInt();
		
		if(courseScore >= 90) {
			System.out.println("Course score is A");
		
		}if(courseScore >= 80 
				&& courseScore <90) {
			System.out.println("Course score is B");
		}
		
	}

