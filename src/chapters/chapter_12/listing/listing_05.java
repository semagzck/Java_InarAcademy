package chapters.chapter_12.listing;

import java.util.InputMismatchException;
import java.util.Scanner;
public class listing_05 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        boolean continueInput=true;
        do {
            try{
                System.out.println("enter an integer: ");
                int number= input.nextInt();
                System.out.println("The number entered is "+number);
                continueInput=false;
            }
            catch (InputMismatchException e){
                System.out.println("Try again. (Incorrect input: an integer is required)");
                input.nextLine();
            }

        }while (continueInput);
    }
}

