package chapter_06;

import java.util.Scanner;

public class Exercise_18 {
	public class Exercises_06_18 {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        System.out.println("Enter a password: ");
	        String password = input.next();
	        isPasswordValid(password);
	    }
	    public static void isPasswordValid(String password) {
	        int digitCount = 0;
	        boolean isValid = true;
	        for (int i = 0; i < password.length(); i++) {
	            if (Character.isDigit(password.charAt(i))) {
	                digitCount++;
	            }
	            if ((password.length() >= 8) && (digitCount >= 2) &&
	                    (Character.isLetter(password.charAt(i)) || Character.isDigit(password.charAt(i)))) {
	                isValid = true;
	            }
	            else
	                isValid = false;

	        }
	        if (isValid)
	            System.out.println("Valid Password");
	        else
	            System.out.println("Invalid Password");

	    }
	}
}
