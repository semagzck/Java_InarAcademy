package chapters.chapter_13.Exercise.Exercise_03;

import java.util.ArrayList;

public class Exercise_03 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        for (int i = 10; i > 0; i--) {
            list.add(i);
        }
        System.out.println(list);
        sort(list);
        System.out.println(list);

    }
    public static void sort(ArrayList<Number> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            Number min = list.get(i);
            int index = i;

            for (int j = i + 1; j < list.size() ; j++) {
                if(min.doubleValue() > list.get(j).doubleValue()){
                    min = list.get(j);
                    index = j;
                }
            }
            if(index != i){
                list.set(index , list.get(i));
                list.set(i , min);
            }
        }
    }

}

