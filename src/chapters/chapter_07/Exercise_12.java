package chapter_07;
import java.util.Arrays;
import java.util.Scanner;
public class Exercise_12 {
	  public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter ten numbers: ");
	        int[] numbers = new int[10];
	        for (int i = 0; i < numbers.length; i++) {
	            numbers[i] = input.nextInt();
	        }
	        numbers = reverse(numbers);
	        System.out.println("The reversed version of numbers is " + Arrays.toString(numbers));

	    }
	    public static int[] reverse(int[] array) {
	        for (int i = 0, j = array.length - 1; i < array.length / 2; i++, j--) {
	            int temp = array[i];
	            array[i] = array[j];
	            array[j] = temp;
	        }
	        return array;
	    }
	}


