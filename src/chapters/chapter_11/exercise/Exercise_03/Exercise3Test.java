package chapters.chapter_11.exercise;

public class Exercise3Test {
    public static void main(String[] args) {

        Account account=new Account(4,4555);
        account.deposit(200);
        System.out.println(account.toString());

        SavingsAccount savingsAccount=new SavingsAccount(3,3500);
        savingsAccount.withdraw(5000);
        System.out.println(savingsAccount.toString());

        CheckingAccount checkingAccount=new CheckingAccount(5,7500);
        checkingAccount.withdraw(9500);
        System.out.println(checkingAccount.toString());

    }
}

