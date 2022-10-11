package chapter_07;
import java.util.Arrays;
import java.util.Scanner;
public class Exercise_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten number: ");
        int[] numbers = createArrayWithInput();
        int[] distinctNumbers = new int[10];
        int count = 0;

        for (int j = 0; j < count; j++) {
            if (isDistinct(numbers,numbers[j])) {
                distinctNumbers[j] =
                count++;
            }
        }




        displayDistinctNumbers(distinctNumbers,count);


    }

    public static boolean isDistinct(int[] numbers, int n) {
        for (int i = 0; i < numbers.length; i++) {
            if (n == numbers[i]) {
                return false;
            }
        }
        return true;
    }
    public static void displayDistinctNumbers(int[] arr, int count) {
        System.out.println("The number of distinct numbers is " + count);
        for (int i = 0; i < count; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static int[] createArrayWithInput() {
        Scanner input = new Scanner(System.in);
        int[] distinctNumbers = new int[10];
        for (int i = 0; i < 10; i++) {
            int user = input.nextInt();
        }
        return distinctNumbers;
    }
    public static int[] createDistinctNumbers(int[] arr) {
        int[] distinctNumbers = new int[10];
        for (int i = 0; i < 10; i++) {

        }
        return distinctNumbers;
    }
}


