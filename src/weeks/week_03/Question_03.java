package weeks.week_03;
import java.util.Scanner;

public class Question_03 {
 
	 
 public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 
		 System.out.print("Enter four - digit number: ");
		 
         int number = input.nextInt();
        // number 1345
         int d4 = number / 1000; //d4 =1%)
         int kalan = (number % 1000); // kalan=345
         int d3 = kalan / 100; //d3=3
         kalan = (number % 100); // kalan=45
         int d2 = kalan / 10; // d2 = 4
         int d1 = kalan % 10; // d1 = 5
         
         
       System.out.print("Reserve number : " + d1 + d2 + d3 + d4);
       
 }

}

