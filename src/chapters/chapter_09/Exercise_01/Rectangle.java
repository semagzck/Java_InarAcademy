package chapters.chapter_09;

public class Rectangle {
    double width = 4;
    double height = 2;

    Rectangle() {

    }

    Rectangle (double w, double h) {
        this.width = w;
        this.height = h;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return (width * 2) + (height * 2);
    }


}

