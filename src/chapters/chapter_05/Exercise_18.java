package Chapters.chapter_05;

public class Exercise_18 {

	public static void main(String[] args) {

			System.out.println("Pattern A");
			int a = 1;
			for (int i = 0; i < 6; i++) {
				for (int k = 1; k <= a; k++) {
					System.out.print(k + " ");
				}
				System.out.println();
				a++;
			}

			System.out.println("\n\nPattern B");
			int b = 7;

			for (int l = 0; l < 6; l++) {

				for (int m = 1; m < b; m++) {

					System.out.print(m + " ");

				}
				System.out.println();
				b--;
			}

			System.out.println("\n\nPattern C");

			for (int c = 1; c <= 6; c++) {

				for (int n = 6 - c; n >= 1; n--) {
					System.out.print("  ");
				}
				for (int p = c; p >= 1; p--) {
					System.out.print(p + " ");
				}
				System.out.println();

			}

			System.out.println("\n\nPattern D");
			for (int d = 0; d < 6; d++) {

				for (int t = 0; t < d; t++) {
					System.out.print("  ");
				}
				for (int s = 1; s <= 6 - d; s++) {
					System.out.print(s + " ");
				}
				System.out.println();

