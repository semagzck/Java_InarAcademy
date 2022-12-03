package chapters.chapter_13.Exercise.Exercise_07;


public class Square extends GeometricObject implements Colorable {
    double length;

    Square() {
        length = 1;

    }

    Square(double length) {
        this.length = length;
    }

    public double getArea() {
        return length * length;
    }

    public double getPerimeter() {
        return 4* length;
    }
    public void howToColor(){
        System.out.println("Color all four sides.");
    }
}
