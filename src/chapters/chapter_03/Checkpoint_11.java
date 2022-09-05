package chapters.chapter03;

import java.util.Scanner;

public class Checkpoint_11 {

	public static void main(String[] args) {
		//BMI.
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter your weight with kg: ");
		double weight = keyboard.nextDouble();
		
		System.out.println("Enter your height with meter: ");
		double height = keyboard.nextDouble();
		
		double bmi = weight / (height * height);
		
		System.out.println("Bmi : " +bmi);
		if (bmi < 18.5) {
			System.out.println("Under Weight");
		}else if (bmi < 25) {
			System.out.println("Normal");
		}else if (bmi < 30) {
			System.out.println("Over Weight");
		}else
			System.out.println("Obese");
		

	}

}

