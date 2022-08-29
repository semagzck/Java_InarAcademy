package chapters.chapter_03;
import java.util.Scanner;
public class Exercise_11 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter month and year in order :");
	int month = input.nextInt();
	int year = input.nextInt();
	int days;
	String monthName = null;

	switch (month) {

	case 1:
	case 3:
	case 5:
	case 7:
	case 8:
	case 10:
	case 12:
		days = 31;
		break;
	case 2:
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			days = 29;
			break;
		}
		days = 28;
		break;
	default:
		days = 30;

	}

	switch (month) {
	case 1:
		monthName = "January";
		break;
	case 2:
		monthName = "February";
		break;
	case 3:
		monthName = "March";
		break;
	case 4:
		monthName = "April";
		break;
	case 5:
		monthName = "May";
		break;
	case 6:
		monthName = "June";
		break;
	case 7:
		monthName = "July";
		break;
	case 8:
		monthName = "August";
		break;
	case 9:
		monthName= "September";
		break;
	case 10:
		monthName = "October";
		break;
	case 11:
		monthName = "November";
		break;
	case 12:
		monthName = "December";
		break;
	}

	System.out.println(monthName+ " " + year + " has " + days + " days");

}

}
