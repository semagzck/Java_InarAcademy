package chapters.chapter_11.listing;

public class RectangleFromSimpleGeometricObject extends SimpleGeometricObject{
    private  double width;
    private  double height;

    public RectangleFromSimpleGeometricObject(){
        width=0;
        height=0;

    }

    public RectangleFromSimpleGeometricObject(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public RectangleFromSimpleGeometricObject(String color, boolean filled, double width, double height) {
        this.width = width;
        this.height = height;
        setColor(color);
        setFilled(filled);
    }
    public double getArea(){
        return width*height;
    }
    public double getPerimeter(){
        return 2*(width+height);
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

