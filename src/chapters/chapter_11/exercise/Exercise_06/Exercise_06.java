package chapters.chapter_11.exercise;

import java.util.ArrayList;
public class Exercise_06 {

    public static void main(String[] args) {
       
        ArrayList<Object> list = new ArrayList<>();
        list.add(new MyDate());
        list.add(new Loan(20000,4,6));
        list.add("Semanur");
        list.add(new CircleFromSimpleGeometricObject(1,"orange",true));

        for (int i = 0; i < list.size(); i++) {
            System.out.println((list.get(i)).toString());
        }

    }
}

