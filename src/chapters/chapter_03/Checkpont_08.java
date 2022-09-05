package chapters.chapter03;

public class Checkpoint_08 {

	public static void main(String[] args) {
		
		
		int i = 0;
		int j = 5;
		int k = 15;
		
		if(i > k) {
			if(i > k) {
				System.out.println("A");
			}
		}else {
			
			System.out.println("B");
		}
		//-----------------------------------------------------------
		double x = 1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1;
		System.out.println(x == 0.5);
		
		final double EPSILON = 1E-14;
		x = 1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1;
		if (Math.abs(x - 0.5 ) < EPSILON)
			System.out.println(x + " is approximately 0.5");
		
		//-----------------------------------------------------------
		int number = 6;
		boolean even;
		if(number % 2 == 0)
			even = true;
		else
			even = false;
		even = number % 2 == 0;
		System.out.println(even);
		//-----------------------------------------------------------
		if(i == j ) {
			k = j;
		}else {
			k = i;
		}
		k = i;
		
		//-----------------------------------------------------------
		int tuition;
		boolean inState = false;
		if (inState) {
			tuition = 5000;
		}else {
			tuition = 15000;
		}
		System.out.println("The tuition is " + tuition);
	}
}
	



