package chapter_06;

public class Exercise_13 {
	public static void main(String[] args) {

	System.out.println("i         m(i)");
	System.out.println("--------------");

	for(double i = 1, mi = 0; i <= 20; i++){
		mi += getMi(i);
		int f_ = 13;
		if (i >= 10) f_--;
		System.out.printf("%1.0f%" + f_ + ".4f\n", i, mi);
	}
	
}

	private static double getMi(double i) {
		// TODO Auto-generated method stub
		return 0;
	}
}



