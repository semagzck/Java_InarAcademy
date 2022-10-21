package chapters.chapter_08;

public class Exercise_04 {
    public static void main(String[] args) {

        int[][] a = {{2, 4, 3, 4, 5, 8, 8},
            {7, 3, 4, 3, 3, 4, 4},
            {3, 3, 4, 3, 3, 2, 2},
            {9, 3, 4, 7, 3, 4, 1},
            {3, 5, 4, 3, 6, 3, 8},
            {3, 4, 4, 6, 3, 4, 4},
            {3, 7, 4, 8, 3, 8, 4},
            {6, 3, 5, 9, 2, 7, 9},};


    int[][] matrix = new int[a.length][2];

        for (int i = 0; i < a.length; i++) {
        int total = 0;
        for (int j = 0; j < a[0].length; j++) {
            total += a[i][j];
        }
        matrix[i][0] = i;
        matrix[i][1] = total;


    }


    sort(matrix);

        for (int i = 0; i < matrix.length; i++) {
        System.out.println("the employee " + matrix[i][0] + "  work  is" + matrix[i][1]);
    }

}

    public static void sort(int[][] m) {
        for (int i = 0; i < m.length; i++) {


            int maxCol0 = m[i][0];
            int maxCol1 = m[i][1];
            int maxIndex = i;

            for (int j = i + 1; j < m.length; j++) {
                if (maxCol1 < m[j][1]) {
                    maxCol1 = m[j][1];
                    maxCol0 = m[j][0];
                    maxIndex = j;
                }
            }


            if (i != maxIndex) {
                m[maxIndex][1] = m[i][1];
                m[maxIndex][0] = m[i][0];
                m[i][1] = maxCol1;
                m[i][0] = maxCol0;
            }
        }

    }

}

