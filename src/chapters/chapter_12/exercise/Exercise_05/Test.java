package chapters.chapter_12.exercise.exercise05;

public class Test{
    public static void main(String[] args) throws IllegalTriangleException {
        try{
            Triangle triangle=new Triangle(1,5,8);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

}

