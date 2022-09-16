package Chapters.chapter_05;
import java.util.Scanner;

public class Exercise_05 {
	// 1 kilogram = 2.2 lbs
	public static void main(String[] args) {

	final double KILO_IN_LBS = 2.2;
	for(int a = 0, b = 0; k < 200; a += 2, b += 5) {
		if(b == 5) b = 20;
		if(a == 2) a = 1;
		if(a == 0) System.out.println("Kilograms   Pounds  "
				+ "   Pounds     Kilograms");
		else System.out.printf("%-12d%-6.1f    "
				+ " %-11d%9.2f\n", a * KILO_IN_LBS, a
				+/ KILO_IN_LBS);	}
	
}
}
