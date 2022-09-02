package chapters.chapter_04;
import java.util.Scanner;

public class Exercise_02 {
	
public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
		 
		  System.out.print("Enter the side:");
		  System.out.print("Enter point 1  in degrees: ");
		  double x1 = Math.toRadians(input.nextDouble());
		  double y1 = Math.toRadians(input.nextDouble());
		 
		  System.out.print("Enter point 2  in degrees: ");
		  double x2 = Math.toRadians(input.nextDouble());
		  double y2 = Math.toRadians(input.nextDouble());
		 
		  double distance = 6371.01 * Math.acos(Math.sin(x1) * Math.sin(x2)
		    + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
		  System.out.println("The distance between the two points  " + distance
		    + " km");
		 
		 }
		 
		
}
