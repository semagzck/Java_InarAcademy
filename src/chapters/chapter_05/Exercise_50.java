package Chapters.chapter_05;
import java.util.Scanner;

public class Exercise_50 {

	public static void main(String[] args) {
		System.out.print("Enter a string: ");
		String str = input.nextLine();
		int upperCount = 0;
	
		for(int i = 0; i < str.length(); i++){
			upperCount += ( (int) str.charAt(i) < 65 || (int) str.charAt(i) > 90) ? 0 : 1;
		}
		
		System.out.println("The number of upper case letters is " + upperCount);
	}
}
