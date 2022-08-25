public class Exercise_12 {
 public static void main(String[] args) {
 
  Scanner input = new Scanner(System.in);
 
  System.out.print("Enter speed and acceleration:");
  double v = input.nextDouble();
  double a = input.nextDouble();
  double length = Math.pow(v, 2)/(2*a);
   
  System.out.print("The minimum runway length for this airplane is " + length);
 
 }
}
