package chapter_06;

public class Exercise_14 {
	public static void main(String[] args) {


	System.out.println("i              m(i)");
	System.out.println("-------------------");
	for(int i = 1; i <= 901; i += 100) {
		double pi = getPi(i);
	System.out.printf("%-13d%1.4f\n", i, pi);
}
}

	private static double getPi(int i) {
		// TODO Auto-generated method stub
		return 0;
	}
}
