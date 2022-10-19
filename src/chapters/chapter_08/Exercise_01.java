package chapters.chapter_08;
import java.util.Scanner;

public class Exercise_01 {
    /*
    	1.5 2 3 4
		5.5 6 7 8
		9.5 1 3 1
    	 */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a 3-by-4 matrix row by row: ");

        double[][] matrix = new double[3][4];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                matrix1[i][j] = in.nextDouble();
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < matrix.length; j++) {
                total += matrix[j][i];
            }
            System.out.println("the column " + i + " 's sum is " + total);
        }
    }
}
