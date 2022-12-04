package chapters.chapter_13.Exercise.Exercise_12;

public class Test {
    public static void main(String[] args) {

        GeometricObject[] objects = new GeometricObject[4];
        objects[0] = new Circle(8);
        objects[1] = new Circle(9);
        objects[2] = new Rectangle(6, 5);
        objects[3] = new Rectangle(13.7, 2.4);

        System.out.println("The sum area of all geometric objects is: " + sumArea(objects));

    }

    public static double sumArea(GeometricObject[] a){
        double sumAreas = 0;
        for (GeometricObject ob : a) {
            sumAreas += ob.getArea();
        }
        return sumAreas;
    }
}
