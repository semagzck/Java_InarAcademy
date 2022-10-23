package chapters.chapter_08;
import java.util.Scanner;

public class Exercise_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of row in matrix : ");
        int row = input.nextInt();
        System.out.println("Enter number of column in matrix : ");
        int column = input.nextInt();

        int[][] randomMatrix = createRandomMatrix(row,column);
        display(randomMatrix);
        int[] largestElement = locateLargest(randomMatrix);
        System.out.println("The location of the largest element is at ("+ largestElement[0] + ", " + largestElement[1] + ")");


    }

    public static int[][] createRandomMatrix(int row, int column) {
        int [][] result =  new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                result[i][j] = (int)(Math.random() * 100);
            }
        }
        return result;
    }

    public static void display(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.printf("%3d", array[i][j]);
            }
            System.out.println();
        }
    }

    public static int[] locateLargest(int[][] array) {
        int max = Integer.MIN_VALUE;
        int[] result = new int[2];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if(max < array[i][j]) {
                    max = array[i][j];
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

}

