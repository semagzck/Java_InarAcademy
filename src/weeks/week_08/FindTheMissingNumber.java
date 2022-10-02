import java.util.Arrays;
import java.util.Scanner;

public class FindTheMissingNumber {

     // Size verilen sayi degerlerinde eksik olan bir sayiyi bulunuz.
     
     
     

    public static void main(String[] args) {
        System.out.println("Please enter the size of the array you want to work with.");
        Scanner input = new Scanner(System.in);
        int arrSize = input.nextInt();
        int[] arr = new int[arrSize];
        getNumbersFromUser(arr);
        int min = getMinNumber(arr);
        int result1 = findTheMissingNumber(arr, min);
        int result2 = findTheMissingNumber2(arr,min);

        System.out.println(Arrays.toString(arr));
        System.out.println("The missing number is --> " + result1);
        System.out.println("----------------");
        System.out.println("The missing number is --> " + result2);
    }
    // 8 9 10
    //
    private static int findTheMissingNumber2(int[] arr, int min) {
        int sum = getSumOfAllTheNumbers(arr);
        int max = min + arr.length;
        int maxSum = max * (max + 1) / 2;
        int minSum = min * (min - 1) / 2;
        int result = maxSum - minSum - sum;
        return result;
    }

    private static int getSumOfAllTheNumbers(int[] arr) {
        int sum = 0;
        for (int num: arr) {
            sum += num;
        }
        return sum;
    }


  
    public static int findTheMissingNumber(int[] arr, int num) {
        int min = num;
        while (num <= min + arr.length) {
            boolean isFound = false;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == num) {
                    isFound = true;
                    break;
                }
            }
            
            if (isFound) {
                num++;
            } else {
                return num;
            }
        }
        return num;
    }

    public static int getMinNumber(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            min = num < min ? num : min;
        }
        return min;
    }

    public static void getNumbersFromUser(int[] arr) {
        System.out.printf("Please enter %d integers:\n", arr.length);
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
    }
}
