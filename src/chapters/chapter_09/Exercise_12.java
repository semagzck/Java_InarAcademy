package chapters.chapter_09;
import java.util.Scanner;

public class Exercise_12{
    public static void main(String[] args) {

    double[][] points = getFromUser();

    double a = points[0][1] - points[1][1];
    double b = -1 * (points[0][0] - points[1][0]);
    double c = points[2][1] - points[3][1];
    double d = -1 * (points[2][0] - points[3][0]);
    double e = (a * points[0][0]) + (b * points[0][1]);
    double f = (c * points[2][0]) + (d * points[2][1]);

    LinearEquation equation = new LinearEquation(a, b, c, d, e, f);

    displayTheIntersectingPoints(equation);

}

        public static void displayTheIntersectingPoints(LinearEquation equation) {
            if (equation.isSolvable()){
                System.out.printf("The intersecting point is at (%.5f, %.5f)", equation.getX(), equation.getY());

            }else
                System.out.println("The equation has no roots! Two lines are parallel");

        }

        public static double[][] getFromUser() {
            double[][] points = new double[4][2];
            Scanner input = new Scanner(System.in);

            System.out.println("Enter the points: ");


            for (int p = 0; p < points.length; p++) {
                points[p][0] = input.nextDouble();
                points[p][1] = input.nextDouble();
            }

            return points;
        }
}
 
