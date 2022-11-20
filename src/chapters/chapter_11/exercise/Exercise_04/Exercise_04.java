package chapters.chapter_11.exercise;
import java.util.ArrayList;
import java.util.Scanner;
public class Exercise_04 {
        public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    ArrayList<Integer> numbers = new ArrayList<>();
    System.out.println("Enter a numbers which you want to find its maximum(Enter 0 to finish): ");
    int temp;
    do {
        temp = input.nextInt();
        if (temp != 0) {
            numbers.add(temp);
        }
    } while (temp != 0);
    System.out.println("The maximum of given number is "+maximumOfNumber(numbers));
}
        public static Integer maximumOfNumber(ArrayList<Integer> list) {

            if (list == null || list.isEmpty()) {
                return null;
            }
            int max = list.get(0);
            for (int i : list) {
                if (i > max) {
                    max = i;
                }
            }
            return max;
        }
}



