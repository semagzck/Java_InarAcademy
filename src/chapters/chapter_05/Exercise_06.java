package chapter_05;
import java.util.Scanner;

public class Exercise_06 {
	System.out.println("Miles       Kilometers   |   Kilometers      Miles");
	final double MILE_IN_KILOS = 1.609;
	
	for(int m = 1, k = 20; m < 11; m++, k += 5){
		System.out.printf("%-8d%14.3f   |   %-16d%1.3f\n", m, m * MILE_IN_KILOS, k, k / MILE_IN_KILOS);
	}
}
}

