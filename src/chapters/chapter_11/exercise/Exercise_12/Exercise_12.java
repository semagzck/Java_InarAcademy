package chapters.chapter_11.exercise;
import java.util.ArrayList;
import java.util.Scanner;
public class Exercise_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Double> numbers = new ArrayList<>();
        final int NUMBER_OF_NUMBERS = 5;
        System.out.println("Enter " + NUMBER_OF_NUMBERS + " numbers:");
        for (int i = 0; i < NUMBER_OF_NUMBERS; i++) {
            numbers.add(input.nextDouble());
        }
        System.out.println("Sum of given numbers is " + sum(numbers));

    }

    public static double sum(ArrayList<Double> list) {
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }
}
