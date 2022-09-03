package chapters.chapter_04;
public class Exercise_06 {
  public static void main(String args[]) {
    //(0,0) radius 40
	  double r = 40;
   
    System.out.println("Three random points are ");
    
    double angle = Math.random() * 360;
    double x = r * Math.cos(angle * Math.PI / 180);
    double y = r * Math.sin(angle * Math.PI / 180);
    System.out.println("(" + x + ", " + y + ")");

    s = Math.random() * 360;
    x = r * Math.cos(angle * Math.PI / 180);
    y = r * Math.sin(angle * Math.PI / 180);
    System.out.println("(" + x + ", " + y + ")");

    s = Math.random() * 360;
    x = r * Math.cos(angle * Math.PI / 180);
    y = r * Math.sin(angle * Math.PI / 180);
   
    System.out.println("(" + x + ", " + y + ")");
  }
}
