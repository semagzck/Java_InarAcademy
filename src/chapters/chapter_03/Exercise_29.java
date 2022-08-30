package chapters.chapter_03;

import java.util.Scanner;
​public class Exercise_29 {
	 public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        
	        double x1, y1, x2, y2, r1, r2;
	        System.out.print("\nEnter circle1's center x-, y-coordinates, and radius: ");
	        x1 = input.nextDouble();
	        y1 = input.nextDouble();
	        r1 = input.nextDouble();
​
	        System.out.print("\nEnter circle2's center x-, y-coordinates, and radius: ");
	        x2 = input.nextDouble();
	        y2 = input.nextDouble();
	        r2 = input.nextDouble();
​
	        double distanceCenter = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1 , 2));
	        
	        if(( r1-r2) < 0 ) {
	        	double temp = r1 ;
	        	r1 = r2 ;
	        	r2 = temp;
	        	
	        }
	        
	        if((r1 - r2) >= distanceCenter ) {
	        	System.out.println("circle2 is inside circle1 ");
	        }else if (r1 + r2 >= distanceCenter ) {
	        	System.out.println("circle2 overlaps circle1 ");
	        }else {
	        	System.out.println("circle2 does not overlap circle1 ");
	        }
	       
​
	    }
​
}