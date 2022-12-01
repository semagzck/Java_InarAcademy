package chapters.chapter13.Exercise.Exercise_02;
import java.util.ArrayList;
public class Exercise_02 {
    public static void main(String[] args) {
        ArrayList<Number> testList = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            testList.add(i);
        }
        System.out.println("Original list of Numbers: ");
        System.out.println(testList.toString());

        shuffle(testList);

        System.out.println("Shuffled : ");
        System.out.println(testList.toString());



    }

    public static void shuffle(ArrayList<Number> list) {
        Number temp;
        int randomIndex;
        for (int i= 0 ; i < list.size(); i++) {
            randomIndex = (int) (Math.random() * list.size());
            temp = list.get(randomIndex);

            list.set(randomIndex, list.get(i));
            list.set(i, temp);

        }
    }


}

