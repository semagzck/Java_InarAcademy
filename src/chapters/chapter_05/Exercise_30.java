package Chapters.chapter_05;

public class Exercise_30 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an amount :");
		double amount = input.nextDouble();
		System.out.println("Enter the annual interest rate (e.g., 5 for %5) :");
		double annualInterestRate = input.nextDouble();
		System.out.println("Enter the number of months :");
		int month = input.nextInt();
		double monthlyInterestRate = annualInterestRate / 1200;
		double savingAmount = 0;
		
		
		
		for (int months = 1; months <= month; months++) {
			savingAmount = (amount + savingAmount) * (1 + monthlyInterestRate);

		}
		System.out.println(" The amount in the savings account :$" + (int) (savingAmount * 1000) / 1000.);

	}

}

