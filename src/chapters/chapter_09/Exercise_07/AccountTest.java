package chapters.chapter_09;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account(1122, 20_000);
        account.setAnnualInterestRate(4.5);
        account.withdraw(2500);
        account.deposit(3000);
        System.out.println("Account was created: " +account.getDateCreated());
        System.out.println("Balance amount: "+account.getBalance());
        System.out.printf("Monthly interest rate:%.3f ",account.getMonthlyInterest());

    }
}

