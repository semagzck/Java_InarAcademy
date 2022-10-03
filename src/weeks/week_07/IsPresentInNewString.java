package weeks.week_07;

import java.util.Scanner;

public class IsPresentInNewString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String s1 = input.nextLine();
        System.out.println("Enter second string: ");
        String s2 = input.nextLine();

        String result = IsPresent(s1, s2);

        System.out.println("Result is " + result);


    }

    public static String IsPresent(String s1, String s2) {
        String result = "";
        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {

                if (s1.charAt(i) == s2.charAt(j)) {
                    break;
                }
                else if (j == s2.length() - 1) {
                    result += s1.charAt(i);


                }


            }
        }
        return result;

    }


}
