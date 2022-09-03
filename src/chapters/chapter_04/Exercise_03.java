package chapters.chapter_04;

public class Exercise_03 {
	// 1-Atlanta, Georgia; 51.5138505182,-0.15690922737098845
	 // 2- Orlando, Florida; 28.5383355,-81.37923649999999
	 // 3- Savannah, Georgia; 32.0835407,-81.09983419999998
	 // 4-Charlotte, North Carolina;35.2270869,-80.84312669999997
	 public static void main(String[] args) {

	  double x1 = 51.5138505182;
	  double y1 = -0.15690922737098845;
	 
	  double x2 = 28.5383355;
	  double y2 = -81.37923649999999;
	 
	  double x3 = 32.0835407;
	  double y3 = -81.09983419999998;
	 
	  double x4 = 35.2270869;
	  double y4 = -80.84312669999997;

	  //  1st triangle; p1, p2 and, p3
  double side1 = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
  double side2 = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
  double side3 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
  double s = (side1 + side2 + side3) / 2;
  double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

  // 2nd triangle; p1, p3 and, p4

  side1 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
  side2 = Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2));
  side3 = Math.sqrt(Math.pow(x1 - x4, 2) + Math.pow(y1 - y4, 2));
  s = (side1 + side2 + side3) / 2;
  area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3)) + area;

  System.out.print("The area enclosed by 4 cities is " + area + " km^2");

 }

}
	 }

