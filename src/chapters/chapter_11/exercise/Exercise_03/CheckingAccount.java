package chapters.chapter_11.exercise;

public class CheckingAccount extends Account {
    private double limit = 1000;

    public CheckingAccount() {
        super();

    }

    public CheckingAccount(int id, double balance) {
        super(id, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() + limit > amount) {
            setBalance(getBalance() - amount);
        } else
            System.out.println("You cannot withdraw amount");
    }

    public double getLimit() {
        return limit;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

