
import java.util.Scanner;
 
public class ProgrammingEx4_20 {
 
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
 
  System.out.print("Enter some string:");
  String s = input.nextLine();
  System.out.println("The string length is " + s.length());
  System.out.println("The first character is " + s.charAt(0));
 
 }
 
}
