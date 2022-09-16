package Chapters.chapter_05;
import java.util.Scanner;
public class Exercise_10 {

	//numbers from 100 to 1000 divisible by 5 && 6 
	//displayed 10 per line with a " " between
	
	public static void main(String[] args) {
		int count = 0;
	for(int num = 100; num < 1001; num++){
			if(num % 5 == 0 && num % 6 == 0){
				System.out.print(num + " ");
				count++;
				if(count % 10 == 0) System.out.println();
		}	
	}
