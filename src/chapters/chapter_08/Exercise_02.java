package chapters.chapter_08;
import java.util.Scanner;

public class Exercise_02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter 4 x 4 matrix: ");
        double[][] matrix = new double[4][4];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextDouble();

            }
        }


        System.out.println("the biggest diagonal is: " + sumMajorDiagonal(matrix));

    }

    public static double sumMajorDiagonal(double[][] matrix) {
        double total = 0;
        for (int i = 0; i < matrix.length; i++) {
            total += matrix[i][i];
        }


        return total;


    }

