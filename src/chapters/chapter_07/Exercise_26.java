package chapters.chapter_07;

public class Exercise_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a list of numbers beginning with the number of entries: ");
        int[] list1 = new int[input.nextInt()];
        for (int i = 0; i < list1.length; i++) {
            list1[i] = input.nextInt();
        }
        System.out.print("Now enter a second list, number of entries first: ");
        int[] list2 = new int[input.nextInt()];
        for (int i = 0; i < list2.length; i++) {
            list2[i] = input.nextInt();
        }

        System.out.println(equals(list1, list2) ?
                "Two lists are strictly identical" : "Two lists are not strictly identical");
    }

    public static boolean equals(int[] list1, int[] list2) {
    }
}
