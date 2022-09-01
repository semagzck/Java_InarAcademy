package chapter_03;

public class Toplama {
	package chaper_03;

	import java.util.Scanner;

	public class ToplamaAraSinav {
		public static void main(String[] args) {
			int sayi1 = (int)(Math.random() * 10);
			int sayi2 = (int)(Math.random() * 10); 
			// 0<= Math.random() < 1
	System.out.println(sayi1  + "+" + sayi2  );
	Scanner klavye = new Scanner(System.in);
	int toplam = klavye.nextInt();


	if (sayi1 + sayi2 == toplam) {
		System.out.println("Dogru cevap");
	}else {
		System.out.println("Yanlis cevap");

		
	}
	}
	
}
