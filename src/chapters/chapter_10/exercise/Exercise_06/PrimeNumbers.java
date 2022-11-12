package chapters.chapter_10.Exercise;

public class PrimeNumbers {
    public static void main(String[] args) {
        Stack stack=new Stack(25);
        final int UPPER_LIMIT_OF_PRİME=120;
        for(int i=2;i<UPPER_LIMIT_OF_PRİME;i++) {
            if (isPrime(i)) {
                stack.push(i);
            }
        }
        for (int i=0;i<stack.getSize();i++){
            System.out.print(stack.getElement(i)+",");
        }

    }

    public static boolean isPrime(int number){
        for(int i=2;i<=number/2;i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
    }
}
class Stack{
    private int [] elements;
    private int size;
    private   static final int DEFAULT_CAPACITY=16;

    public Stack(){
        this(DEFAULT_CAPACITY);

    }
    public Stack(int capacity){
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
        return elements[--size];
    }
    public boolean isEmpty(){
        return size==0;
    }
    public int getElement(int i){
        return elements[i];
    }

    public int[] getElements() {
        return elements;
    }

    public void setElements(int[] elements) {
        this.elements = elements;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}

