package chapter_07;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_20 {
	public static void main(String[] args) {
        final int NUMBER_OF_INPUTS = 10;
        System.out.print("Enter ten numbers: ");
        double[] numbers = createArrayWithInput(NUMBER_OF_INPUTS);

        selectionSort(numbers);
        System.out.println(Arrays.toString(numbers));

    }
    public static void selectionSort(double[] list) {
        for (int i = list.length - 1;  i > 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                if (list[j] > list[i]) {
                    double temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }

        }
    }
    public static double[] createArrayWithInput(int numberOfInputs) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[numberOfInputs];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }
        return numbers;
    }
}
