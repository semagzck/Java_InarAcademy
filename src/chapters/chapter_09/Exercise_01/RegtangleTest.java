package chapters.chapter_09;

public class RegtangleTest {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4,40);
        Rectangle r2 = new Rectangle(3.5 ,35.9);

        System.out.println("Width of r1 : " + r1.width + " and the heigth r1 " + r1.height+
                "\nArea of the r1 is : " + r1.getArea() + "\nPerimeter of r1 is : " + r1.getPerimeter());
        System.out.println("-------------------------------------------------");
        System.out.println("Width of r2 : " + r2.width + " and the heigth r2 " + r2.height+
                "\nArea of the r2 is : " + r2.getArea() + "\nPerimeter of r2 is : " + r2.getPerimeter());
    }

}

