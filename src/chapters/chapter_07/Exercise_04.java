package chapter_07;

import java.util.Scanner;

public class Exercise_04 {
	public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

		int [] scores = new int[100];
      System.out.print("Enter scores (-1 to stop): ");
      int count = 0;
      for(int i = 0; i < 100; i++) {
          int num = input.nextInt();
          if (num == -1) break;
          scores[i] = num;
         count++;
      }
     
      int avg = getAvg(count, scores);
     
     printResults(count, avg, scores);
	}

	private static void printResults(int count, int avg, int[] scores) {
		
	}

	private static int getAvg(int count, int[] scores) {
		return 0;
	}
}
