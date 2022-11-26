package chapters.chapter_12.exercise;
import java.util.Scanner;
public class Exercise_04 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter annual interest rate (for example, 8.25): ");
        double annualInterestRate = input.nextDouble();
        System.out.print("Enter number of years as an integer: ");
        int numberOfYears = input.nextInt();
        System.out.print("Enter loan amount (for example, 120000.95): ");
        double loanAmount = input.nextDouble();
        try {
            NewLoan loan = new NewLoan(annualInterestRate, numberOfYears, loanAmount);
            System.out.println("The loan was created " + loan.getLoanDate());
            System.out.println("The monthly payment: " + loan.getMonthlyPayment() + "\nThe total payment: " + loan.getTotalPayment());
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }


    }


}

