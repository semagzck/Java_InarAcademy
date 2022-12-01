package chapters.chapter_12.exercise;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
public class Exercise_22 {
    public static void main(String[] args) throws FileNotFoundException {
        File file1 = new File("C:\\Users\\Sys\\Desktop\\ders falan\\Exercise_17.txt");
        File file2 = new File("C:\\Users\\Sys\\Desktop\\ders falan\\a.txt");

        if (!file1.exists()) {
            System.out.println(file1 + " is not found");
            System.exit(0);
        }
        if (!file2.exists()) {
            System.out.println(file2 + " is not found");
            System.exit(1);
        }
        ArrayList<String>list=new ArrayList<>();
        String s1="";
        try (
                Scanner input = new Scanner(file1);
        ) {
            while (input.hasNextLine()){
                s1= input.nextLine();
                list.add(s1.replaceAll("System", "ASLAN"));
            }

        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        try (
                PrintWriter output=new PrintWriter(file2)
        ){
            for(int i=0;i<list.size();i++){
                output.println(list.get(i));
            }

        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
        System.out.println("Complete!!!");
    }
}

