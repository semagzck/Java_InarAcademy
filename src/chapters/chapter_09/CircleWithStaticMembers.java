package chapters.chapter_09;

public class CircleWithStaticMembers {
    double radius;

    static int numberOfObjects = 0;

    
    CircleWithStaticMembers() {
        radius = 1;
        numberOfObjects++;
    }

    CircleWithStaticMembers(double newRadius) {
        radius = newRadius;
        numberOfObjects++;
    }


    static int getNumberOfObjects() {
        return numberOfObjects;
    }

 
    double getArea() {
        return radius * radius * Math.PI;
    }

    double getRadius(){
        return radius;
    }
}
