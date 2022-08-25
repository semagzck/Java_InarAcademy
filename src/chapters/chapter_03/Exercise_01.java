public class Exercise_1 {
 
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
 
  System.out.print("Enter a, b, c:");
  double a = input.nextDouble();
  double b = input.nextDouble();
  double c = input.nextDouble();
  double discriminant = Math.pow(b, 2) - 4 * a * c;
 
  if (discriminant < 0) {
   System.out.println("The equation has no real roots");
   System.exit(0);
  }
 
  double r1 = (-b + Math.sqrt(discriminant)) / (2 * a);
  double r2 = (-b - Math.sqrt(discriminant)) / (2 * a);
 
  if (discriminant > 0) {
   System.out.println("The equation has two roots " + r1 + " and "
     + r2);
  } else {
   System.out.println("The equation has one root " + r1);
  }
 
 }
}
