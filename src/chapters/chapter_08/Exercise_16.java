package chapters.chapter_08;
import java.util.Scanner;
public class Exercise_16 {
    public static void main(String[] args) {
        int[][] array = {{4, 2}, {1, 7}, {4, 5}, {1, 2}, {1, 1}, {4, 1}};
        array=sortRow(array);
        printSortedArray(array);



    }
    public static int [][] sortRow(int[][] array){
        int [][]m1=new int [1][2];
        for(int i=0;i< array.length;i++){
            for (int j=0;j< array.length;j++){
                if(array[i][0]<array[j][0]){
                    m1[0][0]=array[i][0];
                    m1[0][1]=array[i][1];
                    array[i][0]=array[j][0];
                    array[i][1]=array[j][1];
                    array[j][0]= m1[0][0];
                    array[j][1]=m1[0][1];
                }
            }
        }
        return array;
    }
    public static int [][] sortColumn(int[][] array){
        int [][]m1=new int [1][2];
        for(int i=0;i< array.length;i++){
            for (int j=0;j< array.length;j++) {
                if ((array[i][0] == array[j][0])/* TODO &&()*/) {
                }
            }

        }
        return array;
    }


    public static void sort(int[][] m) {
        int index;
        int[] temp;

        for (int i = 0; i < m.length - 1; i++) {
            index = i;

            for (int j = i + 1; j < m.length; j++) {
                if (m[j][0] < m[index][0]) {
                    index = j;
                } else if (m[j][0] == m[index][0]) {
                    if (m[j][1] < m[i][1]) {
                        index = j;
                    }
                }
            }

        }
    }


    public static void printSortedArray(int[][] array) {
        for(int row=0;row< array.length;row++){
            for (int column=0;column<array[row].length;column++){
                System.out.print(array[row][column]+" ");
            }
            System.out.println();
        }

    }
}



