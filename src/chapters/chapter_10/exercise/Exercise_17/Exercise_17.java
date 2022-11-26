package chapters.chapter_10.Exercise;
import java.math.BigInteger;
import java.util.Arrays;
public class Exercise_17 {
    public static void main(String[] args) {

        BigInteger startNumber = BigInteger.valueOf((long) Math.sqrt(Long.MAX_VALUE));
        BigInteger[] numbers = new BigInteger[10];
        int count=0;
        while (count < 10) {
            startNumber = startNumber.add(BigInteger.ONE);
            BigInteger bigInteger = startNumber.pow(2);
            numbers[count] = bigInteger;
            count++;
        }
        System.out.println("The square numbers greater than Long.MAX_VALUE are: ");
        System.out.println(Arrays.toString(numbers));
    }

}

