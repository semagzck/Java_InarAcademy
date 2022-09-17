package Chapters.chapter_05;
import java.util.Scanner;

public class Exercise_51 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first string : ");
		String str1 = input.nextLine();
		System.out.println("Enter the second string : ");
		String str2 = input.nextLine();
		String prefix = "";
		if (str1.length() < str2.length()) {// The largest string fixed str1
			String temp = str2;
			str2 = str1;
			str1 = temp;
		}

		for (int i = 0; i < str2.length(); i++) {
			if (str1.charAt(i) == str2.charAt(i)) {
				prefix = prefix + str1.charAt(i);
			}

		}
		if (prefix.length() == 0) {
			System.out.println("Strings have no common prefix");
		}
		System.out.println("The common prefix is " + prefix);

	}


