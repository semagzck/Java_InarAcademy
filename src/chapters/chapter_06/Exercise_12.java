package chapter_06;

public class Exercise_12 {
	 
	 public static void main(String[] args) {
	  printChars('1', 'Z', 10);
	 
	 }
	 
	 public static void printChars(char ch1, char ch2, int numberPerLine) {
	  int numberOfPrinted = 0;
	 
	  for (; ch1 <= ch2; ch1++) {
	   System.out.print(ch1 + " ");
	   numberOfPrinted++;
	   if (numberOfPrinted % numberPerLine == 0) {
	    System.out.println();
	   }
	  }
	 
	 }
	 
	}
