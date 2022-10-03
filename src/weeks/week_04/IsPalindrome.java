package weeks.week_04;

import java.util.Scanner;

public class IsPalindrome {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = input.nextLine();
		
		int first = 0;
		int last = s.length() - 1;
		boolean isPalindrome = true;
		
		while(first < last) {
			if (s.charAt(first) != s.charAt(last)) {
				isPalindrome = false;
				break;
			}
			first++;
			last--;
		}
		if (isPalindrome) {
			System.out.println(s + " is a palindrome.");
		}
		else 
			System.out.println(s + " is not a palindrome.");
			
		}
		
		
		
}
