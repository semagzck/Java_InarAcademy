public class Exercise_10{
 
 public static void main(String[] args) {
 
  Scanner input = new Scanner(System.in);
 
  System.out.print("Enter the amount of water in kg:");
  double M = input.nextDouble();
  System.out.print("Enter the initial temperature:") ;
  double initialTemperature = input.nextDouble() ;
  System.out.print("Enter the final temperature: ");
  double finalTemperature = input.nextDouble() ;
 
  double Q = M * (finalTemperature - initialTemperature) * 4184;
  System.out.print("The energy needed is " + Q );
 
 }
}
