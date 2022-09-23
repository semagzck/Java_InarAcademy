package Chapters.chapter_05;

public class Exercise_19 {

	public static void main(String[] args) {

	    for (int i = 0; i < 8; i++) {
	        for (int j = 7 - i; j > 0; j--) {
	            System.out.printf("%4s", "");
	        }
	        for (int k = 0; k <= i; k++){
	            System.out.printf("%4d", (int)(Math.pow(2, k)));
	        }
	        for (int l = i - 1 ; l >= 0; l--) {
	            System.out.printf("%4d", (int)(Math.pow(2, l)));
	        }
	        System.out.println();
	    }
	}
}
