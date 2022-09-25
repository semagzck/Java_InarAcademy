public class listing_04 {
    public static void main(String[] args) {
        //Increment
        int x=1;
        System.out.println("Before the call, x is "+x);
        increment(x);
        System.out.println("After the call ,x is "+x);

    }
    public static int increment(int n){
        n++;
       return n;
    }

}


