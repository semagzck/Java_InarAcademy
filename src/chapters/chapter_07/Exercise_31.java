package chapters.chapter_07;
import java.util.Scanner;
public class Exercise_31 {
    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);
        System.out.println("Enter list1 elements(first input indicate number of element)");
        int lengthOfList1= input.nextInt();
        int[]list1=new int[lengthOfList1];
        for(int i=0;i<lengthOfList1;i++){
            list1[i]=input.nextInt();
        }

        System.out.println("Enter list2 elements(first input indicate number of element)");
        int lengthOfList2= input.nextInt();
        int[]list2=new int[lengthOfList2];
        for(int i=0;i<lengthOfList2;i++){
            list2[i]=input.nextInt();
        }
        int[] mergedList=mergeList(list1,list2);
        for(int i=1;i<=lengthOfList1+lengthOfList2;i++){
            System.out.print(mergedList[i]+" ");
        }

    }
    public static int[] mergeList(int[] list1, int[] list2){
        int []mergedList=new int[list1.length+ list2.length+1];
        int i=0;
        int j=1;

        while (i< list1.length && i< list2.length){
            if(list1[i]<=list2[i]){
                if(list1[i]>mergedList[j-1]) {
                    mergedList[j] = list1[i];
                    mergedList[j + 1] = list2[i];
                }
                else{
                    int temp=mergedList[j-1];
                    mergedList[j-1]=list1[i];
                    mergedList[j]=temp;
                    mergedList[j + 1] = list2[i];

                }
            }else{
                if(list2[i]>mergedList[j-1]) {
                    mergedList[j] = list2[i];
                    mergedList[j + 1] = list1[i];
                }else{
                    int temp=mergedList[j-1];
                    mergedList[j-1]=list2[i];
                    mergedList[j]=temp;
                    mergedList[j + 1] = list1[i];


                }

            }
            i++;
            j=j+2;
        }
        if(list1.length< list2.length){
            while (i< list2.length) {
                mergedList[j] = list2[i];
                i++;
                j++;
            }
        }else{
            while (i< list1.length) {
                mergedList[j] = list1[i];
                i++;
                j++;
            }

        }
        return mergedList;

    }


}

