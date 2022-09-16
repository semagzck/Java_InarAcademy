package Chapters.chapter_05;

public class Exercise_32 {
	public static void main(String[] args) {

	for(int i = 0; i < 50; i++) {
		
		int lottery = (int) (Math.random() * 100);
		System.out.print(lottery + " ");
		if(i % 10 == 0 && i != 0) System.out.println();
		
	} System.out.println("\n");
	
	
	for(int i = 1; i < 51; i++) {
		int dig1 = (int)(Math.random() * 10);
		int dig2 = (int)(Math.random() * 10);
		
		while(dig1 == dig2) {
			dig2 = (int)(Math.random() * 10);
		}
		
		System.out.print(dig1 + "" + dig2 + " ");
		if(i % 10 == 0) System.out.println();
	}
	
}
}

