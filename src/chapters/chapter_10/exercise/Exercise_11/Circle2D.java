package chapters.chapter_10.Exercise;

public class Circle2D {
    private double x;
    private double y;
    private double radius;

    public Circle2D(){
        x=0;
        y=0;
        radius=1;
    }
    public Circle2D(double x,double y,double radius){
        this.x=x;
        this.y=y;
        this.radius=radius;
    }
    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;

    }
    public boolean contains(double x, double y) {
        double distance = Math.sqrt((this.x - x) *(this.x - x)+ (this.y - y)*(this.y - y));
        return distance< radius ? true : false;
    }
    public boolean contains(Circle2D circle) {
        double distance = Math.sqrt(Math.pow(circle.getX() - this.x, 2) + Math.pow(circle.getY() - this.y, 2));
        return (distance + circle.getRadius()) < radius;
    }
    public boolean overlaps(Circle2D circle) {
        double distanceWithPoint = Math.sqrt(Math.pow(circle.getX() - this.x, 2) + Math.pow(circle.getY() - this.y, 2));
        double distanceWithRadius = circle.getRadius() + this.radius;

        return distanceWithPoint < distanceWithRadius ? true: false;
    }
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}

