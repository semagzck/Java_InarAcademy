package chapters.chapter_10.Exercise;
import java.util.Scanner;
public class Exercise_05 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        StackOfInteger1 stackOfInteger=new StackOfInteger1(7);
        System.out.println("Enter a positive integer number: ");
        int number= input.nextInt();

        int i=2;
        while (i<=number){
            if(number%i==0){
                stackOfInteger.push(i);
                number=number/i;
            }
            else{
                i++;
            }
        }
        for(int j=0;j< stackOfInteger.getSize();j++){
            System.out.print(stackOfInteger.getElements(j));
            if(j!=stackOfInteger.getSize()-1){
                System.out.print(", ");
            }
        }

    }

}
class StackOfInteger1 {
    private int [] elements;
    private int size;
    public static final int DEFAULT_CAPACITY=16;
    public StackOfInteger1(){
        this(DEFAULT_CAPACITY);

    }
    public StackOfInteger1(int capacity) {
        elements=new int[capacity];
    }
    public void push(int value){
        if(size>=elements.length){
            int []temp=new int[elements.length*2];
            System.arraycopy(elements,0,temp,0,elements.length);
            elements=temp;
        }
        elements[size++]=value;
    }
    public int pop(){
        return elements[--size];
    }
    public int peek(){
        return elements[size-1];
    }
    public boolean empty(){
        return size==0;
    }

    public int getSize(){
        return size;
    }

    public int getElements(int i) {
        return elements[i];
    }

}

