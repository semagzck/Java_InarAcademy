package chapters.chapter_10.Exercise;
import java.math.BigInteger;
public class Exercise_18 {
    public static void main(String[] args) {

        System.out.println("Five prime numbers larger than Long.MAX_VALUE: ");
        findLarge5PrimeNumbersLargerThanLongMaxValue();
        System.out.println("a");
    }
    public static void findLarge5PrimeNumbersLargerThanLongMaxValue() {
        BigInteger value = new BigInteger(Long.MAX_VALUE + "").add(new BigInteger("2"));
        int count = 0;
        while (count < 5) {
            if (isPrime(value)) {
                count++;
                System.out.println(value);
            }
            value = value.add(new BigInteger("2"));
        }
    }
    public static boolean isPrime(BigInteger value) {
        BigInteger divisor = new BigInteger("3");
        while (divisor.compareTo(value.divide(new BigInteger("2"))) <= 0) {
            if (value.remainder(divisor).equals(BigInteger.ZERO)) {
                return false;
            }
            divisor = divisor.add(new BigInteger("2"));
        }
        return true;
    }

