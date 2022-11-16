package chapters.chapter_11.exercise;

public class Triangle extends SimpleGeometricObject{

    private double side1;
    private double side2;
    private double side3;

    public Triangle(){
        this(1,1,1);
    }
    public Triangle(double side1,double side2,double side3){
        super("blue",true);
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }
    public double getArea(){
        double y = (side1 + side2 + side3) / 2;
        return Math.sqrt(y * ((y - side1) * (y - side2) * (y - side3)));

    }
    public double getPerimeter(){
        return side1+side2+side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }
    @Override
    public String toString(){
        return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
    }
}
