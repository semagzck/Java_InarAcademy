package chapters.chapter_08;
import java.util.Scanner;
public class Exercise_18 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the row number of array: ");
        int row= input.nextInt();
        System.out.println("Enter the column  number of array");
        int column= input.nextInt();

        int[][] pointsArray=new int[row][column];
        pointsArray=getPointsArray(input,pointsArray);
        System.out.println("Entered array is: ");
        printArray(pointsArray);
        shuffle(pointsArray);

    }
    public static int[][] getPointsArray(Scanner input,int[][] pointsArray) {
        System.out.println("enter array elements: ");
        for (int i = 0; i < pointsArray.length; i++) {
            pointsArray[i][0] = input.nextInt();
            pointsArray[i][1] = input.nextInt();
        }
        return pointsArray;
    }
    public static void shuffle(int[][] m){
        for(int row=0;row< m.length;row++){
            int  column=0;// because just shuffle row
            int shuffleRowIndex=(int)(Math.random()*m.length);
            int temp=m[row][column];
            m[row][column]=m[shuffleRowIndex][column];
            m[shuffleRowIndex][column]=temp;

        }
        System.out.println("Row shuffled array is: ");
        printArray(m);

    }
    public static void printArray(int[][] array) {
        for(int row=0;row< array.length;row++){
            for (int column=0;column<array[row].length;column++){
                System.out.print(array[row][column]+" ");
            }
            System.out.println();
        }

    }

}

