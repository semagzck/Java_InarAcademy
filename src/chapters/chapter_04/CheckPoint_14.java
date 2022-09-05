import java.util.Scanner;

public class Test {
  public static void main(String[] args) {       
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an integer: ");
    int value = input.nextInt();
    System.out.println("The value is " + value);

    System.out.print("Enter a line: ");
    String line = input.nextLine();
    System.out.println("The line is " + line);
  }
}            
