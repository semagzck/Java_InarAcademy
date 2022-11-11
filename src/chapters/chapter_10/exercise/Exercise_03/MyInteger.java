package chapters.chapter_10.Exercise;

public class MyPoint {
     private double x;
     private double y;

    public MyPoint() {
        x=0;
        y=0;
    }
    public MyPoint(double x,double y){
        this.x=x;
        this.y=y;
    }
    public double distance(MyPoint myPoint){
        return Math.sqrt(Math.pow(myPoint.y-this.y,2) + Math.pow(myPoint.x - this.x,2));
    }
    public double distance(double x , double y){
        return Math.sqrt(Math.pow(y-this.y,2) + Math.pow(x - this.x,2));
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

}

