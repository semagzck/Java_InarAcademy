package Chapters.chapter_05;

import java.util.Scanner;
public class Exercise_09 {


		public static void main(String[] args) {

			double firstScore = 0;
			double secondScore = 0;
			double tempScore = 0;
			
			String firstName = "";
			String secondName = "";
			String tempName = "";
			

			Scanner input = new Scanner(System.in);

			System.out.print("Enter the number of students: ");
			int numberStudents = input.nextInt();

			System.out.print("Enter a students name: ");
			firstName = input.next();

			System.out.print("Enter the students score: ");
			firstScore = input.nextDouble();

			while (numberStudents > 1) {

				System.out.print("Enter a students name: ");
				tempName = input.next();

				System.out.print("Enter the students score: ");
				tempScore = input.nextDouble();

				if (tempScore > firstScore) {
					secondScore = firstScore;
					secondName = firstName;
					firstScore = tempScore;
					firstName = tempName;

					numberStudents--;
					continue;
				}

				if (tempScore < firstScore && tempScore > secondScore) {
					secondScore = tempScore;
					secondName = tempName;
				}
				numberStudents--;

			}
			System.out.println("The bets two students are " + firstName +" and " + secondName);
			System.out.print(firstName + "'s score of " + firstScore + "\n" 
								+ secondName + "'s score of " + secondScore);
			

		}

	}
