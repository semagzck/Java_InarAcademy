package chapters.chapter_03;
import java.util.Scanner;

public class Exercise_14 {
	 
	 
	 public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
	 
	  System.out.print("Please guess, 0 for head, and 1 for tail:");
	  int x = input.nextInt();
	  int y = (int) (Math.random() * 2);
	 
	  if (x == y) {
	   System.out.print("you won");
	  }
	  else {
	   System.out.print("you lose");
	  }
	 
	 }
	 
	}

