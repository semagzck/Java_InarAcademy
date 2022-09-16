package Chapters.chapter_05;

public class Exercise_28 {

		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.println("Enter the year :");
			int year = input.nextInt();
			System.out.println("Enter the day( 0 for Sunday 1 for Monday...) : ");
			int days = input.nextInt();

			for (int i = 1; i <= 12; i++) {
				days = days % 7;
				String day = "";
				switch (days) {

				case 0:
					day = "Sunday";
					break;
				case 1:
					day = "Monday";
					break;
				case 2:
					day = "Tuesday";
					break;
				case 3:
					day = "Wednesday";
					break;
				case 4:
					day = "Thursday";
					break;
				case 5:
					day = "Friday";
					break;
				case 6:
					day = "Saturday";
					break;

				default:
					System.out.println("Invalid day");
					break;
				}

				if (i == 1) {
					System.out.println("January 1, " + year + " is " + day);
					days += 31;
				} else if (i == 2) {
					System.out.println("February 1, " + year + " is " + day);
					if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
						days += 29;
					} else {
						days += 28;
					}

				} else if (i == 3) {
					System.out.println("March 1, " + year + " is " + day);
					days += 31;
				} else if (i == 4) {
					System.out.println("April 1, " + year + " is " + day);
					days += 30;
				} else if (i == 5) {
					System.out.println("May 1, " + year + " is " + day);
					days += 31;
				} else if (i == 6) {
					System.out.println("June 1, " + year + " is " + day);
					days += 30;
				} else if (i == 7) {
					System.out.println("July 1, " + year + " is " + day);
					days += 31;
				} else if (i == 8) {
					System.out.println("August 1, " + year + " is " + day);
					days += 31;
				} else if (i == 9) {
					System.out.println("September 1, " + year + " is " + day);
					days += 30;
				} else if (i == 10) {
					System.out.println("December 1, " + year + " is " + day);
					days += 31;
				} else if (i == 11) {
					System.out.println("October 1, " + year + " is " + day);
					days += 30;
				} else if (i == 12) {
					System.out.println("December 1, " + year + " is " + day);

				}

			}

		}

	}

