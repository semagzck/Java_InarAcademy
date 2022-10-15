package weeks.week_10;

public class MatrixSum {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the row and col for the matrix");
        int satir = input.nextInt();//2
        int sutun = input.nextInt();//1
        int[][] arr1 = new int[satir][sutun];
        int[][] arr2 = new int[satir][sutun];

        TwoDimensionalArray.fill2DArrWithRandomValues(arr1,0,10);
        TwoDimensionalArray.fill2DArrWithRandomValues(arr2,0,10);
        int[][] result = new int[satir][sutun];
        sumTwoMatric(arr1,arr2,result);
        TwoDimensionalArray.printArr(arr1);
        TwoDimensionalArray.printArr(arr2);
        TwoDimensionalArray.printArr(result);
    }

    public static void sumTwoMatric(int[][] arr1, int[][] arr2, int[][] result) {
        for (int satir = 0; satir < result.length; satir++) {
            for (int sutun = 0; sutun < result[satir].length; sutun++) {
                result[satir][sutun] = arr1[satir][sutun] + arr2[satir][sutun];
            }
        }
    }

    public static void initiate2DArr(int[][] arr, Scanner input) {
        for (int satir = 0; satir < arr.length; satir++) {
            for (int sutun = 0; sutun < arr[satir].length; sutun++) {
                arr[satir][sutun] = input.nextInt();
            }
        }
    }
}

