package chapters.chapter_13.Exercise.Exercise_06;

public class Circle extends ModifyGeometricObject {
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

}
