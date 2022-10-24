package chapters.chapter_08;
import java.util.*
public class Exercise_22 {
    public static void main(String[] args) {

        int[][] array = new int[6][6];
        fillTheArray(array);
        displayArray(array);

        System.out.println((checkArray(array) ? "Every column and row have even 1's" : "Every column and row does not have even 1's"));

    }

    public static int generateRandomNumber() {
        int number = (int) (Math.random() * 2);
        return number;
    }
    public static void fillTheArray(int[][] array) {
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                array[row][col] = generateRandomNumber();
            }
        }
    }
    public static boolean checkRow(int[][] array) {

        for (int row = 0; row < array.length; row++) {
            int counter = 0;
            for (int col = 0; col < array[row].length; col++) {
                if (array[row][col] == 1) {
                    counter++;
                }
            }
            if (counter % 2 != 0) {
                return false;
            }
        }
        return true;
    }
    public static boolean checkCol(int[][] array) {

        for (int col = 0; col < array[0].length; col++) {
            int counter = 0;
            for (int row = 0; row < array.length; row++) {
                if (array[row][col] == 1) {
                    counter++;
                }
            }
            if (counter % 2 != 0) {
                return false;
            }
        }
        return true;
    }
    public static boolean checkArray(int[][] array) {
        return (checkRow(array) && checkCol(array));
    }
    public static void displayArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }

    }

}

