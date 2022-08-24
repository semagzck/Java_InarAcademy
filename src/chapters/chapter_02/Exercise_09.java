public class Exersice_09 {
public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.print("Enter v0, v1, t:");

  double v0 = input.nextdouble();
  double t = input.nextdouble();
  double v1 = input.nextdouble();
  double avg = (v1 - v0) / t;
 
  System.out.println("The average acceleration is " + avg);
 
 }
 
}
