package chapters.chapter_07;

public class Exercise_27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        // test case: 5 2 5 6 6 1 and 5 5 2 6 1 6
        System.out.print("Enter a list of numbers beginning with the number of entries: ");

        int[] list1 = new int[input.nextInt()];
        for (int i = 0; i < list1.length; i++) {
            list1[i] = input.nextInt();
        }
        System.out.print("Now enter a second list, number of entries first: ");
        int[] list2 = new int[input.nextInt()];
        for (int i = 0; i < list2.length; i++) {
            list2[i] = input.nextInt();

            public static boolean equals ( int[] list1, int[] list2){
                System.out.println(equalContent(list1, list2) ? "Two lists are identical" : "Two lists are not identical");
            }
            private static boolean equalContent ( int[] list1, int[] list2){
                // TODO Auto-generated method stub
                return false;
            }
        }
    }
}

