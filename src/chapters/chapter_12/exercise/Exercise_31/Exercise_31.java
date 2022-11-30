
package chapters.chapter_12.exercise;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Exercise_31 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = input.nextInt();
        System.out.println("Enter gender(M/F): ");
        char gender = input.next().charAt(0);
        System.out.println("Enter name: ");
        String name = input.next();

        File file = new File("C:\\Users\\Sys\\Desktop\\ders falan\\a.txt");

        if (!file.exists()) {
            System.out.println(file + " is not found!!!");
            System.exit(0);
        }

        try (

                Scanner out = new Scanner(file);
        ) {

            while (out.hasNext()) {
                int rank = out.nextInt();
                String maleName = out.next();
                double maleBirthRate = out.nextDouble();
                String femaleName = out.next();
                double femaleBirthRate = out.nextDouble();

                if (maleName.equals(name)) {
                    System.out.println(name + " is ranked #" + rank + " in year " + year);
                    break;
                }

                if (femaleName.equals(name)) {
                    System.out.println(name + " is ranked #" + rank + " in year " + year);
                    break;
                }

            }
        }
    }
}

