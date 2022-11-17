package chapters.chapter_11.exercise;

public class Employee extends Person{
    protected double salary;
    protected String office;
    protected MyDate dateHired;

    public Employee(String name, String İzmir, String phoneNumber, String emailAdress, int salary, String itu, String s) {
        this(name,"none","none","none",0, "none",new MyDate());
    }

    public Employee(String name, String adress,String phoneNumber,String emailAdress,double salary, String office, MyDate dateHired) {
        super(name,adress,phoneNumber,emailAdress);
        this.salary = salary;
        this.office = office;
        this.dateHired = dateHired;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public MyDate getDateHired() {
        return dateHired;
    }

    public void setDateHired(MyDate dateHired) {
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
        return "Hired date: "+dateHired+"\n"+super.toString()+"\nOffice: " +office + "\nSalary:" + salary;
    }
}


