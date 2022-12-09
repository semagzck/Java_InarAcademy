package chapters.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_04 {
    private static final int NUMBER_OF_ELEMENTS=9;
    private static ArrayList<Double> list=new ArrayList<>();
    private static Scanner input=new Scanner(System.in);

    public static void main(String[] args) {
        getElements();
        rowSorting();
        print();
    }

    private static void getElements() {
        System.out.println("Enter a 3-by-3 matrix elements:");
        for(int i=0;i<NUMBER_OF_ELEMENTS;i++) {
            list.add(input.nextDouble());
        }
    }
    private static void rowSorting() {

        for (int j = 0; j < list.size(); j = j + 3) {
            for(int k=j;k<j+3;k++) {
                for (int i = j; i < j + 3; i++) {
                    if (list.get(k) < list.get(i)) {
                        double temp = list.get(k);
                        list.set(k, list.get(i));
                        list.set(i, temp);
                    }
                }
            }
        }
    }

    private static void print() {
        System.out.println("The row-sorted array is");
        for(int i=0;i<NUMBER_OF_ELEMENTS;i++){
            System.out.print(list.get(i)+" ");
            if(i%3==2){
                System.out.println();
            }
        }
    }

}

