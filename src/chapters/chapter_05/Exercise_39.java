package Chapters.chapter_05;

public class Exercise_39 {
	public static void main(String[] args) {

	double commision = 0;
	double sales = 30_000;
	
	System.out.print("  ", 5000 * 0.08);
	System.out.print("  ", 5000 * 0.10);
	
	for (commision < 30_000) {
		commision = 0;
		commision += 5000 * 0.08;
		commision += 5000 * 0.10;
		commision += (sales - 10_000) * 0.12;
		sales += 0.01;
	}
	
	System.out.printf(" You'll need to make $%1.2f in sales." + sales);
	}
}

