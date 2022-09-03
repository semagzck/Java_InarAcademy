package chapters.chapter_04;
import java.util.Scanner;

public class Exercise_18 {

/*M: Mathematics
  C: Computer Science
  I: Information Technology
 1, 2, 3, 4, which  indicates whether a student is a freshman, sophomore, junior, or senior. */

	public static void main(String[] args) {

		  Scanner input = new Scanner(System.in);
		  System.out.println("Enter two characters:");
		  String answer = input.nextLine();
		 
		  //a,A duyarlı kodu unutma!!
		  char major = Character.toUpperCase(answer.charAt(0));
		  char status = answer.charAt(1);
		 
		  String sMajor = "";
		  String sStatus = "";
		 
		  switch (major) {
		  case 'M':
		   sMajor = "Mathematics";
		   break;
		 
		  case 'C':
		   sMajor = "Computer Science";
		   break;
		 
		  case 'I':
		   sMajor = "Information Technology";
		   break;
		 
		  default:
		   System.out.println("Invalid input");
		   System.exit(0);
		   break;
		  }
		 
		  switch (status) {
		  case '1':
		   sStatus = "Freshman";
		   break;
		 
		  case '2':
		   sStatus = "Sophomore";
		   break;
		 
		  case '3':
		   sStatus = "Junior";
		   break;
		 
		  case '4':
		   sStatus = "Senior";
		   break;
		 //sonucu garantiye al 
		  default:
		   System.out.println("Invalid input");
		   System.exit(0);
		   break;
		  }
		  System.out.println(sMajor + " " + sStatus);

	}

}
