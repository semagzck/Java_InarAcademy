package Chapters.chapter_05;

public class Exercise_25 {

	public static void main(String[] args) {
		double pi0=0;
		int a= 10_000;
		int b= 20_000;
		int c= 100_000;
		for(int i=1;i<=a;i++) {
			double d = Math.pow(-1,i+1 );
			double e = (2*i-1);
			pi0 +=d/e;;
		}
		System.out.println(" pi number for i=10000 ;" + 4*pi0);
		double pi1=0;
		for(int i=1;i<=b;i++) {
			double d=Math.pow(-1,i+1 );
			double e=(2*i-1);
			pi1 += d/e;;
			
		}
		System.out.println("pi number for i=20000 ;" + 4*pi1);
		double pi2 = 0;
		for(int i=1;i <= c; i++) {
			double d=Math.pow(-1,i+1 );
			double e=(2*i-1);
			pi2 +=d/e;;
		}
		System.out.println("pi number for i=100000 ;" + 4*pi2);
		
		
	}
}

