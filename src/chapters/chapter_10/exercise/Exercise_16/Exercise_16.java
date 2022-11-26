package chapters.chapter_10.Exercise;
import java.math.BigDecimal;
public class Exercise_16 {
    public static void main(String[] args) {
        BigDecimal bigDecimal = new BigDecimal("10000000000000000000000000000000000000000000000000");
        BigDecimal[] numbers = new BigDecimal[10];
        int counter = 0;
        while (counter < 10) {
            // check if huge number if divisible by 2 of 3
            BigDecimal remainder2 = bigDecimal.remainder(new BigDecimal(2));
            BigDecimal remainder3 = bigDecimal.remainder(new BigDecimal(3));
            if (remainder2.equals(BigDecimal.ZERO)) {
                numbers[counter] = bigDecimal;
                counter++;
            }
            else if (remainder3.equals(BigDecimal.ZERO)) {
                numbers[counter] =bigDecimal;
                counter++;
            }

            bigDecimal = bigDecimal.add(BigDecimal.ONE);
        }
        for(int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }
    }

}

