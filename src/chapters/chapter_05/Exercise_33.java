//perfect number
package Chapters.chapter_05;
import java.util.Scanner;

public class Exercise_33 {
	public static void main(String[] args) {

	System.out.print("The perfect numbers up to 10,000 are: ");
	for(int num = 6; num < 10001; num++) {
		
		int total = 0;
		
		for(int i = 1; i <= num - 1; i++) {
			if (num % i == 0) total += i;
		}
	
		if (total == num) System.out.print(num + " ");
	}

	}
}
