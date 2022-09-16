package chapter.Chapter_05;

import java.util.Scanner;

public class Exercise_36 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the first 9 digits of an ISBN as integer:");
		int isbn = input.nextInt();
		final int a = isbn;
		int d10 = 0;
		for (int i = 9; i > 0; i--) {
			int digit = isbn % 10;
			isbn /= 10;
			d10 += digit * i;
		}
		d10 = d10 % 11;

		if (d10 != 10) {
			System.out.println(a + d10);
		} else {
			System.out.println(a + 'X');
		}
	}

}

