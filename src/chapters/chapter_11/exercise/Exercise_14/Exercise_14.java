package chapters.chapter_11.exercise;
import java.util.ArrayList;
import java.util.Scanner;
public class Exercise_14 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers1 = new ArrayList<>();
        ArrayList<Integer> numbers2= new ArrayList<>();

        fillArrayList(numbers1);
        fillArrayList(numbers2);
        union(numbers1,numbers2);
        System.out.println("The combined list:\n"+numbers1.toString());
    }

    private static void fillArrayList(ArrayList<Integer> numbers) {
        Scanner input = new Scanner(System.in);
        final int NUMBER_OF_INTEGER = 5;
        System.out.println("Enter " + NUMBER_OF_INTEGER + " integers:");
        for (int i = 0; i < NUMBER_OF_INTEGER; i++) {
            numbers.add(input.nextInt());
        }
    }
    public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2){
        for(int i=0;i<list2.size();i++){
            list1.add(list2.get(i));
        }
        return list1;
    }


}
