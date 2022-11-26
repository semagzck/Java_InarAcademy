package chapters.chapter_11.exercise;
import java.util.ArrayList;
import java.util.Scanner;
public class Exercise_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the array size n: ");
        int size = input.nextInt();
        int[][] matrix = new int[size][size];
        fillMatrix(matrix);
        printMatrix(matrix);

        ArrayList<Integer> sumOfRow = new ArrayList<>();
        ArrayList<Integer> sumOfColumn = new ArrayList<>();
        sumRow(matrix, sumOfRow);
        sumColumn(matrix, sumOfColumn);

        System.out.println("\nRow sums: " + sumOfRow.toString());
        System.out.println("Column sums: " + sumOfColumn.toString());
        int maxRowValue = maxValueIndex(sumOfRow);
        int maxColValue = maxValueIndex(sumOfColumn);

        System.out.print("The largest row index is: "+maxRowValue);
        System.out.print("\nThe largest column index is: "+maxColValue);

    }
    private static void fillMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 2);
            }
        }
    }

    private static void sumRow(int[][] matrix, ArrayList<Integer> sumOfRow) {
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
            sumOfRow.add(i, sum);
        }
    }
    private static void sumColumn(int[][] matrix, ArrayList<Integer> sumOfColumn) {
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[j][i];
            }
            sumOfColumn.add(i, sum);
        }
    }
    private static int maxValueIndex(ArrayList<Integer> number) {
        Integer max = number.get(0);
        int maxIndex=0;
        for (int i = 0; i < number.size(); i++) {
            if (max < number.get(i)) {
                maxIndex=i;
            }
        }
        return maxIndex;
    }
    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
