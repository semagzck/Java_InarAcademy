package chapters.chapter_04;
import java.util.Scanner;

public class Exercise_05 {
	 
	 public static void main(String[] args) {
	   Scanner input = new Scanner(System.in);
	   System.out.print("Enter the number of side:");
	   double n = input.nextDouble();
	   
	  System.out.print("Enter the side:");
	  double s = input.nextDouble();
	   
	  double area = n * Math.pow(s, 2) / (4 * Math.tan(Math.PI / n));
	 
	  System.out.println("The area of the polygon is " + area);
	 
	 }
	 
	}
}
