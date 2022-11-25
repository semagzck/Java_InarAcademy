package chapters.chapter_12.exercise;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_12 {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("C:\\Users\\Sema\\Desktop\\jAVA CHAPTER\\Exercise_12.java");
        ArrayList<String> list=new ArrayList<>();

        if (!file.exists()) {
            System.out.println(file + " is not found!!!");
            System.exit(0);
        }
        try {
            Scanner input = new Scanner(file);
            while (input.hasNextLine()){
                String line=input.nextLine();
                list.add(line);
            }
            for(int i=1;i<list.size();i++){
                String s=list.get(i);
                if(s.contains("{")){
                    s.replace('{',' ');
                    String s1=list.get(i-1);
                    s1=s1+"{";
                    list.remove(i);
                    list.set(i-1,s1);
                }
            }
            PrintWriter writer = new PrintWriter(file);

            for (String line : list) {
                writer.println(line);
            }
            writer.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Finish");
    }


}

