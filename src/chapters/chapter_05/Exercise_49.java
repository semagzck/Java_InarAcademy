package Chapters.chapter_05;

import java.util.Scanner;

public class Exercise_49{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter a line :");
        String line= input.nextLine();
        line=line.toUpperCase();
        int length=line.length();
        int countWovel=0;
        int countConsonant=0;
        for(int i=0;i<length;i++){
            char ch=line.charAt(i);
            if(ch>='A'&&ch<='Z') {
                if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'U' || ch == 'O') {
                    countWovel++;
                } else {
                    countConsonant++;
                }
            }

        }
        System.out.println("the number of wowel is "+countWovel);
        System.out.println("the number of consonant is "+countConsonant);

    }

}



