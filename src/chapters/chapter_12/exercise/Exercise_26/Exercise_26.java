package chapters.chapter_12.exercise;

import java.io.File;
import java.util.Scanner;

public class Exercise_26 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a directory name: ");

        File directory = new File(input.nextLine());

        if (directory.exists()) {
            System.out.println("The directory already exists");
        }
        if (directory.mkdir()) {
            System.out.println("Directory created successfully");
        }
    }
}

