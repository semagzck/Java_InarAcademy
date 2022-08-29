package chapters.chapter_03;

import java.util.*;

public class Exercise_08{

	public static void main(String[] arg){
	
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();

	int min,max,med = 0;

	if(a < b){
		max = b;
		min = a;
	}else{// b < a
		max = a;
		min = b;
	}
	// min =0, c = 0; med = 1;
	//
	if(max < c){
		med = max; 
		max = c;
	}else{
		if(min < c){
			med =c;
		} else {
			med = min;
			min = c;
		}
	//med = 1, min = 0, max = 3
	}
	// min = 1, med =3,  max =8 

	System.out.println("min :" + min);
	System.out.println("med :" + med);
	System.out.println("max :" + max);
}
}