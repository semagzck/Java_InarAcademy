package weeks.week_10;

public class FindTheRowWithMaxSum {
	 public static void main(String[] args) {
	        int[][]arr = TwoDimensionalArray.getEmpty2DArrayFromUser();
	        TwoDimensionalArray.fill2DArrWithRandomValues(arr,0,10);
	        int rowIndex = getTheRowIndexWithMaxSum(arr);
	        TwoDimensionalArray.printArr(arr);
	        System.out.printf("The row with the max sum is - row number %d", (rowIndex + 1));
	    }

	    public static int getTheRowIndexWithMaxSum(int[][] arr){
	        int i = -1;
	        int max = Integer.MIN_VALUE;
	        for (int row = 0; row < arr.length; row++) {
	            int sumOfRow = getSumOfGivenRow(arr[row]);
	            if(sumOfRow >= max){
	                i = row;
	                max = sumOfRow;
	            }
	        }
	        return i;
	    }

	    private static int getSumOfGivenRow(int[] cols) {
	        int sum = 0;
	        for (int num: cols) {
	            sum += num;
	        }
	        return sum;
	    }
}
