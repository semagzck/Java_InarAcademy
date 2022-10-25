package chapters.chapter_08;
import java.util.Scanner;

public class Exercise_15 {
    public static void main(String[] args) {
        double[][] points = new double[5][2];
        System.out.print("Enter five points(x, y): ");
        fillArrWithInput(points);
        System.out.println("The five points are " + (sameLine(points) ? "" : "not ") + "on the same line.");
    }
    public static void fillArrWithInput(double[][] points) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < points.length; i++) {
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
        }
    }
    public static boolean sameLine(double[][] points) {
        double x0 = points[0][0];
        double y0 = points[0][1];
        double x1 = points[1][0];
        double y1 = points[1][1];

        for (int i = 2; i < points.length; i++) {
            if (!((x1 - x0) * (points[i][1] - y0) -
                    (points[i][0] - x0) * (y1 - y0) == 0)) {
                return false;
            }
        }
        return true;
    }
}
