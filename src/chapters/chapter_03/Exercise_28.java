package chapters.chapter_03;
import java.util.Scanner;

public class Exercise_25 {

			Scanner input = new Scanner(System.in);
			
			System.out.println("Enter r1's center x-,  y-coordinates, width, and height: ");
			double x1 = input.nextDouble();
			double y1 = input.nextDouble();
			double width = input.nextDouble();
			double height = input.nextDouble();
			
			double rectangleRight = x1 + width / 2 ;
			double rectangleLeft = x1 - width / 2 ;
			double rectangleTop = y1 + height / 2 ;
			double rectangleBottom = y1 - height / 2 ;
			
System.out.println( " Enter r2's center x-, y-coordinates, width, and height: ");
			double x2 = input.nextDouble();
			double y2 = input.nextDouble();
			double width2 = input.nextDouble();
			double height2 = input.nextDouble();
			
			double rectangleRight2 = x2 + width2 / 2 ;
			double rectangleLeft2 = x2 - width2 / 2 ;
			double rectangleTop2 = y2 + height2 / 2 ;
			double rectangleBottom2 = y2 - height2 / 2 ;
			
			boolean isInside = rectangleRight >= rectangleRight2 && rectangleLeft <= rectangleLeft2 && 
					rectangleTop >= rectangleTop2 && rectangleBottom <= rectangleBottom2 ;
			
			boolean isOutside = rectangleRight < rectangleLeft2 || rectangleLeft > rectangleRight2 || 
					rectangleTop < rectangleBottom2 || rectangleBottom > rectangleTop2 ;
			
					
			if(isInside)
				System.out.println("r2 is inside r1");
			else if(isOutside)
				System.out.println("r2 does not overlap r1");
			else 
				System.out.println("r2 overlaps r1");
			
			
		}
	​
	}
}
