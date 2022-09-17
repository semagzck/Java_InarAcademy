package Chapters.chapter_05;

public class Exercise_23 {

	public static void main(String[] args) {
		double sum=0;
		// 1 + 1 / 2 + 1 / 3 + 1 / 4 ....1/n
		for(double i=1;i<=50000;i++) {
			sum=+1/i;
		}
		System.out.println("The results of the summation of the series computing from left to right with n = 50000 : "+sum);
		for(double i=50000;i>=1;i--) {
			sum=+1/i;
		}
		System.out.println("The results of the summation of the series computing from right to left with n = 50000 : "+sum);

	}


	}



