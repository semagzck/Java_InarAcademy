package chapters.chapter_03;
import java.util.Scanner;

public class Exercise_12 {
	 
	 
	 public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
	 
	  System.out.print("Enter a three-digit integer:");
	  int number = input.nextInt();
	 
	  int first = number / 100;
	  int last = number % 10;
	  if (last == first) {
	   System.out.print(number + " is a palindrome");
	  } else {
	   System.out.print(number + " is not a palindrome");
	  }
	 
	 }
	 
}