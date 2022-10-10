package chapter_07;

import java.util.Scanner;

public class Exercise_09 {
	public static double min(double[] array) {
	  
		Scanner input = new Scanner(System.in);

	System.out.print("Enter 10 doubles to return the smallest of them: ");
   double[] nums = new double[10];
   for(int i = 0; i < 10; i++) {
			nums[i] = input.nextDouble();
   }
  
  System.out.println("The smallest number: " + min(nums));
return 0;
	  }
  public static double min1(double[] array) {
	return 0;
  }
  }

