package chapters.chapter_07;
import java.util.Scanner;

public class Exercise_21 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println( "enter number of balls");
        int ball= input.nextInt();
        System.out.println("enter number of slots");
        int slot= input.nextInt();
        char[][]ch=new char[ball][slot];

        int []count=new int[ball];



        for (int i = 0; i <ball ; i++) {
            for (int j = 0; j <slot-1 ; j++) {
                int a=(int)(Math.random()*2);
                if(a==0)
                    ch[i][j]=(char)76;

                else
                    ch[i][j]=((char)82);


            }


        }

        for (int i = 0; i <ball ; i++) {
            for (int j = 0; j <slot-1 ; j++) {
                System.out.print(ch[i][j]+" ");
                if (ch[i][j]=='R')
                    count[i]++;
            }
            System.out.println();
        }



        for (int i = count.length-1;i>=0; i--) {

            for (int j = 1; j < count[i]; j++) {
                System.out.print(" ");
            }
            System.out.print("0");
            System.out.println();
        }





    }

}

