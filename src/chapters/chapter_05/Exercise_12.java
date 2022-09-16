package Chapters.chapter_05;

public class Exercise_12 {

	public static void main(String[] args) {
//smallest number greater than 12_000 
		int i = 0; //hedef
	while(true) {
			if(Math.pow(++i, 2) > 12000) break;
		}
		System.out.println("The smallest number greater than 12,000 when squared is: " + i);
		

}
}

