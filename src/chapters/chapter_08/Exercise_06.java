package chapters.chapter_08;

import java.util.Scanner;

public class Exercise_06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter 3*3 matrix");
        double[][] m1 = new double[3][3];
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                m1[i][j] = input.nextDouble();

            }
        }
        System.out.println("enter the other 3*3 matrix");
        double[][] m2 = new double[3][3];
        for (int i = 0; i < m2.length; i++) {
            for (int j = 0; j < m2[i].length; j++) {
                m2[i][j] = input.nextDouble();
            }
        }

        double[][] n = multiplayMatrix(m1, m2);
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                System.out.print(n[i][j] + " ");
            }
            System.out.println();
        }
    }
        public static   double[][] multiplayMatrix(double[][] m1, double[][] m2) {
            double[][] n = new double[3][3];
            for (int i = 0; i < n.length; i++) {
                for (int j = 0; j < n[i].length; j++) {
                    //cij= ai1 * b1j + ai2 * b2j + ai3 * b3j
                    n[i][j] = m1[i][0] * m2[0][j] + m1[i][1] * m2[1][j] + m1[i][2] * m2[2][j];
                }
            }

            return n;
        }
}


