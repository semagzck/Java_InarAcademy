package chapters.chapter_03;

import java.util.Scanner;

public class Exercise_09 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Isbn numara 9 hanesini giriniz:");
	int ısbn_9 = input.nextInt();
	int ısbn;
	int d9= reaming%10;
	int reaming = ısbn_9 / 10;
	int d8 = reaming % 10;
	reaming = reaming /10;
	int d7 = reaming % 10;
	reaming = reaming /10;
	int d6 = reaming % 10;
	reaming = reaming /10;
	int d5 = reaming % 10;
	reaming = reaming /10;
	int d4 = reaming % 10;
	reaming = reaming /10;
	int d3 = reaming % 10;
	reaming = reaming /10;
	int d2 = reaming % 10;
	reaming = reaming /10;
	int d1 = reaming % 10;

		int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 
				+ d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
		if(d10==10) {
		System.out.println("your ISBN number is " + d1 + "" + d2 + "" + d3 + "" + d4 + "" + d5 + "" + d6 + ""
		+ d7 + "" + d8 + "" + d9 + "" + "X");

			}
   else {
		System.out.println("your ISBN number is " + d1 + "" + d2 + "" + d3 + "" + d4 + "" + d5 + "" + d6 + ""
						+ d7 + "" + d8 + "" + d9 + "" + d10);

   }
		}
	}


