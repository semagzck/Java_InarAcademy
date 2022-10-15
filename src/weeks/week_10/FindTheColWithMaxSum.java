package weeks.week_10;

public class FindTheColWithMaxSum {
	public static void main(String[] args) {
        int[][] arr = TwoDimensionalArray.getEmpty2DArrayFromUser();
        TwoDimensionalArray.fill2DArrWithRandomValues(arr, 0, 10);
        int colIndex = getTheColIndexWithMaxSum(arr);
        TwoDimensionalArray.printArr(arr);
        System.out.printf("The column with the max sum is - col number %d", (colIndex + 1));
    }

    private static int getTheColIndexWithMaxSum(int[][] arr) {
        int maxSum = Integer.MIN_VALUE;
        int maxIndex = -1;
        for (int col = 0; col < arr[0].length; col++) {
            int sum = 0;
            for (int row = 0; row < arr.length; row++) {
                sum += arr[row][col];
            }
            if(sum >= maxSum){
                maxSum = sum;
                maxIndex = col;
            }
        }
        return maxIndex;
    }

}
