package chapters.chapter_11.exercise;
import java.util.ArrayList;
import java.util.Scanner;
public class Exercise_11 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        ArrayList<Integer>numbers=new ArrayList<>();
        final int NUMBER_OF_INTEGER=5;
        System.out.println("Enter "+NUMBER_OF_INTEGER+" integers:");
        for(int i=0;i<NUMBER_OF_INTEGER;i++){
            numbers.add(input.nextInt());
        }
        sort(numbers);
        
        System.out.println("Numbers with increasig order\n"+numbers.toString());
    }

    public static void sort(ArrayList<Integer> list) {
        for(int i=0;i<list.size();i++){
            for(int j=0;j<list.size();j++){
                if(list.get(i)<list.get(j)){
                    int temp= list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,temp);
                }
            }
        }
    }
}

