package weeks.week_07;
import java.util.Scanner;

public class isUniqueCharacters {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = input.nextLine();


        if (isUnique(s)) {
            System.out.println(s + " has unique characters.");

        } else
            System.out.println(s + " does not have unique characters.");


    }

    public static boolean isUnique(String s) {
        boolean isUnique;
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {

                if (s.charAt(i) == s.charAt(j)) {
                    return false;
                }

            }
        }

        return true;
    }
}

