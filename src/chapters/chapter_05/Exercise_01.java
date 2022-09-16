package Chapters.chapter_05;
import java.util.Scanner;
public class Exercise_01 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//positive/negative/average/total
		System.out.print("Enter integers.  Zero to stop: ");
		boolean zero = false;
		int positiveCount = 0;
		int negativeCount = 0;
		double total = 0;
		
		while (!zero) {
			int num = in.nextInt();
			if(num == 0) zero = true;
		else if(num > 0) {
				positiveCount++;
				total += num;
			} else {
				negativeCount++;
				total +=num;
			}
		} 
		
		if(total != 0) {
			double average = total / (positiveCount + negativeCount);
			System.out.println("The number of positives is " + positiveCount);
			System.out.println("The number of negatives is " + negativeCount);
			System.out.println("The total is " + total);
			System.out.println("The average is " + average);
			} else {
			System.out.println("No numbers are entered except 0");
			}



	}

}

