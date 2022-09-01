package chapters.chapter_03;

import java.util.Scanner;

public class Exercise_27 {
	public static void main(String[] args) {
		  Scanner input = new Scanner(System.in);
	 
		  System.out.println("Enter point x,y coordinates: ");
	        double x = input.nextDouble();
	        double y = input.nextDouble();
    
if((x == 0 && y <= 100) || (x == 0 && x <= 200 ) || (x <= 200 && y <= 100 && y / 200-x <= 0.5))

	System.out.println("point is not in the triangle");
	
else {
	        	System.out.println("point is not in the triangle");
	        
	        
}
	}
}

