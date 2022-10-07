package chapter_06;

import java.util.Scanner;

public class Exercise_20 {
	 public static void main(String[] args) {
		  Scanner input = new Scanner(System.in);
		  System.out.print("Enter a string: ");
		  String s = input.nextLine();
		 
		  System.out.println("The number of letters is " + countLetters(s));
		 
		 }
		 
		 public static int countLetters(String s) {
		 
		  int countLetter = 0;
		 
		  for (int i = 0; i < s.length(); i++) {
		   if (isLetter(s.charAt(i))) {
		    countLetter++;
		   }
		  }
		 
		  return countLetter;
		 }
		 
		 public static boolean isLetter(char ch) {
		 
		  return ((ch <= 'z' && ch >= 'a') || (ch <= 'Z' && ch >= 'A'));
		 
		 }
		 
		
}
