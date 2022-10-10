package chapter_07;

import java.util.Scanner;

public class Exercise_10 {
	   public static int indexOfSmallestElement(double[] array) {
			Scanner input = new Scanner(System.in);

	 System.out.print("Enter 10 numbers: ");

  double nums[] = new double[10];

   for(int i = 0; i < 10; i++) {
       nums[i] = input.nextDouble();
  }
   System.out.println("The smallest number was found at nums[" + indexOfSmallestElement(nums) +
           "] and that value was " + nums[indexOfSmallestElement(nums)]);
return 0;
}
}
