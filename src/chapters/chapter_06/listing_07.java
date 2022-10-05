package chapter_06;

public class listing_07 {
	public static void main(String[] args) {
        System.out.println("The first 50 prime numbers are \n");
        printPrimeNumbers(50);
    }

    public static void printPrimeNumbers(int numberOfPrimes) {
        final int NUMBER_OF_PRIMES_PER_LINE = 10;
        int primeCount = 0;
        int number = 2;

        while (primeCount < numberOfPrimes) {
            if (isPrime(number)) {
                primeCount++;
                System.out.printf("%-4d",number);
                if (primeCount % NUMBER_OF_PRIMES_PER_LINE == 0){
                    System.out.println();
                }

            }
            number++;

        }

    }

    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }



}
