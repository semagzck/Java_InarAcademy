package chapters.chapter_10.Exercise;

public class TestCourse {
    public static void main(String[] args) {

        Course math = new Course("math course");
        math.addStudent("Tahir  ");
        math.addStudent("Sercan");
        math.addStudent("Sema");
        math.displayStudents();

        System.out.println("-------------------------");

        math.dropStudent("Tahir");
        math.displayStudents();

        System.out.println("-------------------------");

        math.clear();
        math.displayStudents();


}
}
