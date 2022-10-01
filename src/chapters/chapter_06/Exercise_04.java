
	package chapter_06;
	import java.util.Scanner;

	public class Exercise_04 {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        System.out.print("Bir sayi giriniz: ");
	        int number = input.nextInt();
	        System.out.print("Girdiğiniz sayinin tersten yazilisi = ");
	        reverse (number);
	        
	        }
	        public static void reverse(int number) {
	            while (number > 0) {
	                System.out.print(number % 10);
	                number /= 10;
	            }

	        }

	}



