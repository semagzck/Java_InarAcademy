package chapters.chapter_07;

public class Exercise_07 {
        int[] occurrences = new int[10];
        int[] generatedNumbers = new int[100];
        generateRandomNumbers(generatedNumbers);
        displayGeneratedNumbers(generatedNumbers);
        countOccurrences(occurrences , generatedNumbers);
        displayResult(occurrences);

    }
    public static void generateRandomNumbers(int[] generatedNumbers){
        for(int i = 0; i < generatedNumbers.length; i++){
            generatedNumbers[i] = (int)(Math.random() * 10);
        }
    }
    public static void countOccurrences(int[] occurrences , int[] generatedNumbers){

        for (int i = 0; i < 100; i++){
            occurrences[generatedNumbers[i]]++;
        }
    }
    public static void displayResult(int[] occurrences){
        for (int i = 0; i < occurrences.length; i++){
            System.out.println(i + "'s : " + occurrences[i]);
        }
    }
    public static void displayGeneratedNumbers(int[] array){
        System.out.println("Generated numbers are ");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + (((i + 1) % 10 == 0) ? "\n" : " "));
        }
        System.out.println();
    }


}

