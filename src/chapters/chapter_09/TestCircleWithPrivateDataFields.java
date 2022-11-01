package chapters.chapter_09;

public class TestCircleWithPrivateDataFields {
        public static void main(String[] args) {
            CircleWithPrivateDataFields myCircle = new CircleWithPrivateDataFields(5.0);
            System.out.println("The area of the circle of radius " + myCircle.getRadius() +
                    " is " + myCircle.getArea());
            // Increase myCircle's radius by 10%
            myCircle.setRadius(myCircle.getRadius() * 1.1);
            System.out.println("The area of the circle of radius " + myCircle.getRadius() +
                    " is " + myCircle.getArea());

            System.out.println("The number of objects created is " + CircleWithPrivateDataFields.getNumberOfObject());

        }

}

