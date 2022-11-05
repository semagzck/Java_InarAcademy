package chapters.chapter_09;
import java.util.Date;
public class Exercise_03 {
    public static void main(String[] args) {
        Date date=new Date();
        final long FIRST_ELAPSED_DAY=10000;
        final long LAST_ELAPSED_DAY= 100000000000L;
        for(long i=FIRST_ELAPSED_DAY;i<LAST_ELAPSED_DAY;i=i*10){
            date.setTime(i);
            System.out.println(date.toString());
        }
    }

}

