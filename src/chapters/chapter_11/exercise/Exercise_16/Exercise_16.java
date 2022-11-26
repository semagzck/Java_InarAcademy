package chapters.chapter_11.exercise;
import java.util.ArrayList;
import java.util.Scanner;
public class Exercise_16 {
    public static void main(String[] args) {
        ArrayList<Integer> answerArray = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        int number1 = (int) (Math.random() * 100);
        int number2 = (int) (Math.random() * 100);

        System.out.println("What is " + number1 + " + " + number2 + "? ");
        int answer = input.nextInt();
        do{

            if (answerArray.contains(answer)) {
                System.out.println("You've already entered " + answer);
                System.out.println("Try again. What is " + number1 + " + " + number2 + "? ");
                answer = input.nextInt();
            } else {
                answerArray.add(answer);
                System.out.println("Wrong answer. Try again. What is " + number1 + " + " + number2 + "? ");
                answer = input.nextInt();
            }
        }
        while (answer != number1 + number2);

        System.out.println("You got it!");
    }
}
