package chapter_06;
import java.util.Scanner;

public class Exercise_23 {
	    public static void main(String[] args) {
	        // Occurrences of a specified character
	        Scanner input =new Scanner(System.in);

	        System.out.println("Enter a string ");
	        String str=input.nextLine();
	        str=str.toLowerCase();
	        System.out.println("Enter a character to count.");
	        String character=input.next();

	        char ch=character.charAt(0);
	        int numberOfSpecifiedCharacter=count(str, ch); 
	        System.out.println("In "+str+" consists of "+ numberOfSpecifiedCharacter+" number "+character);

	    }
	    public static int count(String str, char a){
	        int length=str.length();
	        int count=0;
	        for(int i=0;i<length;i++){
	            char ch=str.charAt(i);
	            if(ch==a){
	                count++;
	            }


	        }
	        return count;



	    }

	}


