package chapter_07;

import java.util.Scanner;

public class Exercise_08 {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

	System.out.print("Enter 10 doubles to return the average: ");
   double array[] = new double[10];
   for(int i = 0; i < 10; i++) {
       array[i] = input.nextDouble();
   }
   System.out.println("The average: " + average(array));
}

	private static String average(double[] array) {
		// TODO Auto-generated method stub
		return null;
	}
}
