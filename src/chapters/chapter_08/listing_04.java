package chapters.chapter_08;
import java.util.Scanner;

public class listing_04 {
    public static void main(String[] args) {
        int[][] grid = readSolution();

        System.out.println(isValid(grid) ? "Valid solution" : "Invalid solution");

    }

    public static int[][] readSolution() {
        Scanner input = new Scanner(System.in);

        int[][] grid = new int[9][9];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                grid[i][j] = input.nextInt();
            }
        }
        return grid;
    }

    public static boolean isValid(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] < 1 || grid[i][j] > 9 || !isValid(i, j, grid)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isValid(int i, int j, int[][] grid) {
        // Check whether grid[i][j] is unique in i's row
        for (int column = 0; column < 9; column++) {
            if (column != j && grid[i][column] == grid[i][j])
                return false;
        }
        for (int row = 0; row < 9; row++) {
            if (row != i && grid[row][j] == grid[i][j]) {
                return false;
            }
        }

        for (int row = (i / 3) * 3; row < (i / 3) * 3 + 3; row++) {
            for (int column = (j / 3) * 3; column < (j / 3) * 3 + 3; column++) {
                if (row != i && column != j && grid[row][column] == grid[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}


