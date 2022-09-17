package Chapters.chapter_05;
import java.util.Scanner;

public class Exercise_43 {
	int total = 0;
	for(int i = 1; i <= 7; i++) {
	for(int j = i + 1; j <= 7; j++) {
		System.out.println(i + " " + j);
			total++;
	}
	}
	System.out.println("The total number of all combinations is " + total);
	
}
}
