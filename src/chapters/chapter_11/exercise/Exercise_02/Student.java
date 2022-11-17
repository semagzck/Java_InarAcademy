package chapters.chapter_11.exercise;

public class Student extends Person {


    private String status;
    protected static final String FRESHMAN = "Freshman";
    protected static final String SOPHOMORE = "Sophomore";
    protected static final String JUNIOR = "Junior";
    protected static final String SENIOR = "Senior";


    public Student(String name, String address, String phoneNumber, String email, String status) {
        super(name, address, phoneNumber, email);
        this.status = status;
    }


    public String getStatus() {
        return status;
    }

    @Override
    public String toString(){
        return super.toString()+"\nClass name:" + getStatus();
    }

}

