package chapter_06;

import java.util.Scanner;

public class Exercise_31 {
public static void main(String [] args) {
	Scanner input = new Scanner(System.in);
			System.out.println("Bir tam sayı olarak bir kredi kartı numarası gir ");
	long number = input.nextLong();
	System.out.println(number + (isValid(number) ?"is valid" :"is invalid"));
	
}
public static boolean isValid(long number) {
	boolean isValid =
}
public static int sumOfDoubleEvenPlace(long  number) {
	String s = number + "";
	int sum = 0;
	for (int i = s.length() -2; i >=0; i-=2) {
		sum += getDigit(2 * Integer.parseInt(s.substring(i,i + 1)));
	}
	return sum;
	}
public static int getDigit(int num) {
	if (num<= 9 ) {
		return num;
	}else
		return(num % 10) + (num / 10);
	}
public static int sumOffOddPlace(long number) {
	String s = number + "";
	int sum = 0 ;
	for (int i = s.length() -1; i>=0; i -=2) {
		sum += Integer.parseInt(s.substring(i,i+1));
	}
	return sum;
	
}
public static boolean prefixMatched(long number,int d) {
	return getPrefix(number,getSize(d)) == d;
}


public static int getSize(long d) {
	String s = d + "";
	int size = s.length();
	return size;
}

public static long getPrefix(long number,int k) {
	String s = number + "";
	if (getSize(number) > k) {
		return Long.parseLong(s.substring(0,k));
	
	}
	return number;
	}

}

