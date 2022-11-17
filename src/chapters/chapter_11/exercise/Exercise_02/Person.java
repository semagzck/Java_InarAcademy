package chapters.chapter_11.exercise;

public class Person {
    protected String name;
    protected String adress;
    protected String phoneNumber;
    protected String emailAdress;

    public Person() {
        this("null","null","null","null");
    }
    public Person(String name) {
        this.name = name;
    }
    public Person(String name,String adress,String phoneNumber,String emailAdress){
        this.name=name;
        this.adress=adress;
        this.phoneNumber=phoneNumber;
        this.emailAdress=emailAdress;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }
    @Override
    public String toString(){
        return "Name: "+name+"\nAdress: "+adress+"\nPhone Number: "+phoneNumber+"\nE-mail adress: "+emailAdress;

    }
}

