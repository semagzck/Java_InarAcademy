package chapter_07;

import java.util.Scanner;

public class Exercise_19 {
	public static void main(String[] args) {
        // 42 5 8 96 31 475 16 45
        //15 23 35 46 58 67
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the list: ");
        int size = input.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        displayArrayWhetherSorted(arr);
    }

    public static void displayArrayWhetherSorted(int[] arr) {
        if(isTheArraySortedFromSmallerToGreater(arr) || isTheArraySortedFromGreaterToSmaller(arr)){
            System.out.println("The list is already sorted.");
        }else{
            System.out.println("The list is not sorted.");
        }
    }
    //100 90 80 70
    public static boolean isTheArraySortedFromGreaterToSmaller(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]){
                return false;
            }
        }
        return true;
    }

    // 42 5 8 96 31 475 16 45
    // 15 23 13 46 58 67
    public static boolean isTheArraySortedFromSmallerToGreater(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]){
                return false;
            }
        }
        return true;
    }
}


