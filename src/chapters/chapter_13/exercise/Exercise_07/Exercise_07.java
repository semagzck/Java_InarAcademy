package chapters.chapter_13.Exercise.Exercise_07;

public class Exercise_07 {
    public static void main(String[] args) {
        Square square=new Square(5);
        System.out.println("The area of square is "+square.getArea());
        System.out.println("The perimeter of square is "+square.getPerimeter());
        square.howToColor();
    }
}

