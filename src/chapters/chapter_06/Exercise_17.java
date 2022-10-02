package chapter_06;

import java.util.Scanner;

public class Exercise_17 {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter n value: ");
        int n = input.nextInt();
        printMatrix(n);
    }
    public static void printMatrix(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print((int)(Math.random() * 2) + "  ");

            }
            System.out.println();
        }
    }

}
