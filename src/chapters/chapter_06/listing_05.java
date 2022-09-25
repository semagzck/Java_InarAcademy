public class listing_05 {
    public static void main(String[] args) {
        //TestPassyValue
        int num1=5;
        int num2=8;
        System.out.println("Before invoking the swap method is "+ num1+"and num2 is "+num2);
        swap(num1,num2);
        System.out.println("After invoking the swap method is "+ num1+"and num2 is "+num2);
    }
    public static void swap(int n1,int n2){
        System.out.println("\t Inside the swap method");
        System.out.println("\t\tBefore swapping, n1 is "+n1+" and n2 is "+n2);
        //swap n1 with n2
        int temp=n1;
        n1=n2;
        n2=temp;
        System.out.println("\t\tAfter swapping, n1 is "+n1+" and n2 is "+n2);


    }
}


