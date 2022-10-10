package chapter_07;

import java.util.Scanner;

public class Exercise_14 {
	 public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter five numbers: ");
	        int[] numbers = new int[5];
	        for (int i = 0; i < numbers.length; i++) {
	            numbers[i] = input.nextInt();

	            System.out.println("gcd of number " + numbers[i] + " is " + gcd(numbers));
	        }

	    }
	    public static int gcd(int... numbers) {
	        int a = 0; // gcd
	        int i = 0;
	        for (int j = numbers[i] - 1; j < numbers[i] / 2; j--, i++) {
	            if (numbers[j] % j == 0) {
	                a = j;
	                break;
	            }
	        }
	        return a;
	    }
	}


