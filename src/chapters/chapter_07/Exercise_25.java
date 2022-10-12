package chapter_07;

import java.util.Scanner;

public class Exercise_25 {
	 public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);


	System.out.print("Enter values for a, b, and c: ");
	
	double a = input.nextDouble();
	double b = input.nextDouble();
    double c = input.nextDouble();
	
	double[] coefficients = {a, b, c};
	
	double r1 = (-b + (Math.pow(Math.pow(b, 2) - (4 * a * c), 0.5))) / (2 * a);
	double r2 = (-b - (Math.pow(Math.pow(b, 2) - (4 * a * c), 0.5))) / (2 * a);
	
	double [] roots = {r1, r2};
	
	solveQuadratic(coefficients, roots);
	 }

	private static void solveQuadratic(double[] coefficients, double[] roots) {
		// TODO Auto-generated method stub
		
	}
}
