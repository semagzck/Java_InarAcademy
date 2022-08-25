public class Exercise_13 {
 public static void main(String[] args) {
 
  Scanner input = new Scanner(System.in);
 
  System.out.print("Enter the monthly saving amount:");
  double ini = input.nextDouble();
  double accum = 0;
  accum = (ini + accum) * 1.00417;
  accum = (ini + accum) * 1.00417;
  accum = (ini + accum) * 1.00417;
  accum = (ini + accum) * 1.00417;
  accum = (ini + accum) * 1.00417;
  accum = (ini + accum) * 1.00417;
 
  System.out.print("After the sixth month the account value is " + accum);
 
 }
}
