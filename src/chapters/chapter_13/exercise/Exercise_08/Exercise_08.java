package chapters.chapter_13.Exercise.Exercise_08;

public class Exercise_08 {
    public static void main(String[] args) throws CloneNotSupportedException {
        MyStack myStack=new MyStack();
        myStack.push("Semanur");
        myStack.push("Gözüaçık");
        myStack.push(1999);
        MyStack clonedMyStack=(MyStack)myStack.clone();
        clonedMyStack.pop();
        clonedMyStack.push("Fenerbahçe");
        System.out.println(myStack.toString());
        System.out.println(clonedMyStack.toString());

    }
}

