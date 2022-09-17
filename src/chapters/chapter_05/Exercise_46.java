package Chapters.chapter_05;

import java.util.Scanner;
public class Exercise_46 {
	public static void main(String[] args) {
		System.out.print("Enter a string: ");
	String str = in.next();
		System.out.print("Your string reversed is: ");
		
		for(int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
}

}
