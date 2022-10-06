package chapter_06;

public class Exercise_10 {
	public static void main(String[] args) {

	System.out.println("Prime numbers less than 10000...");
	
		for(int i = 2, count = 0; i < 10000; i++) {
			if(isPrime(i)) {
				System.out.printf("%5d ", i);
				count++;
				if(count % 10 == 0) System.out.println();
			}
		}
		
}

	private static boolean isPrime(int i) {
		// TODO Auto-generated method stub
		return false;
	}
}
