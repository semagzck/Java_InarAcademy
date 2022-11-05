package chapters.chapter_09;
import java.util.Scanner;
public class LocationTest {
    public static void main(String[] args) {
        Location location = new Location(0,0,0);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter row number: ");
        int row = input.nextInt();
        System.out.println("Enter column number: ");
        int column = input.nextInt();
        double[][] matrix = new double[row][column];


        System.out.println("Enter matrix elements: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }
        location = locateLargest(matrix);
        System.out.println("Row: "+location.getRow()+"\nColumn: "+location.getColumn()+"\nMaximum Value: "+location.getMaxValue()
);

    }

    public static Location locateLargest(double[][] a) {
        int row = -1;
        int column = -1;
        double maxValue = Double.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (maxValue < a[i][j]) {
                    maxValue = a[i][j];
                    row = i;
                    column = j;
                }
            }
        }
        return new Location(row,column,maxValue);
    }
}



