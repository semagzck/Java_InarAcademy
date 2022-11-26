package chapters.chapter_11.exercise;
import java.util.Scanner;
public class Exercise_10 {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 5 strings: ");
        for (int i = 0; i < 5; i++) {
            myStack.push(input.next());
        }
        System.out.println(myStack.toString());

        System.out.println("Stack in in reverse order:");
        for(int i=myStack.size()-1;i>=0;i--){
            System.out.println(myStack.get(i));
        }
    }

}

