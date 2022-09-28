package chapter_06;

import java.util.Scanner;

public class Exercise_03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
        System.out.println("Enter an integer for palindrome test: ");
        int number = input.nextInt();

        if (isPalindrome(number)) {
            System.out.println("Number is a palindrome");
        } else {
            System.out.println("Number is not a palindrome");
            input.close();
        }
    }

    public static int reverse(int number) {
        String temp = "";
        while (number > 0) {
            int tNum = number % 10;
            number /= 10;
            temp += tNum;

        }
        return Integer.parseInt(temp);
    }

    public static boolean isPalindrome(int number) {
        String n1 = String.valueOf(number);
        String n2 = String.valueOf(reverse(number));

        return n1.equals(n2);
	}

}
