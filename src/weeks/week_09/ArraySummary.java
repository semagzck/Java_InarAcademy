package weeks.week_09;
import java.util.Arrays;
public class ArraySummary {
	 public static void main(String[] args) {
	        // firstSection();
	        //secondSection();
	        //findTheSecondMax();
	        copyArray();

	        /** password
	         * - Uzunluk 8-16
	         * - En az bir buyuk harf
	         * - En az bir kucuk har
	         * - En az bir ozel karakter
	         * - En az bir sayi
	         */
	    }

	    private static void copyArray() {
	        int[] a = new int[5];
	        fillTheArrWithRandomValues(a);
	        System.out.println("Oncesi  :" + Arrays.toString(a));
	        int length = 8;
	        a = extendArray(a, length);
	        System.out.println("Sonrasi :" + Arrays.toString(a));
	    }

	    private static int[] extendArray(int[] a, int c) {
	        int[] b = new int[c];
	        for (int i = 0; i < a.length; i++) {
	            b[i] = a[i];
	        }
	        a = b;
	        return a;
	    }


	    private static void findTheSecondMax() {
	        // 10 intlik alana 0-100 arasinda rastgele deger atayan algoritma yazzın 
		// Arrayi yazdırın
	        // En büyük 2. sayıyı bulun
	        int[] arr = new int[10];
	        fillTheArrWithRandomValues(arr);
	        int num = getSecondMaxNumber(arr);
	        System.out.println(Arrays.toString(arr));
	        System.out.printf("Second max number is %d",num);
	    }

	    private static int getSecondMaxNumber(int[] arr) {
	        int max = getMaxNumber(arr);
	        int secondMax = -1;
	        //9 5 3
	        for (int i = 0; i < arr.length; i++) {
	            if(secondMax < arr[i] && arr[i] != max){
	                secondMax = arr[i];
	            }
	        }
	        return secondMax;
	    }

	    private static int getMaxNumber(int[] arr) {
	        int max = -1;
	        for (int i = 0; i < arr.length ; i++) {
	            if(arr[i] > max){
	                max = arr[i];
	            }
	        }
	        return max;
	    }

	    private static void fillTheArrWithRandomValues(int[] arr) {
	        for (int i = 0; i < arr.length; i++) {
	            int random = (int)(Math.random()*100);
	            arr[i] = random;
	        }
	    }

	    public static void secondSection(){
	        int[] arr = new int[5];
	        int length = arr.length;
	        int [] bArr = {3,5,6};
	        int[] cArr =new int[]{6,8,9,16};

	        yazdir(cArr);

	        int sum = sum(cArr);
	        System.out.println(sum);

	        int a = 5;
	        a =7;

	        int[] t = new int[5];
	        double tt = t[0];
	        double y = 5;


	    }

	    private static int sum(int[] cArr) {
	        int sum = 0;
	        for (int sayi : cArr){
	            sum += sayi;
	        }
	        return sum;
	    }

	    public static void firstSection(){
	        int[] inarArr = new int[8];
	        inarArr[0] = 90;
	        inarArr[2] = 70;
	        yazdir(inarArr);


	        inarArr = new int[8];

	        boolean[] bArr = new boolean[3];
	        yazdir(bArr);

	        char[] cArr = new char[3];
	        yazdir(cArr);

	        String[] kelimeler = new String[5];
	        yazdir(kelimeler);

	        

	        int[] arr = new int[7];
	    }
	    private static void yazdir(String[] inarArr) {
	        System.out.println(Arrays.toString(inarArr));
	    }

	    private static void yazdir(char[] inarArr) {
	        System.out.println(Arrays.toString(inarArr));
	    }

	    private static void yazdir(boolean[] inarArr) {
	        System.out.println(Arrays.toString(inarArr));
	    }

	    private static void yazdir(int[] inarArr) {
	        for (int a: inarArr) {
	            System.out.println(a);
	        }
	    }
	}


