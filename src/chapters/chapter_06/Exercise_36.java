package chapter_06;

public class Exercise_36 {
public static double areaOfRegPoly(int n, double side) {
		
		return ( (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n)) );
		
	}
}

