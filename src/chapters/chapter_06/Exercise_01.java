package chapter_06;

public class Exercise_01 {
    //Pentagonal numbers
    int a = 1;
	for(int i = 1; i <= 100; i++){
			System.out.printf("%-6d",getPentagonalNumber(i));
			if(a % 10 == 0) System.out.println();
			a++;
		}
}

