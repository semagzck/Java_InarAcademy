package chapters.chapter_11.exercise;
import java.util.ArrayList;
import java.util.Scanner;
public class Exercise_13{

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            ArrayList<Integer> numbers = new ArrayList<>();
            final int NUMBER_OF_INTEGER = 10;
            System.out.println("Enter " + NUMBER_OF_INTEGER + " integers:");
            for (int i = 0; i < NUMBER_OF_INTEGER; i++) {
                numbers.add(input.nextInt());
            }
            removeDuplicate(numbers);

            System.out.println("The distinct integers array :\n"+ numbers.toString());
        }
        public static void removeDuplicate(ArrayList<Integer> list){
            ArrayList<Integer> numbers = new ArrayList<>();
            for(int i=0;i< list.size();i++){
                if(!numbers.contains(list.get(i))){
                    numbers.add(list.get(i));
                }
            }
            list.clear();
            list.addAll(numbers);
        }
}


