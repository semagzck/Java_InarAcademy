import java.util.Scanner;

public class Exercise_06{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter a line :");
        int line= input.nextInt();
        displayPattern(line);
    }
    public static void displayPattern(int line){
        for(int i=1;i<=line;i++){
            for(int j=i;j<=line;j++){
                System.out.print("**");
            }
            for(int l=i;l>0;l--){
                System.out.print(l+" ");
            }
            System.out.println();

        }
    }
}


