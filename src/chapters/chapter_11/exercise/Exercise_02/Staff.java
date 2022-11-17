package chapters.chapter_11.exercise;

public class Staff extends Employee{
    protected String title;

    public Staff(String name,String title) {
        super(name, "İzmir", "052343256", "semag<ckk@gmail.com", 80000, "Bornova", new MyDate().toString());
        this.title=title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    @Override
    public String toString(){
        return "Title: "+title+"\n"+super.toString();
    }

}

