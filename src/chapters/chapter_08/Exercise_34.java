package chapters.chapter_08;
import java.util.Scanner;

public class Exercise_34 {
    public static void main(String[] args) {
        double[][] points = new double[6][2];
        fillArrWithInput(points);
        double[] result = getRightmostLowestPoint(points);
        System.out.println(" rightmost lowest point is (" + result[0] + " " + result[1] + ")");
    }
    public static void fillArrWithInput(double[][] arr) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter 6 points: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = input.nextDouble();
            }
        }
    }
    public static double[] getRightmostLowestPoint(double[][] arr) {
        sort(arr);

        return arr[0];
    }
    public static void sort(double[][] array) {

        for (int row = 0; row < array.length; row++) {
            double min0 = array[row][0];
            double min1 = array[row][1];
            int index = row;

            for (int i = row + 1; i < array.length; i++) {
                if (array[i][1] < min1 || (array[i][0] > min0 && array[i][1] == min1)) {
                    min0 = array[i][0];
                    min1 = array[i][1];
                    index = i;
                }
            }
            array[index][0] = array[row][0];
            array[index][1] = array[row][1];
            array[row][0] = min0;
            array[row][1] = min1;

        }
    }
