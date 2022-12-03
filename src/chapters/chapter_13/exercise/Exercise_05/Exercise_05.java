package chapters.chapter_13.Exercise.Exercise_05;

public class Exercise_05 {
    public static void main(String[] args) {
        Circle circle1=new Circle(5);
        Circle circle2=new Circle(4);
        if(ModifyGeometricObject.max(circle1,circle2)==1){
            System.out.println("Circle1 is maximum");
        } else if(ModifyGeometricObject.max(circle1,circle2)==-1) {
            System.out.println("Circle2 is maximum");
        }
        else{
            System.out.println("Two circles are equals.");
        }

        Rectangle rectangle1=new Rectangle(4,5);
        Rectangle rectangle2=new Rectangle(2,10);
        if(ModifyGeometricObject.max(rectangle1,rectangle2)==1){
            System.out.println("Rectangle1 is maximum");
        } else if(ModifyGeometricObject.max(rectangle1,rectangle2)==-1) {
            System.out.println("Rectangle2 is maximum");
        }
        else{
            System.out.println("Two rectangles are equals.");
        }
    }
}

