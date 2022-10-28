package chapters.chapter_08;
import java.util.Scanner;

public class Exercise_25 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double[][]matrix=new double[3][3];
        System.out.println("enter matrix");
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j <matrix[i].length ; j++) {
                matrix[i][j]=input.nextDouble();
            }
        }
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j <matrix[i].length ; j++) {
                System.out.print( matrix[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("  matrix is  "+(is(matrix)?"  Markov" :"not a Markov"));


    }
    public static boolean is(double[][]matrix){
        for (int i = 0; i <matrix[0].length ; i++) {
            int count=0;

            for (int j = 0; j < matrix.length ; j++) {
                if ( matrix[j][i]<0)
                    return false;
                count+=matrix[j][i];
            }

            if (count!=1)
                return  false;
        }

        return true;
    }
}

