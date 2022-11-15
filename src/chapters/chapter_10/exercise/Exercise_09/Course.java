package chapters.chapter_10;

public class Course {
    private String name;
    private String[] students;
    private int numberOfStudents;

    public Course() {

    }

    public Course(String name) {
        this.name = name;
        students = new String[10];
    }

    public void addStudent(String student) {
        if (numberOfStudents >= student.length()) {
            String[] tempList = new String[students.length * 2];
            System.arraycopy(students, 0, tempList, 0, students.length);

        }
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public String[] getStudents() {

        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getName() {
        return name;
    }

    public void dropStudent(String student) {
        int index = findTheStudent(student);
        if(index == -1){
            System.out.println("there is not any student like " + student);
            return;
        }
        for(int i = index;i < numberOfStudents -1 ; i++) {
            students[i] = students[i + 1];
        }
        numberOfStudents--;
    }

    public int findTheStudent(String student){
        for (int i = 0; i < students.length; i++) {
            if(students[i].equals(student)){
                return i;
            }

        }
        return -1;
    }
    public void clear(){
        students = new String[10];
        numberOfStudents = 0 ;
    }
    public void displayStudents(){
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println(students[i]);

        }
    }


