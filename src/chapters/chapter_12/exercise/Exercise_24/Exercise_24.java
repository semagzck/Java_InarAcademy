package chapters.chapter_12.exercise;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
public class Exercise_24 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\Sys\\Desktop\\ders falan\\Exercise12_15.txt");
        final int NUMBER_OF_DATA_LINES=1000;

        if (!file.exists()) {
            System.out.println(file + " is not found");
            System.exit(0);
        }
        String s1="";
        try (
                PrintWriter printWriter=new PrintWriter(file);
        ){
            for(int i=0;i<NUMBER_OF_DATA_LINES;i++){
                s1="FIRSTNAME"+i+" LASTNAME"+i+" "+getRank()+" ";
                printWriter.print(s1);
                printWriter.printf("%.2f\n",getSalary(getRank()));
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Complete!!!");
    }

    private static String getRank() {
        int randomRank = (int) ( Math.random() * 3);
        String rank ="";
        switch (randomRank) {
            case 0:
                rank = "assistant";
                break;
            case 1:
                rank = "associate";
                break;
            case 2:
                rank = "full";
                break;
        }
        return rank;

    }
    private static double getSalary(String rank) {
        double salary = 0.0;
        switch (rank) {
            case "assistant":
                salary = 50000 + Math.random() * 30000;
                break;
            case "associate":
                salary = 60000 + Math.random() * 50000;
                break;
            case "full":
                salary = 75000 + Math.random() * 55000;
                break;
        }
        return salary;
    }

}

