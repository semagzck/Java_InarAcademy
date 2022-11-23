package chapters.chapter_12.exercise;
import java.util.InputMismatchException;
import java.util.Scanner;
public class InputMissMatch {
    public static void main(String[] args) {

        boolean x = true;
        Scanner input = new Scanner(System.in);
        System.out.println("enter 2 integer ");
        do {

             try {
                int a = input.nextInt();
                int b = input.nextInt();
                System.out.println("the sum is " + (a + b));
                x = false;

            } catch (InputMismatchException ex) {
                System.out.println("wrong input try again");
                input.nextLine();
            }

        } while (x);

    }

}

