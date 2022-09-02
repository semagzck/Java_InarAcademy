
import java.util.Scanner;

public class Checkpoint_01 {
	/*Example radius is 5
	  radius  < 0  false
	  radius  <=0  false
	  radius  > 0  true
	  radius  >=0  true
	  radius  ==0  false
	  radius  !=0  true */
	
	public static void main (String [] args) {
		//Random Process.
		
		/* for (int i = 0; i < 10; i++) {
			System.out.println(Math.random());
		} */
		int num1 = (int)(Math.random() * 10);
		int num2 = (int)(Math.random() * 10);
		
		System.out.println(num1 + " + " + num2 + " = ? ");
		Scanner keyboard = new Scanner(System.in);
		int total = keyboard.nextInt();
		System.out.println(num1 + num2 == total);
	}
	
	
	

}

