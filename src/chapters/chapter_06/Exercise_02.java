package chapter_06;

import java.util.Scanner;

public class Exercise_02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = input.nextInt();
        System.out.println("The sum of the digits of integer " + number + " is " + sumDigits(number));
    }

    public static int sumDigits(long n) {
        int sumOfDigits = 0;
        long remainingDigits = n;
        while (remainingDigits != 0) {
            sumOfDigits += remainingDigits % 10;
            remainingDigits /= 10;
        }
        return sumOfDigits;
    }
}


