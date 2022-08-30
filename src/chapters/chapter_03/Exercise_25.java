package chapters.chapter_03;
import java.util.Scanner;

public class Exercise_25 {

	 

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a1, b1, a2, b2, <3, b3, a4, b4: ");
		
		double a1 = input.nextDouble();
		
		double b1 = input.nextDouble();
		
		double a2 = input.nextDouble();
		
		double b2 = input.nextDouble();
		
		double a3 = input.nextDouble();
		
		double b3 = input.nextDouble();
		
		double a4 = input.nextDouble();
		
		double b4 = input.nextDouble();
		
		double mX1 = (y2-y1) / (x2-x1);
		double mX2 = (y4 - y3) / (x4 - x3);
		
		if(mX1 == mX2) {
			System.out.println("Two lines are parallel.");
		}else {
			double intersecta = ((mX1 * a1) - (mX2 * a3) + b3 - y1) / (mX1 - mX2);
			double intersectb = (mX1 * (intersecta - a1) + b1 + mX2 * (intersecta - a3) + b3) / 2;
			System.out.println("Intersec point :" + intersecta + " " + intersectb);
		}
	}
}