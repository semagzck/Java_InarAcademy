package chapters.chapter_07;

import java.util.Scanner;
public class Exercise_17 {
    // Sort students
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of students :");
        int studentsNumber= input.nextInt();
        String [] studentsName=new String[studentsNumber];
        int [] studentsScore= new int[studentsNumber];

        for(int i=0;i<studentsNumber;i++){
            System.out.println("Enter "+(i+1)+". students score and name:");
            studentsScore[i]=input.nextInt();
            studentsName[i]= input.nextLine();
        }
        int [] sortedStudentsScore=SortingScore(studentsScore);
        String [] sortedStudentsName=SortingName(studentsScore,studentsName);
        for(int i=0;i<studentsScore.length;i++){
            System.out.println(sortedStudentsName[i]+" " +sortedStudentsScore[i]);
        }
    }

    public static int [] SortingScore(int []studentsScore){
        // Selection Sorting Algorithm
        for(int i=0;i<studentsScore.length;i++){
            for(int j=0;j< studentsScore.length;j++){
                if(studentsScore[i]>studentsScore[j]){
                    int temp=studentsScore[i];
                    studentsScore[i]=studentsScore[j];
                    studentsScore[j]=temp;

                }
            }
        }
        return studentsScore;
    }
    private static String[] SortingName(int[] studentsScore, String[] studentsName) {
        for(int i=0;i<studentsScore.length;i++){
            for(int j=0;j< studentsScore.length;j++){
                if(studentsScore[i]>studentsScore[j]){
                    int tempNum=studentsScore[i];
                    String tempName=studentsName[i];

                    studentsScore[i]=studentsScore[j];
                    studentsName[i]=studentsName[j];

                    studentsScore[j]=tempNum;
                    studentsName[j]=tempName;

                }
            }
        }
        return studentsName;
    }
}



