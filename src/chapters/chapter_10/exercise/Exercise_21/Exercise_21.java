package chapters.chapter_10.Exercise;
import java.math.BigDecimal;
public class Exercise_21 {
    public static void main(String[] args) {

        BigDecimal num = new BigDecimal(Long.MAX_VALUE);
        System.out.println("Long.MAX_VALUE = " + Long.MAX_VALUE);

        System.out.println("First ten numbers greater than Long.MAX_VALUE divisible by 5 or 6: ");

        int count = 0;
        while (count < 10) {
            if (num.remainder(new BigDecimal(5)).equals(BigDecimal.ZERO) ||
                    num.remainder(new BigDecimal(6)).equals(BigDecimal.ZERO)) {
                count++;
                System.out.println(num);
            }
            num = num.add(BigDecimal.ONE);
        }
    }

}

