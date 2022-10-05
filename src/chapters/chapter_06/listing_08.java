package chapter_06;

import java.util.Scanner;

public class listing_08 {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a hex number: ");
        String hex = input.nextLine();

        System.out.println("The decimal value for the hex number " + hex + " is " + hexToDecimal(hex.toUpperCase()));
        
    }

    public static int hexToDecimal(String hex) {
        int decimalValue = 0;
        for (int i = 0, j = hex.length() - 1; i < hex.length() && j >= 0; i++, j--) {
            char hexChar = hex.charAt(i);
            decimalValue += hexCharToDecimal(hexChar) * Math.pow(16,j);
        }
        return decimalValue;

    }

    public static int hexCharToDecimal(char ch) {
        if (ch >= 'A' && ch <= 'F') {
            return ch - 'A' + 10;
        }
        else 
        return ch - '0';
    }


}

