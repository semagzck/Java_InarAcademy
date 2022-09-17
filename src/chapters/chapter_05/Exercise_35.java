package Chapters.chapter_05;
import java.util.Scanner;

public class Exercise_35 {
	public static void main(String[] args) {

	double result = 0;
		for (int i = 1; i <= 621; i++) {
			result += (1 / (Math.pow(i, 0.5) + (Math.pow(i + 1, 0.5))));

		}
		System.out.println("Summation of given series is " + (int)(result*1000)/1000.);
	}

}

