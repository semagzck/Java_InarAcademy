package chapters.chapter_13.Exercise.Exercise_09;

public class Circle extends GeometricObject implements Comparable<Circle>{
    double radius;

    Circle(){
        radius=1;
    }
    Circle(double newRadius){
        radius=newRadius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
    public double getPerimeter(){
        return 2*radius*Math.PI;
    }
    void setRadius(double newRadius){
        radius=newRadius;
    }

    public double getRadius() {
        return radius;
    }


    public int compareTo(Circle o) {
        if (this.getRadius() > o.getRadius()) {
            return 1;
        } else if (this.getRadius() < o.getRadius()) {
            return -1;

        } else
            return 0;
    }

    @Override
    public boolean equals(Object obj) {
        return this.compareTo((Circle)obj)==0 ? true: false;
    }




}
