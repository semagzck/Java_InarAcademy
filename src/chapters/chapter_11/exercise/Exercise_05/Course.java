package chapters.chapter_11.exercise;
import java.util.ArrayList;

public class Course {
    private String courseName;
    private ArrayList<String> students;
    private int numberOfStudents;
    public Course(){
        numberOfStudents=0;

    }
    public Course(String courseName){
        this.courseName=courseName;
    }
    public  void addStudents(String student){
        students.add(student);
        numberOfStudents++;

    }
    public void dropStudents(String student) {
        if(students.contains(student)) {
            students.remove(student);
            numberOfStudents--;
        }
        else{
            System.out.println(student+" is not found.");
        }

    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setStudents(ArrayList<String> students) {
        this.students = students;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public String getCourseName(){
        return courseName;
    }
    public ArrayList getStudents() {
        return students;
    }public int getNumberOfStudents() {
        return numberOfStudents;
    }
}






