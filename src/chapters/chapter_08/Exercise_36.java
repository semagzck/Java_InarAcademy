package chapters.chapter_08;
import java.util.Scanner;

public class Exercise_36 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter n number: ");
        int n = input.nextInt();
        char[][] m = new char[n][n];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = input.next().charAt(0);
            }
        }
        System.out.println(checkLatinSquare(m));

    }

    public static boolean checkLatinSquare(char[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {

                if (!isValidLetter(m[i][j], m.length)) {
                    System.out.println("Invalid letters...");
                    System.out.println("n = " + m.length +
                            " your letter range is " + 'A' + "-" +(char)('A' + m.length - 1));
                    return false;
                }
            }
        }
        for (int i = 0; i < m.length; i++) {
            if (!isRowValid(m, i)) return false;
        }
        for (int j = 0; j < m[0].length; j++) {
            if (!isColumnValid(m,j)) return false;
        }

        return true;
    }
    public static boolean isColumnValid(char[][] m, int column) {

        boolean[] hasBeenUsed = new boolean[m.length];

        for (int i = 0; i < m.length; i++) {

            int index = m[i][column] - 'A';

            if (hasBeenUsed[index]) {
                return false;
            } else {
                hasBeenUsed[index] = true;
            }
        }

        return true;
    }
    public static boolean isRowValid(char[][] m, int row) {

        boolean[] hasBeenUsed = new boolean[m.length];

        for (int j = 0; j < m[row].length; j++) {

            int index = m[row][j] - 'A';

            if (hasBeenUsed[index]) {
                return false;
            } else {
                hasBeenUsed[index] = true;
            }
        }

        return true;
    }

    public static void displayMatrix(char[][] m) {

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static boolean isValidLetter(char ch, int n) {
        n--;
        return (ch >= 'A' && ch <= 'A' + n);
    }



}

