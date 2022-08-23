public class Exercise_01 {

    public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a degree in Celsius: ");
        double celsius = input.nextDouble();

        double fahrenheit = (9.0 / 5.0) * celsius + 32.0;
        System.out.println(celsius + " degree Celsius is equal to " + fahrenheit + " in Fahrenheit");
    }
}
