package Chapters.chapter_05;

public class Exercise_29 {
	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);

			System.out.print("Enter a year: ");
			int year = input.nextInt();

			System.out.print("Enter the first day of the year: ");
			int startDay = input.nextInt();

			int days = 0;
			for (int month = 1; month <= 12; month++) {

				switch (month) {
				case 1:
					System.out.println("\n\n\t  January " + year);
					days = 31;
					break;

				case 2:
					System.out.println("\n\n\t  February " + year);
					if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
						days = 29;
					} else {
						days = 28;
					}
					break;

				case 3:
					System.out.println("\n\n\t  March " + year);
					days = 31;
					break;

				case 4:
					System.out.println("\n\n\t  April " + year);
					days = 30;
					break;

				case 5:
					System.out.println("\n\n\t  May " + year);
					days = 31;
					break;

				case 6:
					System.out.println("\n\n\t  June " + year);
					days = 30;
					break;

				case 7:
					System.out.println("\n\n\t  July " + year);
					days = 31;
					break;

				case 8:
					System.out.println("\n\n\t  August " + year);
					days = 31;
					break;

				case 9:
					System.out.println("\n\n\t  September " + year);
					days = 30;
					break;

				case 10:
					System.out.println("\n\n\t  October " + year);
					days = 31;
					break;

				case 11:
					System.out.println("\n\n\t  November " + year);
					days = 30;
					break;

				case 12:
					System.out.println("\n\n\t  December " + year);
					days = 31;
				}

				for (int k = 0; k < 35; k++) {
					System.out.print("-");
				}

				System.out.println("\n  Sun Mon Tue Wed Thu Fri Sat");

				for (int m = 0; m < startDay; m++) {
					System.out.print("   ");
				}
			
				for (int p = 1; p <= days; p++) {

				if (p < 10) {
					System.out.print("   " + p);
				} else {
					System.out.print("  " + p);
				}
				if ((p + startDay) % 7 == 0) {
					System.out.println();
				}
			}
			System.out.println("");

			startDay = (startDay + days) % 7;
		}
			input.close();

	}
	}

