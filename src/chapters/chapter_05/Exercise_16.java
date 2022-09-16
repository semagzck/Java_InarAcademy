package Chapters.chapter_05;

public class exercise_16 {
//factors in ascending order
	public static void main(String[] args) {
		
		System.out.print("Enter a number: ");
		int input = in.nextInt();
		int num = input;

		int i = 2;
		String answer = "";
		while(true) {
		if(num % i == 0 && num > i) {
				answer += i + " ";
				num = num / i;
				continue;
		} else if (num / i == 1 && num % i == 0) {
				answer += i + " "; break; // this is the last, highest factor
				} else {
				i++;
			}	
		} 
		System.out.println("Smallest factors of " + input + " are: " + answer);
	
	}
}
		
