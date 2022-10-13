package chapter_07;

import java.util.Scanner;

public class Exercise_34 {
	 public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter a string :");
	        String s1 = input.nextLine();

	        System.out.println(s1);

	        s1 = sort(s1);

	        System.out.println(s1);
	    }

	    public static String sort(String s) {
	        char[] charArray = new char[s.length()];
	        for (int i = 0; i < charArray.length; i++) {
	            charArray[i] = s.charAt(i);
	        }
	        // charArray = { 's' , 'i' , 'n', 'a', 'n'};

	        charArray = sort(charArray);
	        String result = "";
	        for (int i = 0; i < charArray.length; i++) {
	            result += charArray[i];
	        }

	        return result;
	    }

	    public static char[] sort(char[] array) {
	        // a b c d e f g
	        for (int i = 0; i < array.length - 1; i++) {
	            for (int j = i + 1; j < array.length; j++) {
	                if (array[i] > array[j]) {
	                    char temp = array[i];
	                    array[i] = array[j];
	                    array[j] = temp;
	                }
	            }
	        }
	        return array;
	    }
	
}

