package Chapters.chapter_05;

public class Exercise_21 {

	public static void main(String[] args) {

	System.out.print("Enter loan amount: ");
	double loan = input.nextDouble();
	
	System.out.print("Enter number of Years: ");
	int years = input.nextInt();
	
	System.out.println("Interest Rate     Monthly Payment     Total Payment");
	
	for(double annualRate = 5.0; annualRate <= 8.0; annualRate += 0.125) {
	
		double monthlyRate = annualRate / 1200;
		
	double monthlyPayment = (loan * monthlyRate) / (1 - 1 / Math.pow(1 + monthlyRate, years * 12));
	
		double totalPayment = monthlyPayment * years * 12;
		
		System.out.printf("%1.3f%%%18.2f%22.2f\n",annualRate, monthlyPayment, totalPayment);

	}
	}
}
