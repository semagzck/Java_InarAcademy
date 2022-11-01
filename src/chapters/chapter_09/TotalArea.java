package chapters.chapter_09;

public class TotalArea {

    public static void main(String[] args) {
        CircleWithPrivateDataFields[] circleArray;

        circleArray =createCircleArray();


        printCircleArray(circleArray);
    }


    public static CircleWithPrivateDataFields[] createCircleArray() {
        CircleWithPrivateDataFields[] result = new CircleWithPrivateDataFields[5];
        for (int i = 0; i < result.length; i++) {
            result[i] = new CircleWithPrivateDataFields(Math.random() * 100);
        }
        return result;
    }

    public static void printCircleArray(CircleWithPrivateDataFields[] circleArray) {
        System.out.printf("%-30s%-15s\n", "Radius", "Area");
        double sum = 0;
        for (int i = 0; i < circleArray.length; i++) {
            System.out.printf("%-30f%-15f\n", circleArray[i].getRadius(), circleArray[i].getArea());
            sum += circleArray[i].getArea();
        }
        System.out.println("---------------------------------------");

        System.out.printf("%-30s%-15f\n", "The total area of circle is ", sum);

    }
}

