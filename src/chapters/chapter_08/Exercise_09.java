package chapters.chapter_08;
import java.util.Scanner;

public class Exercise_09 {
    public static void main(String[] args) {
        char[][] table = new char[3][3];
        fill(table, ' ');
        boolean XTurn = true;
        boolean isItDraw = true;

        while (!isFull(table)) {
            displayTable(table);
            promptThePLayerTicOrToe(table, XTurn);
            if (checkWins(table)) {
                displayTable(table);
                System.out.println((XTurn ? "X" : "Y") + " player won");
                isItDraw = false;
                break;
            }
            XTurn = !XTurn;
        }

        if (isItDraw) {
            displayTable(table);
            System.out.println("Game is over! It's draw!");
        }

    }

    public static void fill(char[][] table, char ch) {
        for (int row = 0; row < table.length; row++) {
            for (int col = 0; col < table[row].length; col++) {
                table[row][col] = ch;
            }
        }
    }

    public static boolean isFull(char[][] table) {
        for (int r = 0; r < table.length; r++) {
            for (int c = 0; c < table[r].length; c++) {
                if (table[r][c] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean checkWins(char[][] table) {     //satırları kontrol etmek için satır süüun soldan sağ aşağı soldan sağ aşağı çaprazlara bakacaksın
        return (checkRows(table) || checkCol(table) ||
                checkMajorDiagonal(table) || checkSubDiagonal(table));

    }

    public static void displayTable ( char[][] table){
        for (int row = 0; row < table.length; row++) {
            System.out.println("-------------");
            for (int col = 0; col < table[row].length; col++) {
                System.out.print("| " + table[row][col] + " ");
            }
            System.out.println("|");
        }
        System.out.println("-------------");
    }

    public static void promptThePLayerTicOrToe ( char[][] table, boolean XTurn){
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a row (0, 1, 2) for player ");
            System.out.print(XTurn ? "X:" : "Y:");
            int row = input.nextInt();

            System.out.print("Enter a col (0, 1, 2) for player ");
            System.out.print(XTurn ? "X:" : "Y:");
            int col = input.nextInt();

            if (0 > col || col > 2 || 0 > row || row > 2) {
                System.out.println("Please to another place!");
                continue;
            }

            if (table[row][col] == ' ') {
                table[row][col] = (XTurn ? 'X' : 'Y');
                break;
            }

            System.out.println("Please to another place!");
        }
    }


    public static boolean checkRows(char[][] table){
        for (int r = 0; r < table.length; r++) {
            for (int c = 0; c < table[r].length - 1; c++) {
                if (table[r][0] != ' ' && table[r][c] != table[r][c + 1])
                    return false;
            }
        }

        return true;
    }

    public static boolean checkCol(char[][] table) {
        for (int c = 0; c < table.length; c++) {
            for (int r = 0; r < table[r].length - 1; r++) { // 4 e kdar gitsin +1 le kontrol etsin
                if (table[c][0] != ' ' && table[r][c] != table[r + 1][c])
                    return false;

            }
        }
        return true;
    }

    public static boolean checkMajorDiagonal(char[][] table) {//çapraz kontrol 00 dan başlayacak 00 ı 11 le kıyaslayacak
        for (int rAndC = 0; rAndC < table.length - 1; rAndC++) { // c ve r yi aynı anda aldın
            if (table[rAndC][rAndC] != ' ' && table[rAndC][rAndC] != table[rAndC + 1][rAndC + 1]){
                return false;
            }
        }
        return true;
    }

    public static boolean checkSubDiagonal(char[][] table) {  // 0 a 2 yi 1/1 e bir le kıyaslayacak 
        for (int r = 0, c = table.length - 1; r < table.length - 1; r++, c--) {
            if (table[r][c] != ' ' && table[r][c] != table[r + 1][c - 1]){
                return false;
            }
        }
        return false;
    }


}

