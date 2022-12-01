package chapters.chapter13.Exercise.Exercise_01;

public class Triangle extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double getArea() {
        double u = (side1 + side2 + side3) / 2;
        return Math.sqrt(u * (u - side1) * (u - side2) * (u - side3));
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public String toString(){
        return "The area of the triangle:" + getArea() +
                "The perimeter of the triangle: " + getPerimeter() +
                "The color of the triangle: " + getColor() +
                "is filled: " + isFilled();

    }
}

