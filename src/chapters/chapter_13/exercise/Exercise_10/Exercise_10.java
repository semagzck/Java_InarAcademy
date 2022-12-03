package chapters.chapter_13.Exercise.Exercise_10;

public class Exercise_10 {
    public static void main(String[] args) {
        Rectangle rectangle1=new Rectangle(8,10);
        Rectangle rectangle2=new Rectangle(10,8);
        Rectangle rectangle3=new Rectangle(4,5);

        System.out.println("Is rectangle1 is equals rectangle2 ? "+rectangle1.equals(rectangle2));
        System.out.println("Is rectangle1 is equals rectangle3 ? "+rectangle1.equals(rectangle3));

    }
}
