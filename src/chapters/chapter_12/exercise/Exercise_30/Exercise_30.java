package chapters.chapter_12.exercise;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Exercise_30 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a file name: ");
        File file = new File(input.nextLine());

        if (!file.exists()) {
            System.out.println("There is no such file!");
        }

        int[] counts = new int[240];

        try (
                Scanner input2 = new Scanner(file)
        ) {
            while (input2.hasNext()) {
                String s = input2.nextLine().toUpperCase();
                for (int i = 0; i < s.length(); i++) {
                    if (Character.isLetter(s.charAt(i))) {
                        counts[s.charAt(i) - 'A']++;
                    }
                }
            }
        }
        for (int i = 0; i < 26; i++) {
            System.out.println("Number of " + (char)('A' + i) + "'s: " + counts[i]);
        }
    }
}

