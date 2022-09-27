package chapter_06;

public class Exercise_03 {
    Scanner in =new Scanner(System.in);
	System.out.print("Enter digits: ");
    iSnt digits = in.nextInt();
		System.out.println("The sum is " + sumDigits(digits));

		System.out.println(reverse(456));
	   System.out.println("Is 456 a pal? " + isPalindrome(456));
       System.out.println("Is 2002 a pal? " + isPalindrome(2002));
		System.out.print("Enter a number to reverse (3456): ");
		System.out.println(reverse(in.nextInt()));
}



