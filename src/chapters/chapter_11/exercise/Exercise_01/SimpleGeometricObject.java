package chapters.chapter_11.exercise;

import java.util.Date;

public class SimpleGeometricObject {
    private String color;
    private boolean filled;
    private java.util.Date dateCreated;

    public SimpleGeometricObject(){
        color="white";
        filled=false;
        dateCreated=new Date();
    }
    public SimpleGeometricObject(String color, boolean filled){
        this.color=color;
        this.filled=filled;
        dateCreated=new Date();

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

    public Date getDateCreated() {
        return dateCreated;
    }
    public String toString(){
        return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
    }

}

