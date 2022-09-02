package chapters.chapter_04;
import java.util.Scanner;

public class Exercise_24 {
	 
	 
	 public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
	  System.out.print("Enter the first city:");
	  String first = input.nextLine();
	  
	  System.out.print("Enter the third city:");
	  String third = input.nextLine();
	  String temp = "";
	  System.out.print("Enter the second city:");
	  String second = input.nextLine();
	  if (first.compareTo(second) > 0) {
	   temp = second;
	   second = first;
	   first = temp;
	 
	  }
	  if (second.compareTo(third) > 0) {
	   temp = third;
	   third = second;
	   second = temp;
	 
	  }
	  if (first.compareTo(second) > 0) {
	   temp = second;
	   second = first;
	   first = temp;
	 
	  }
	  System.out.println("The three cities in alphabetical order are "
	    + first + " " + second + " " + third);
	 }
	 
	}

