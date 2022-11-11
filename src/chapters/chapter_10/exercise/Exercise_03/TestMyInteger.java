package chapters.chapter_10.Exercise;

public class TestMyPoint {
    public static void main(String[] args){
        MyPoint point1 = new MyPoint(0, 0);

     ,   MyPoint point2 = new MyPoint(10, 30.5);

        System.out.printf("The distance between point1 and point2 : %.3f", point2.distance(point1));

    }
}

