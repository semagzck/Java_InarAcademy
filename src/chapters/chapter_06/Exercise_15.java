package chapter_06;

public class Exercise_15 {
	public static void main(String[] args) {

	System.out.println("Taxable inc.    Single      Married Joint    Married Sep.    Head");
	System.out.println("-----------------------------------------------------------------");

	for(double income = 50_000; income <= 60_000; income += 50) {
			System.out.printf("%1.0f", income);
	}
		int f_ = 16;
		for(int status = 1; status <= 4; status++) {
			Object income = 0;
			double tax = computeTax(status, income);
			System.out.printf("%" + f_ + ".0f", tax);
			if(status == 4) System.out.println();
			f_--;
		}
	}

	private static double computeTax(int status, Object income) {
		// TODO Auto-generated method stub
		return 0;
	}
}
