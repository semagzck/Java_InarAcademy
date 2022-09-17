package Chapters.chapter_05;
import java.util.Scanner;

public class Exercise_40 {
	public static void main(String[] args) {


	int coin;
	int heads = 0;
	int tails = 0;
	
	for(int i = 0; i < 1_000_000; i++) {
		coin = (int) (Math.random() * 2);
		if(coin == 0) heads++;
		else tails++;
	}
	
	System.out.println("    RESULTS");
	System.out.println("________________");
	System.out.println("heads     tails");
	System.out.printf("%1d    %1d ", heads, tails);
	}
}

