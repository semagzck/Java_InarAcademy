package chapter_06;

public class Exercise_38 {
	
	    public static void main(String[] args) {

	        getRandomUpperCaseLetter();
	        System.out.println("-----------------------------");
	        getRandomDigit();


	    }
	    public static int randomUpperCaseLetter(){ 
	        int asciiCode=(int)('A'+(int)(Math.random()*('Z'-'A')));
	        return asciiCode;
	    }
	    public static int randomDigit(){ 
	        int asciiCode=(int)((Math.random()*10));
	        return asciiCode;
	    }
	    public static void getRandomUpperCaseLetter(){
	        final int NUMBER_OF_UPPERCASE_LETTER=100;
	        int count=0;
	        for(int i=0;i<NUMBER_OF_UPPERCASE_LETTER;i++){
	            char ch=(char)randomUpperCaseLetter();
	            System.out.print(ch+" ");
	            count++;
	            if(count%10==0){
	                System.out.println();
	            }

	        }

	    }public static void getRandomDigit(){
	        final int NUMBER_OF_SINGLE_DIGIT=100;
	        int count=0;
	        for(int i=0;i<NUMBER_OF_SINGLE_DIGIT;i++){

	            System.out.print( randomDigit()+" ");
	            count++;
	            if(count%10==0){
	                System.out.println();
	            }

	        }

	    }

	


}


