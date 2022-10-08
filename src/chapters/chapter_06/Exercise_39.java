package chapter_06;

public class Exercise_39 {
    private static Object in;

	public static void main(String[] args) {

	System.out.print("Enter three points (6 numbers): ");
	
	
	double x0 = in.nextDouble();
    double y0 = in.nextDouble();
	double x1 = in.nextDouble();
	double y1 = in.nextDouble();
	double x2 = in.nextDouble();
	double y2 = in.nextDouble();
	
	// x0, y0, x1, y1, x2, y2    for quick copying
	
	if ( leftOfTheLine(x0, y0, x1, y1, x2, y2 )) {
		System.out.println("(" + x2 + ", " + y2 + ") is on the left side of the line from (" +
				x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");
		}
	else if (onTheSameLine(x0, y0, x1, y1, x2, y2 )) {
		System.out.println("(" + x2 + ", " + y2 + ") is on the same line from (" +
				x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");
	} 
	else if (onTheLineSegment(x0, y0, x1, y1, x2, y2 )) {
		System.out.println("(" + x2 + ", " + y2 + ") is on the line segment from (" +
				x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");
	}
	else {
		System.out.println("(" + x2 + ", " + y2 + ") is on the right side of the line from (" +
				x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");
	}
	
}

	private static boolean leftOfTheLine(double x0, double y0, double x1, double y1, double x2, double y2) {
		// TODO Auto-generated method stub
		return false;
	}

	private static boolean onTheLineSegment(double x0, double y0, double x1, double y1, double x2, double y2) {
		// TODO Auto-generated method stub
		return false;
	}

	private static boolean onTheSameLine(double x0, double y0, double x1, double y1, double x2, double y2) {
		// TODO Auto-generated method stub
		return false;
	}
}

