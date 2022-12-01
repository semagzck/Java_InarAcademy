package chapters.chapter13.Exercise.Exercise_01;

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three sides of triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        System.out.println("Enter true or false if it is filled or not?");
        boolean fill = input.nextBoolean();
        System.out.println("Enter the color of rectangle:");
        String color = input.next();

        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setFilled(fill);
        triangle.setColor(color);

        System.out.println(triangle);
    }
}

