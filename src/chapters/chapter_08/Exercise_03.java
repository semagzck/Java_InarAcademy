package chapters.chapter_08;

import java.util.Scanner;

public class Exercise_03 {

    public static void main(String[] args) {
        char[][] answers =
                {{'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                        {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                        {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                        {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                        {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                        {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                        {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                        {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        int[][] correct=answerControl(answers,keys);
        int [][]sortedCorrect=sort(correct);
        printArray(sortedCorrect);

    }

    public static int[][] answerControl(char[][] answers, char[] keys) {
        int [][]correctanswers =new int[answers.length][2];
        for (int i =0; i <answers.length ; i ++){
            int counts= 0;
            for(int j=0; j < answers[i].length ; j ++){

                if(answers[i][j]== keys [j] ){
                    counts ++;



                }
                correctanswers [i][0]=i; //öğrenciyi tutmak için
                correctanswers [i][1]=counts; //doğru sayısını tutmak için
            }

        }
        return correctanswers;
    }

        public static int[][] sort ( int[][] array){

            for(int i=0;i<array.length;i++){
                for(int j=i+1;j<array.length;j++){
                    if(array[i][1]>array[j][1]){
                        int tempStudentIndex=array[i][0];
                        array[i][0]=array[j][0];
                        array[j][0]=tempStudentIndex;

                        int temp=array[i][1];
                        array[i][1]=array[j][1];
                        array[j][1]=temp;
                    }
                }
            }
            return array;
        }
    public static void printArray(int[][] sort) {

        for(int i=0;i< sort.length;i++){

            System.out.println((sort[i][0]+1)+".students has "+sort[i][1]+" correct");


        }
    }


}



