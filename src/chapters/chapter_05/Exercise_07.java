package chapters.chapter_05;

public class Exercise_07 {
	public static void main(String[] args) {
		int tuition = 10000;
		double total =10000;
		double total14 = 0;

		for (int year = 2; year <= 14; year++) {

			tuition += total * .05;

			if (year <= 10) {
				total = total + tuition ;
			}
			if (year > 10) {
				totalCost14 = total + tuition;
			}
		}
		System.out.println("The cost of tuition in 10 years is $" + total);
		System.out.println("The total cost of 4 years tuition after 10 years is $" + totalCost14);

	}
}

