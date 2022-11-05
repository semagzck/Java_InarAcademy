package chapters.chapter_09;
import java.util.GregorianCalendar;
public class Exercise_05 {
    public static void main(String[] args) {
        GregorianCalendar date=new GregorianCalendar();

        System.out.println(date.get(GregorianCalendar.YEAR));
        System.out.println(date.get(GregorianCalendar.MONTH));
        System.out.println(date.get(GregorianCalendar.DAY_OF_MONTH));

        date.setTimeInMillis(1234567898765L);
        System.out.println(date.get(GregorianCalendar.YEAR));
        System.out.println(date.get(GregorianCalendar.MONTH));
        System.out.println(date.get(GregorianCalendar.DAY_OF_MONTH));

    }

}

