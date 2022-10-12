package chapter_07;

public class Exercise_23 {
	 public static void main(String[] args) {
	        boolean[] isLocked = new boolean[100];

	        for (int i = 0; i < isLocked.length; i++) {
	            for (int j = i; j < isLocked.length; j++) {
	                if (isLocked[i]) {
	                    isLocked[i] = false;
	                }
	                else isLocked[i] = true;
	            }
	        }
	        for (int i = 0; i < isLocked.length; i++) {
	            if (isLocked[i]) {
	                System.out.print(i + " ");
	            }
	        }
	    }
	
}

