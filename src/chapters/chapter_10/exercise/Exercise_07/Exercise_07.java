package chapters.chapter_10.Exercise;
import java.util.Scanner;
import java.util.Date;
public class Exercise_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int NUMBER_OF_ACCOUNT=10;
        Account[] accounts = new Account[NUMBER_OF_ACCOUNT];
        accounts=createAccount(accounts);
        int id = checkIdValidation(input, accounts);
        int operationNumber = operationNumberValidation(input);
        operationProcess(input, accounts, id, operationNumber);
    }

    private static Account[] createAccount(Account[] accounts){
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new Account(i , 100);
        }
        return accounts;
    }
    private static int checkIdValidation(Scanner input, Account[] accounts) {
        int id;
        do {
            System.out.println("enter your account id :");
            id = input.nextInt();
            if (!(0 < id && id <= accounts.length)) {
                System.out.println("INVALID ID: Try again.");
            }

        }
        while (!(0 < id && id <= accounts.length));
        return id;
    }

    private static int operationNumberValidation(Scanner input) {
        System.out.println("Main menu\n" + "1: check balance\n" + "2: withdraw\n" + "3: deposit\n" + "4: exit");
        System.out.println("enter your operation number: ");
        int operationNumber = input.nextInt();

        return operationNumber;
    }

    private static void operationProcess(Scanner input, Account[] accounts, int id, int operationNumber) {
        while (0 < operationNumber && operationNumber < 5) {

            switch (operationNumber) {
                case 1:
                    System.out.println("The balance is $" + accounts[id].getBalance() + ".\n");
                    break;
                case 2:
                    System.out.print("Enter an amount to withdraw: ");
                    accounts[id].withdraw(input.nextDouble());
                    break;
                case 3:
                    System.out.print("Enter an amount to deposit: ");
                    accounts[id].deposit(input.nextDouble());
                    break;
                case 4:
                    System.out.println("Exit!!!!");
                    break;
                default:
                    System.out.println("Invalid input.. Enter a number 1-4");
            }

            System.out.println("Balance: " + accounts[id].getBalance());

        }
    }

}
class Account{
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    public Account(){
        dateCreated=new Date();
        id=0;
        balance=0;
        annualInterestRate=0;
    }
    public Account(int id,double balance){
        this();
        this.id=id;
        this.balance=balance;
    }
    public double getMonthlyInterestRate() {
        return (annualInterestRate / 100.0) / 12;
    }
    public double getMonthlyInterest() {
        return (balance * getMonthlyInterestRate());
    }
    public void  withdraw(double withdrawAmount){
        balance-=withdrawAmount;

    }
    public void deposit(double depositAmount){
        balance+=depositAmount;
    }

    public  int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {

        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {

        Date startDate = dateCreated;

        return startDate;
    }

}

