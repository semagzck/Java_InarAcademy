package chapters.chapter_08;
import java.util.Scanner;

public class Exercise_11 {
    public static String decimalConvertToBinary(int number){
        String str="";
        while (number>0){
            str=(number%2)+str;
            number=number/2;
        }
        return str;
    }
    public static String binaryNumberWithNineDigits(String binarynumber){
        int length=binarynumber.length();
        while(length!=9){
            binarynumber=0+binarynumber;
            length++;
        }
        return binarynumber;
    }
    public static void printHsTs(String binarynumber) {
        for(int i=0;i<binarynumber.length();i++){
            if(binarynumber.charAt(i)=='0'){
                System.out.print("H ");
            }else{
                System.out.print("T ");
            }
            if(i%3==2){
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number between 0 and 511: ");
        int number= input.nextInt();
        String binarynumber=decimalConvertToBinary(number);
        String binaryNumberWithNineDigits=binaryNumberWithNineDigits(binarynumber);
        printHsTs(binaryNumberWithNineDigits);

    }


}

