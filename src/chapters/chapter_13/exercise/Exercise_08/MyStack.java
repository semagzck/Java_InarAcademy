package chapters.chapter_13.Exercise.Exercise_08;
import java.util.ArrayList;
public class MyStack implements Cloneable{
    private ArrayList<Object> list=new ArrayList<>();

        public boolean isEmpty(){
            return list.isEmpty();
        }
        public int getSize(){
            return list.size();
        }
        public Object peek() {
            return list.get(getSize() - 1);
        }
        public Object pop(){
            Object o=list.get(getSize() - 1);
            list.remove(o);
            return o;
        }
        public void push(Object o){
            list.add(o);
        }


        @Override
        public Object clone() throws CloneNotSupportedException{
            MyStack clonedStack = (MyStack)super.clone();
            clonedStack.list=deepCopy();
            return clonedStack;

        }

        private ArrayList<Object> deepCopy() {
            ArrayList<Object>list1=new ArrayList<>();
            for(int i=0;i<list.size();i++){
                list1.add(list.get(i));
            }
            return list1;
        }

        @Override
        public String toString(){
            return "stack: " + list.toString();
        }

    }

