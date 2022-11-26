package chapters.chapter_11.exercise;

import java.util.ArrayList;
import java.util.Date;
public class Account {
    private String name;
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    private ArrayList<Transaction> transactions;

    public Account() {
        annualInterestRate = 0;

    }
    // constructor that creates an account with the specified id and initial balance
    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        transactions = new ArrayList<>();
        dateCreated = new Date();
    }

    public Account(String name, int id, double balance) {
        this(id,balance);
        this.name = name;


    }
    public String toString() {
        return  "---------------------------------------" +
                "\nAccount Holder Name: " + getName() + "\nAnnual Interest Rate: " + getAnnualInterestRate() +
                "\nBalance: " + getBalance() + "\nTransactions: " + transactions.toString() +
                "---------------------------------------";
    }

    //accessor and mutator methods for name, id, balance, and annualInterestRate.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getBalance() {
        return this.balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getAnnualInterestRate() {
        return this.annualInterestRate;
    }
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    public Date getDateCreated() {
        return dateCreated;
    }
    public double getMonthlyInterestRate() {
        return getAnnualInterestRate() / 1200;
    }
    //Monthly interest is balance * monthlyInterestRate.

