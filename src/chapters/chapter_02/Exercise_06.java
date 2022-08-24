public class Exersice_06 {

    public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer between 0 and 1000: ");
        int number = input.nextInt();

        int firstDigit = number % 10;
        int remainingNumber = number / 10;
        int SecondDigit = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int thirdDigit = remainingNumber % 10;

        int sum = thirdDigit + SecondDigit + firstDigit;

        System.out.println("The sum of all digits in " + number + " is " + sum);

    }
}
