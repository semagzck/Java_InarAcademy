
package chapters.chapter_09;
import java.util.Random;
public class Exercise_04 {
    public static void main(String[] args) {
        Random random=new Random(1000);

        for(int i=0;i<50;i++){
            System.out.printf("%3d",random.nextInt(100));
            if(i%10==9){
                System.out.println();
            }
        }

    }

}

