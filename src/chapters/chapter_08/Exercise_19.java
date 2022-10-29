package chapters.chapter_08;
import java.util.Scanner;
public class Exercise_19 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number of row and column");
        int row= input.nextInt();
        int column= input.nextInt();
        int [][] array=new int[row][column];
        array=getArrayElements(array,input);
        if(sameRow(array)||sameColumn(array)||sameRightDiagonal(array)||sameLeftDiagonal(array)){
            System.out.print("Congrulations!!!");
        }else{
            System.out.println("there is no connect four!!!");
        }
    }

    public static int[][] getArrayElements(int[][] array, Scanner input) {
        System.out.println("Enter array elements: ");
        for(int row=0;row< array.length;row++){
            for (int column=0;column<array[row].length;column++){
                array[row][column]= input.nextInt();
            }
        }
        return array;
    }
    private static boolean sameRow(int[][] array) {
        int counter;
        for (int row = 0; row < array.length-3; row++) {
            counter=1;
            for (int column = 0; column < array[row].length-1; column++) {
                if (array[row][column]==array[row][column+1]){
                    counter++;
                }else{
                    counter=1;
                }
                if(counter==4){
                    System.out.println("WINS!!! Same Row!");
                    return true;
                }
            }

        }
        return false;

    }
    private static boolean sameColumn(int[][] array) {
        int counter;
        for (int column = 0; column < array[0].length-3; column++) {
            counter=1;
            for (int row = 0; row < array.length-1; row++) {
                if (array[row][column]==array[row+1][column]){
                    counter++;
                }else{
                    counter=1;
                }
                if(counter==4){

                    System.out.println("WINS!!! Same column");
                    return true;
                }
            }

        }
        return false;

    }
    private static boolean sameRightDiagonal(int[][] array) {
        int counter;
        for (int row = 0; row < array.length - 3; row++) {

            for (int column = 0; column < array[row].length -3 ; column++) {
                counter = 1;
                for (int k = 1; k < 4; k++) {
                    if (array[row][column] == array[row + k][column + k]) {
                        counter++;
                    } else {
                        counter = 1;
                    }
                    if (counter == 4) {
                        System.out.println("WINS!!! Same Right Diagonal ");

                        return true;
                    }
                }

            }
        }
        return false;

    }

    private static boolean sameLeftDiagonal(int[][] array) {
        int counter;
        for (int row = 0; row < array.length-3 ; row++) {

            for (int column =3; column <array[row].length  ; column++) {
                counter = 1;
                for (int k = 1; k < 4; k++) {
                    if (array[row][column] == array[row +k][column - k]) {
                        counter++;
                    } else {
                        counter = 1;
                    }
                    if (counter == 4) {
                        System.out.println("WINS!!! Same Left Diagonal ");

                        return true;
                    }
                }

            }
        }
        return false;

    }

}

