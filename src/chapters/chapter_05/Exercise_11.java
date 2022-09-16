package Chapters.chapter_05;

public class Exercise_11 {

	public static void main(String[] args) {
// divisible by 5 or 6 but not both
		int count = 0;
		for(int num = 100; num < 201; num++){
			if(num % 5 == 0 ^ num % 6 == 0){
				System.out.print(num + " ");
			}
				count++;
				if(count % 10 == 0) System.out.println();
			}
		}
		
	}


