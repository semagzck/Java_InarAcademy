package chapter_07;
import java.util.Scanner;
public class Exercise_02 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

	int nums[] = new int[10];
	System.out.print("Enter 10 numbers: ");
	
	for(int i = 0; i < 10; i++) {
		nums[i] = in.nextInt();
	}
	System.out.print("\nThe reverse is [");
	for(int i = nums.length - 1; i >=0; i--) {
		System.out.print( i == 0 ? nums[i] + "]" : nums[i] + ", " );
	}
}
}
