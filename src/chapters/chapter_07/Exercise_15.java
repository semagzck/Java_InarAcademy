package chapter_07;

import java.util.Scanner;

public class Exercise_15 {
	 // test case: 1 2 3 2 1 6 3 4 5 2
    
    // enter ten numbers set it to tenNums[]
    // send to function that returns an array with no duplicates
   //print num ""
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    System.out.print("Enter 10 nums: ");
    int[] tenNums = new int[10];
    for(int i = 0; i < 10; i++) {
        tenNums[i] = input.nextInt();
    }
    
    int[] a = eliminateDuplicates(tenNums);
   
    System.out.print("The distinct numbers are: ");
    for(int i = 0; i < a.length; i++) {
        System.out.print(a[i] + " ");
    }
}

	private static int[] eliminateDuplicates(int[] tenNums) {
		// TODO Auto-generated method stub
		return null;
	}
}
	
