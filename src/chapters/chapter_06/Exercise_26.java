package chapter_06;

public class Exercise_26 {
	 public static boolean isPrime(int num) {  
		 for(int i = 2; i < num; i++) {
	 }
           int i = 0;
		if(num % i == 0) {
              return false;
              }   
       
       return true;
  }
// tests palindrome
  public static boolean isPalindrome(int num) {
      String reversed = "";
       String numStr = "" + num;
      for(int i = numStr.length() - 1; i >= 0; i--) {
           reversed += numStr.charAt(i);
      }
       if(num == Integer.parseInt(reversed)) return true;
      else return false;
  }
  }
  

