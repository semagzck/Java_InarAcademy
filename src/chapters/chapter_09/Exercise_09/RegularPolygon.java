package chapters.chapter_09;

public class RegularPolygon {
    private int n;
    private double side;
    private double x;
    private double y;

    public RegularPolygon(){
        this(3 , 1 , 0 , 0);
    }
    public RegularPolygon(int n, double side, double x, double y){
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }
    public RegularPolygon(int n , double side){
        this(n , side , 0 , 0);
    }
    public int getN() {
        return n;
    }
    public double getSide() {
        return side;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public void setN(int n) {
        this.n = n;
    }
    public void setSide(double side) {
        this.side = side;
    }
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public double getPerimeter(){
        return side * n;
    }
    public double getArea(){
        return (n * Math.pow(side , 2)) / (4 * Math.tan(Math.PI / n));
    }

}

