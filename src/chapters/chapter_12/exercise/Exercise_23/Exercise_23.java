package chapters.chapter_12.exercise;

import java.net.URL;
import java.util.Scanner;

public class Exercise_23 {

    public static void main(String[] args) throws Exception{
        double sum = 0;
        int numberOfScore = 0;
        URL url = new URL("http://cs.armstrong.edu/liang/data/Scores.txt");
        try (
                Scanner input = new Scanner(url.openStream())
        ){
            while (input.hasNext()){
                sum += Double.parseDouble(input.next());
                numberOfScore++;
            }
        }
        System.out.println("Average is: " + (sum /numberOfScore)
                + "\nTotal is: " +sum);
    }
}

