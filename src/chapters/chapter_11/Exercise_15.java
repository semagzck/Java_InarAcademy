package chapters.chapter_11.exercise;

import java.util.ArrayList;
import java.util.Scanner;
public class Exercise_15 {
    public static void main(String[] args) {
        ArrayList<MyPoint> points = new ArrayList<MyPoint>();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of points: ");
        int numPoints = input.nextInt();
        System.out.println("Enter the coordinates of the points in the convex polygon(points must be counter clockwise): ");

        for (int i = 0; i < numPoints; i++) {
            points.add(new MyPoint(input.nextDouble(),input.nextDouble()));
        }
        System.out.println("The total area is " + getConvexPolygonArea(points));
    }// -12 0 -8,5 10 0 11,4 5,5 7,8 6 -5,5 0 -7 -3,5 -3,5

    private static double getConvexPolygonArea(ArrayList<MyPoint> points) {

        /*The formula to find the area of a convex polygon is
        A = 1/2( | (x1y2 – x2y1) + (x2y3 – x3y2) + (x3y1 – x1y3) |)(example for 3 points)*/

        double sum1 = 0;// for positive sign
        double sum2 = 0;// for negative sign
        for(int i=0;i<points.size();i++){
            if(i==points.size()-1){
                MyPoint p1=points.get(i);
                MyPoint p2=points.get(0);
                sum1 += (p1.x * p2.y);
                sum2 += (p2.x*p1.y);
            }
            else{
                MyPoint p1=points.get(i);
                MyPoint p2=points.get(i+1);
                sum1 += (p1.x * p2.y);
                sum2 += (p1.y * p2.x);

            }
        }
        return 0.5*(sum1-sum2);

    }


}

