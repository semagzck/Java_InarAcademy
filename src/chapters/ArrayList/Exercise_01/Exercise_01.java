package chapters.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_01 {
    private static Scanner input=new Scanner(System.in);
    private static ArrayList<Double> notes=new ArrayList<>();

    public static void main(String[] args) {
        getScore();
        findScoreDistribution( findAverage());
    }

    private static void getScore() {
        double scores;
        System.out.println("Enter scores:(to finish enter negative value) ");
        do{
            scores=input.nextDouble();
            if(scores>=0) {
                notes.add(scores);
            }
        }while (scores>=0);

    }
    private static double findAverage() {
        double sum=0;
        for(int i=0;i<notes.size();i++){
            sum+=notes.get(i);
        }
        return sum/notes.size();
    }
    private static void findScoreDistribution(double average) {
        int belowCounter=0;
        int equalCounter=0;
        int aboveCounter=0;
        for(int i=0;i<notes.size();i++){
            if(notes.get(i)>average){
                aboveCounter++;
            } else if (notes.get(i)==average) {
                equalCounter++;
            }else {
                belowCounter++;
            }
        }
        System.out.println("Average: "+average);
        System.out.println("Below average scores: "+belowCounter+"\nEqual average counter: "+equalCounter+
                "\nAbove average counter: "+aboveCounter);
    }

}

