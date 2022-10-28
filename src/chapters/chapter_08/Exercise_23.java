package chapters.chapter_08;
import java.util.Scanner;

public class Exercise_23 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter matrix: ");
        int [][]matrix=new int[6][6];
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j <matrix[i].length ; j++) {
                matrix[i][j]=(int) (Math.random()*2);
            }
        }

        for (int i = 0; i <6 ; i++) {
            for (int j = 0; j <6 ; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        

        int m1=0; //tempi unutma
        int m2=0;

        for (int i = 0; i < matrix.length ; i++) {

            int count=0;
            for (int j = 0; j <6 ; j++) {
                if (matrix[i][j]==1)
                    count++;
            }
            if (count%2!=0) {
                m1 = i;
                break;

            }

        }

        for (int i = 0; i < matrix[0].length ; i++) {

            int count=0;
            for (int j = 0; j < matrix.length ; j++) {
                if (matrix[j][i]==1)
                    count++;
            }
            if (count%2!=0) {
                m2 = i;
                break;
            }

        }

        System.out.println("the flipped cell is "+m1+" , "+m2);
        
    }
}


