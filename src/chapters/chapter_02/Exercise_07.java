            public class Exersice_07 {
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.print("Enter the number of minutes:");
  int number = input.nextInt();
  int days = number/(24*60);
  int years = days/365;
 
 
  System.out.println(number + " minutes is approximately " + years +" years and " + days%365 +" days");
 
 }
 
}
