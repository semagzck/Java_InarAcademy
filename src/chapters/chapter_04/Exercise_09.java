package chapters.chapter_04;
import java.util.Scanner;

public class Exercise_09 {
	 
	 
	 public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
	 
	  System.out.print("Enter a character: ");
	  String x = input.nextLine();
	  char chart= x.charAt(0);
	 
	  System.out.print("The Unicode for the character " + chart + " is "
	    + (int) chart);
	 
	 }
	 
	}


