package chapters.chapter_11.exercise;
import java.util.Date;
public class Loan {
    private Date loanCreatedDate;
    private double loanAmount;
    private double annualInterestRate;
    private int numberOfYears;

    public Loan() {
        this(100, 10, 10);
        loanCreatedDate = new Date();

    }
    public Loan(double loanAmount,double annualInterestRate, int numberOfYears) {
        loanCreatedDate = new Date();
        this.loanAmount = loanAmount;
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;

    }

    public Date getLoanCreatedDate() {
        return loanCreatedDate;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    } public java.util.Date getLoanDate() {
        return loanCreatedDate;
    }


    public double getMonthlyPayment() {
        double monthlyInterestRate = annualInterestRate / 1200;
        double monthlyPayment = loanAmount * monthlyInterestRate / (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
        return monthlyPayment;

