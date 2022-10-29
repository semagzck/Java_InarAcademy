package chapters.chapter_08;
import java.util.Scanner;
public class Exercise_21 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter number of cities:");

         double[][]points=new double[input.nextInt()][2];
         getPoints(points);
       
        double minDistance=Double.MAX_VALUE;
        double index1=0;
        double index2=0;
        for (int i = 0; i < points.length ; i++) {
            
            
            double distance=distance(points[i][0],points[i][1],points);

            if (distance< minDistance){
                index1=points[i][0];
                index2=points[i][1];
                minDistance=distance;
            }

        }
       
        System.out.println("the center city location is "+"( "+index1+" ,"+index2+" )");
        System.out.printf("the total distance is %.2f ", minDistance);
    }

        public static double distance(double p1,double p2,double[][]points){
        double distance=0;
        for (int i = 0; i < points.length ; i++) {
            distance+=Math.sqrt(Math.pow(points[i][0]-p1,2)+Math.pow(points[i][1]-p2,2));
        }
        return distance;

    }
    
        public static void getPoints(double[][]points){
        Scanner input=new Scanner(System.in);
        System.out.println("enter coordinates of cities:");

        for (int row = 0; row <points.length ; row++) {
            for (int col = 0; col <points[row].length ; col++) {
                points[row][col]=input.nextDouble();
            }
        }
    }

}

