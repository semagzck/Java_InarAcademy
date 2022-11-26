package chapters.chapter_12.exercise;

public class MyRectangle2D {
    private double x;
    private double y;
    private double height;
    private double width;
    public MyRectangle2D() {
        x = 0;
        y = 0;
        height = 1;
        width = 1;
    }

    public MyRectangle2D(double x, double y, double height, double width) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return (2 * width) + (2 * height);
    }
    public boolean contains(double x,double y){
        double minX=this.x-width/2;
        double maxX=this.x+width/2;
        double minY=this.y-height/2;
        double maxY=this.y+height-2;
        if(minX <= x && x <= maxX && minY <= y && y <= maxY){
            return true;
        }
        return false;
    }
    public boolean contains(MyRectangle2D r){
        if (r.getArea() > this.getArea()) {
            return false;
        }
        return ((r.getX() + r.getWidth() / 2) <= (this.getX() + this.getWidth() / 2)) &&
                ((r.getX() - r.getWidth() / 2) >= (this.getX() - this.getWidth() / 2)) &&
                ((r.getY() + r.getHeight() / 2) <= (this.getY() - this.getHeight() / 2)  &&
                        ((r.getY() - r.getHeight() / 2) >= (this.getY() - this.getHeight() / 2))) ? true : false;
    }
    public boolean overlaps(MyRectangle2D r){
        return !((r.getX() - r.getWidth() / 2)>= (this.getX() + this.getWidth() / 2)||
                (r.getX() + r.getWidth() / 2)<= (this.getX() - this.getWidth() / 2) ||
                (r.getY() - r.getHeight() / 2) >=(this.getY() + this.getHeight() / 2) ||
                (r.getY() + r.getHeight() / 2) <=(this.getY() - this.getHeight() / 2)) ? true : false;





