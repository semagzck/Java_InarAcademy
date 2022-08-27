package weeks.week_03;

import java.util.*;

public class Question_02 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter three  age");
		int age1 = input.nextInt();
		int age2 = input.nextInt();
		int age3 = input.nextInt();
		// a1=25 a2=20 a3=30;
		if (age1 < age2) {
			int temporaryAge = age2; // temp=20
			age2 = age1;// age2=25
			age1 = temporaryAge; // age1=20

		}
		if (age1 < age3) {
			int temporaryAge = age3; // temp=30
			age3 = age1;// age3=20
			age1 = temporaryAge; // 30
			// a1=30, a2=25 a3= 20

		}
		if (age2 < age3) {
			int temporaryAge = age3;// temp=20
			age3 = age2; // age3=25
			age2 = temporaryAge; // age;20
		}
		System.out.println(" order of ages\r\n"
				+ "" + age1+" " + age2+" " + age3);

	}

}


