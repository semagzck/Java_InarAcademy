package chapter_05;
import java.util.Scanner;
public class Exercise_04 {
	final double MILE_IN_KILOMETERS = 1.609;
	
	for(int mile = 0; mile < 11; mile++) {
	if(mile == 0) System.out.println("Miles     Kilometers");
	else System.out.printf("%-10d%1.3f\n", mile, mile * MILE_IN_KILOMETERS);
}
}
}

