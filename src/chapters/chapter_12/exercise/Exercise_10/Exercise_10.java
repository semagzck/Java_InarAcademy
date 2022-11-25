package chapters.chapter_12.exercise;

public class Exercise_10 {
    public static void main(String[] args) throws Exception  {

        try {
            for(int i=0;i<100000000;i++){
                int [][][] numbers=new int[50000][50000][50000];
            }
        }catch (OutOfMemoryError e){
            System.out.println("Out of memory!!!");

        }
    }

}


