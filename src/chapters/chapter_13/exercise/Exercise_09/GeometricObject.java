package chapters.chapter_13.Exercise.Exercise_09;
import java.util.Date;

public abstract class GeometricObject {
    private String color = "white";
    private boolean filled;
    private Date datecreated;


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

    public abstract double getArea();

    public abstract double getPerimeter();
}

