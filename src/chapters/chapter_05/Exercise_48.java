package Chapters.chapter_05;

import java.util.Scanner;
public class Exercise_48 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str=input.nextLine();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(i%2==0) {
				System.out.print(ch);
			}
		}

	}


}

