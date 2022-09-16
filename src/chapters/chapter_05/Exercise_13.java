package Chapters.chapter_05;
import java.util.Scanner;

public class Exercise_13 {

	public static void main(String[] args) {
		int target = 0;
		while(true){
			if(Math.pow(++target, 3) > 12000) break;
		}
		System.out.print(--target);
	}

}

