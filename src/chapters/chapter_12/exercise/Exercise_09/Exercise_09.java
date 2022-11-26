package chapters.chapter_12.exercise;
import java.util.Scanner;

public class Exercise_09 {
    public static void main(String[] args) throws BinaryFormatException {
        Scanner input=new Scanner(System.in);
        try {
            System.out.println("Enter a binary number :");
            String binary = input.nextLine();
            System.out.println("The decimal value for binary number " + binary + " is " + binary2Decimal(binary));
        }catch (BinaryFormatException e){
            System.out.println(e.getMessage());
        }

    }
    public static int binary2Decimal(String binary)throws BinaryFormatException {
        int decimalValue=0;
        int power=0;
        for(int i=binary.length()-1;i>=0;i--){
            int binaryChar=(int)binary.charAt(i)-48;
            if(checkBinaryCharacter(binaryChar)) {
                decimalValue +=binaryChar*Math.pow(2,power);
                power++;
            }else{
                throw new BinaryFormatException();
            }
        }
        return decimalValue;
    }
    public static boolean checkBinaryCharacter(int ch) {
        if(ch==0||ch==1){
            return true;
        }
        return false;
    }
}
