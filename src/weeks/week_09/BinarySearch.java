package weeks.week_09;
import java.util.Arrays;
import java.util.Scanner;
public class BinarySearch {
	 public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
//	        int[] arr = new int[100];
//	        fillArrWithLinearValues(arr,100,200);
	        int[] arr = new int[20];
	        fillArrWithRandomValues(arr, 0, 50);
	        Arrays.sort(arr);
	        printArr(arr);
	        System.out.println("Please enter the number you want to find");
	        int num = input.nextInt();
	        int index = getTheIndexWithBinarySearch(arr,num);
	        System.out.printf("The number %d is in index [%d]",num,index);

	    }

	    public static void printArr(int[] arr) {
	        System.out.print("[");
	        for (int i = 0; i <arr.length ; i++) {
	            System.out.printf("(%d) %d, ", i,arr[i]);
	        }
	        System.out.println("]");
	    }


	    //50,75,60,62,68,72,70,71
	    //50,75,68,72,70,71

	    /**
	     *   ilk tahmin yaparken 100 - 200
	     *   mid = (start + end) / 2        150
	     *    1) num < mid
	     *
	     *    2) num > mid
	     *    3) num == mid
	     */


	    private static int getTheIndexWithBinarySearch(int[] arr, int num) {
	        //indexes
	        int start = 0;
	        int end = arr.length - 1;
	        int counter = 0;
	        while (start <= end) {
	            counter++;
	            int mid = start + ((end - start) / 2);
	            if (num < arr[mid]) {
	                end = mid - 1;
	            } else if (num > arr[mid]) {
	                start = mid + 1;
	            } else {
	                System.out.println("COUNTER :" + counter);
	                return mid;
	            }
	        }
	        System.out.println("COUNTER :" + counter);
	        return -1;
	    }

	    public static void fillArrWithLinearValues(int[] arr, int start, int end) {
	        for (int i = 0; i < arr.length; i++) {
	            arr[i] = start + i;
	        }

	    }

	    public static int getTheIndex(int[] arr, int num) {
	        for (int i = 0; i < arr.length; i++) {
	            if(arr[i] == num){
	                return i;
	            }
	        }
	        return -1;
	    }

	    public static void fillArrWithRandomValues(int[] arr, int start, int limit) {
	        for (int i = 0; i < arr.length; i++) {
	            int num = start + (int)(Math.random()* (limit -start));
	            arr[i] = num;
	        }
	    }

	    public void nonStaticMethod(){}
	}
