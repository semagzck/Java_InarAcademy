package chapters.chapter_12.exercise;

import java.util.Scanner;
public class Exercise_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a hex number: ");
        String hex = input.next();


        try {
            System.out.println("The decimal value for hex number " + hex + "  " + hexToDecimal(hex.toUpperCase()));
        }
        catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int hexToDecimal(String hex) throws NumberFormatException {
        int decimalValue = 0;
        for (int i = 0; i < hex.length(); i++) {
            if (!(hex.charAt(i) >= '0' && hex.charAt(i) <= '9') ||
                    !(hex.charAt(i) >= 'A' && hex.charAt(i) <= 'F'))
                throw new NumberFormatException("String is not a hex string");
            char hexChar = hex.charAt(i);
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);{

            }

        }
        return decimalValue;
    }
    public static int hexCharToDecimal(char ch) {
        if (ch >= 'A' && ch <= 'F')
            return 10 + ch - 'A';
        else
            return ch - '0';
    }
}
