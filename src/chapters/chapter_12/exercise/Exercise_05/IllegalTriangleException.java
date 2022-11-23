package chapters.chapter_12.exercise.exercise05;

public class IllegalTriangleException extends Exception{
    public IllegalTriangleException(){
        System.out.println("One side of triangle must not greater than the sum of other sides");
    }
}

