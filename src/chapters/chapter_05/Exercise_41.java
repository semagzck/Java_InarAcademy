package Chapters.chapter_05;
import java.util.Scanner;

public class Exercise_41 {
	public static void main(String[] args) {

	int i = 0; int n = 0;
	
	System.out.print("Enter numbers: ");
	
	while(in.hasNextInt()){
		int n = input.nextInt();
		if(n == 0) break;
		if(n > i) {
			i = n;
			System.out.println("test");
			count = 1;
		} else if (n == i) {
		count++;
		}
		
	}
System.out.print("The max number was: " + max + " and it occured " + count + " times.");
}
}
