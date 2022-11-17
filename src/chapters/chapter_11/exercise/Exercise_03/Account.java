package chapters.chapter_11.exercise;
import java.util.Date;
public class Account {
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

    public int getId(){
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
    @Override
    public String toString(){
        return "Created time:"+dateCreated+"\nId number: "+id+"\nBalance: "+balance+"\n";
    }
}
