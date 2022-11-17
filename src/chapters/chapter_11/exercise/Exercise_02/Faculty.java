package chapters.chapter_11.exercise;

public class Faculty extends Employee {
    protected String officeHours;
    protected String rank;

    public Faculty(String name) {
        this(name, "9-6PM", "Employee");
    }

    public Faculty(String name,String officeHours, String rank) {
        super(name, "Sema", "052343256", "semagzckk@gmail.com", 80000, "Bornova", new MyDate().toString());
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }
    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
    @Override
    public String toString(){
        return super.toString()+"\nOffice hours: "+officeHours+"\nRank: "+rank;
    }

}

