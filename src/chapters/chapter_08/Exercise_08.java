package chapters.chapter_08;

import java.util.Scanner;
public class Exercise_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of points: ");
        int numberOfPoints = input.nextInt();

        double[][] points = new double[numberOfPoints][2];
        System.out.print("Enter " + numberOfPoints + " points: ");
        for (int i = 0; i < points.length; i++) {
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
        }
        displayClosestPoints(points);
    }
    public static void displayClosestPoints(double[][] points) {
        double shortestDistance = Double.MAX_VALUE;

        for (int i = 0; i < points.length - 1; i++) {
            for (int j = i + 1; j < points.length; j++) {
                double distance = computeDistance(points[i][0], points[i][1], points[j][0], points[j][1]);
                if (shortestDistance > distance) {
                    shortestDistance = distance;
                }
            }
        }
        for (int i = 0; i < points.length - 1; i++) {
            for (int j = i + 1; j < points.length; j++) {
                double distance = computeDistance(points[i][0], points[i][1], points[j][0], points[j][1]);
                if (shortestDistance == distance) {
                    System.out.println("The closest two points are (" + points[i][0] + ", " + points[i][1] + ") and ("
                            + points[j][0] + ", " + points[j][1] + ")");
                }
            }
        }
        System.out.println("Their distance is " + shortestDistance);
    }
    public static double computeDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }


}

