package chapters.chapter_07;
import java.util.Scanner;

public class Exercise_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter how many number you'll enter :");

        int n = input.nextInt();
        double[] list = new double[n];
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextDouble();
        }

        double mean = mean(list);
        double deviation = deviation(list);

        System.out.println("The mean is " + mean);
        System.out.println("The standart deviation is " + deviation);
    }

    public static double mean(double[] list) {
        double sum = getSum(list);

        return sum / list.length;
    }

    public static double getSum(double[] list) {
        double sum = 0;

        for(double e: list) {
            sum += e;
        }
        return sum;
    }
    public static double getSumPow(double[] list) {
        double sum = 0;

        for(double e: list) {
            sum += Math.pow(e, 2);
        }
        return sum;
    }

    public static double deviation(double[] list) {
        double num = 0;
        for(double a: list){
            num += Math.pow(a - mean(list), 2);
        }
        //return Math.sqrt(((getSumPow(list) - (Math.pow(getSum(list), 2) / list.length)) / list.length - 1 * 1.0));
        return Math.sqrt(num / list.length - 1 * 1.0);
    }

}

