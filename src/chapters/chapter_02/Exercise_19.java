System.out.print("Enter three points for a triangle:");
  double x1 = input.nextDouble();
  double y1 = input.nextDouble();
  double x2 = input.nextDouble();
  double y2 = input.nextDouble();
  double x3 = input.nextDouble();
  double y3 = input.nextDouble();
 
  double side1 = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
  double side2 = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
  double side3 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
  double s = (side1 + side2 + side3) / 2;
  double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
 
  System.out.print("The area of the triangle is  " + area);
 
 }
}
