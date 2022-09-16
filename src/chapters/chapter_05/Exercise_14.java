package Chapters.chapter_05;
import java.util.Scanner;
//find greatest common divisor 
public class Exercise_14 {
	public static void main(String[] args) {
		System.out.print("Enter the first number: ");
		int num1 = in.nextInt();
		System.out.print("Enter the other number: ");
		int num2 = in.nextInt();
		
		int gcd = 0;
		
		for(int i = 1; i <= num1 && i <= num2; i++){
			if(num1 % i == 0 && num2 % i == 0) gcd = i;
			System.out.println("i: " + i);
		}
		
		System.out.println("Greatest common denominator: " + gcd);
}
}
