package chapters.chapter_08;
import java.util.Scanner;

public class Exercise_26 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
    double[][]matrix=new double[3][3];
        System.out.println("enter matrix");

        for (int i = 0; i <3 ; i++) {
        for (int j = 0; j < 3; j++) {
            matrix[i][j] = input.nextDouble();
        }
    }
        for (int i = 0; i <3 ; i++) {
        for (int j = 0; j <3 ; j++) {
            System.out.print(matrix[i][j]+" ");
        }
        System.out.println();
    }
        sortRows(matrix);

        System.out.println("  ");
        for (int i = 0; i <3 ; i++) {
        for (int j = 0; j <3 ; j++) {
            System.out.print(matrix[i][j]+" ");
        }
        System.out.println();
    }


}
  public static void sortRows(double[][] arr){
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                double min0=arr[i][j];
                int index=j;

                for (int k = j+1; k <arr[i].length ; k++) {
                    if (arr[i][k]<min0){
                        min0=arr[i][k];
                        index=k;
                    }
                }
                if (index!=j){
                    arr[i][index]=arr[i][j];
                    arr[i][j]=min0;
                }
            }
        }
    }
}

