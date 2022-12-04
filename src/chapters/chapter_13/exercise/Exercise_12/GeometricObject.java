package chapters.chapter_13.Exercise.Exercise_12;
import java.util.Date;
public abstract class GeometricObject {
    private String color = "white";
    private boolean filled;
    private Date datecreated;

    public GeometricObject() {
        datecreated = new Date();
    }

    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        datecreated = new Date();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDatecreated() {
        return datecreated;
    }

    @Override
    public String toString(){
        return "created on " + datecreated + "\ncolor: " + color + " and filled: " + filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}
