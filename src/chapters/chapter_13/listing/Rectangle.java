package chapters.chapter_13.Listing;

public class Rectangle extends GeometricObject {
    private double width;
    private double height;

    public Rectangle() {
        this(0,0, "white", false);
    }

    public Rectangle(double width, double height) {
        this(width,height,"white",false);
    }

    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
