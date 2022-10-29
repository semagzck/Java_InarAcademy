package chapters.chapter_08;
import java.util.Scanner;

public class Exercise_30 {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter a00 vs...");
        double[][] arr1 = new double[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                arr1[i][j] = input.nextDouble();
            }
        }
      
        double[] arr2 = new double[2];

        System.out.println("enter b0 and b1: ");

        arr2[0] = input.nextDouble();
        arr2[1] = input.nextDouble();

        System.out.println("the equation is: ");

        double[] z = linear(arr1, arr2);
        System.out.println(z[0]);
    }
    public static double[] linear(double[][] a, double[] b) {
        if ((a[0][0] * a[1][1]) - (a[0][1] * a[1][0]) == 0) {
            System.out.println("the equatıon has no solution");
            return null;
        }
        double x = (b[0] * a[1][1] - b[1] * a[0][1]) / (a[0][0] * a[1][1] - a[0][1] * a[1][0]);
        double[] p = {x};
        return p;
    }
}
