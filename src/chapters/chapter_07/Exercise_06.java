package chapters.chapter_07;

public class Exercise_06 {
    public static void main(String[] args) {
        final int NUMBER_OF_PRIME_NUMBER = 50;
        int[] primeNumbers = new int[NUMBER_OF_PRIME_NUMBER];
        int count = 0;
        int number = 2;
        while (count < NUMBER_OF_PRIME_NUMBER) {
            if(isPrime(number)){
                primeNumbers[count]=number;
                count++;
            }
            number++;
        }
        printPrimeNUmbers(primeNumbers);
    }

    public static boolean isPrime(int number){
        for(int i=2;i<=(int)(Math.sqrt(number));i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
    }
    public static void printPrimeNUmbers(int[] primeNumbers) {
        final int NUMBER_OF_PRIME_NUMBER_PER_LINE=10;
        int count=0;
        for (int i=0;i<primeNumbers.length;i++){
            System.out.printf("%5d",primeNumbers[i]);
            count++;
            if(count%NUMBER_OF_PRIME_NUMBER_PER_LINE==0){
                System.out.println();
            }

        }
    }

}
