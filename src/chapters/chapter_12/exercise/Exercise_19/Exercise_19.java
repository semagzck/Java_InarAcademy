package chapters.chapter_12.exercise;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
public class Exercise_19 {
    public static void main(String[] args) throws Exception {
        try {
            URL url = new URL("https://tr.wikipedia.org/wiki/Lockheed_Martin_F-35_Lightning_II");
            Scanner input = new Scanner(url.openStream());

            String str ="";
            int wordCount = 0;
            while (input.hasNextLine()) {
                str= input.nextLine();
                wordCount+=countWords(str);
            }
            input.close();
            System.out.println("The number of the words in given address: " + wordCount);
        }
        catch (MalformedURLException ex) {
            System.out.println("Invalid URL");
        }
        catch (IOException ex) {
            System.out.println("I/0 Errors: no such file");
        }
    }
    private static int countWords(String str) {
        int count=0;
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)!=' '&&str.charAt(i+1)==' '){
                count ++;
            }
        }
        return count+1;
    }

}

