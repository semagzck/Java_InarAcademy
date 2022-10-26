package chapters.chapter_08;
import java.util.Scanner;
import java.io.*;
public class Exercise_20 {
    public static Scanner input=new Scanner(System.in);
    public final static int row = 6;
    public final static int col = 7;
    public static int[][] board = new int[row][col];
    public static boolean isRedTurn = true;
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {
        display1();
        do{
            isRedTurn=!isRedTurn;
            askUserForInput();
            int usersEntry= input.nextInt();
            if(!isValid(usersEntry)){
                isRedTurn=!isRedTurn;
                System.out.println("Invalid entry!!!");
                continue;
            }
            processEntryToBoard(usersEntry);
            display1();
        }while (!isGameOver());
    }
    public static void display(){
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                char ch=' ';
                if(board[i][j]==1){
                    ch='R';
                } else if (board[i][j]==2) {
                    ch='Y';
                }
                System.out.printf("|%2s",ch);
            }
            System.out.println();
        }
        System.out.println("-----------------------------------------");
    }
    private static void display1() { // renkli yazmak için
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                char c = ' ';
                System.out.print("| ");
                if (board[i][j] == 1) {
                    System.out.print(ANSI_RED + "R" + ANSI_RESET);
                } else if (board[i][j] == 2) {
                    System.out.print(ANSI_YELLOW + "Y" + ANSI_RESET);
                } else {
                    System.out.print(" ");
                }
                System.out.print(" ");
            }
            System.out.println("|");
        }
        System.out.println("-----------------------------");
        System.out.printf("|%2d |%2d |%2d |%2d |%2d |%2d |%2d |",0,1,2,3,4,5,6);
        System.out.println("\n");
    }
    public static void askUserForInput(){
        String color=isRedTurn ? "Red" :"Yellow";
        System.out.printf("Drop a %s disk at column(0-6): ",color);
    }
    public static boolean isValid(int usersEntry){
        if(usersEntry>=0&&usersEntry<col){
            if(isTheColFull(usersEntry)){
                return true;
            }
        }
        return false;
    }
    public static boolean isTheColFull(int usersEntry){
        if(board[0][usersEntry]==0){
            return true;
        }else{
            return false;
        }
    }
    public static void processEntryToBoard(int usersEntry){
//ilk önce 0 olacak 0 olup olmadığını kontrol et sıfır değilse
        // diğer indise kırmızı yada sarı atabirim boşsa o satıra yapıştır
        for (int i = 1; i < row; i++) {
            if (board[i][usersEntry] != 0) {
                board[i - 1][usersEntry] = isRedTurn ? 1 : 2;
                return;
            }
        }
        board[row - 1][usersEntry] = isRedTurn ? 1 : 2;
    }
    public static boolean isGameOver(){
        if(sameRow()||sameCol()||rightDiagonal()||leftDiagonal()){ //winning case
            System.out.printf("WINS!!!! %s ", isRedTurn ? "RED" : "YELLOW");
            return true;
        } else if (isTheBoardFull()) { // drawing case
            System.out.println("İt's draw!!!");
            return true;
        }else{
            return false;
        }
    }
    public static boolean isTheBoardFull() {
        for (int i = 0; i < col; i++) {
            if (board[0][i] == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean sameRow(){
        int num= isRedTurn ?1:2;
        for(int i=0;i<row;i++){
            int counter=0;
            for(int j=0;j<col;j++){
                if(board[i][j]==num){
                    counter++;
                }else{
                    counter=0;
                }
                if(counter==4){
                    System.out.println("Same row!!!");
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean sameCol() {
        int num = isRedTurn ? 1 : 2;

        for (int i = 0; i < col; i++) {
            int counter = 0;
            for (int j = 0; j < row; j++) {
                if (board[j][i] == num) {
                    counter++;
                } else {
                    counter = 0;
                }
                if (counter >= 4) {
                    System.out.printf("SAME COL!!!");
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean rightDiagonal(){
        int num = isRedTurn ? 1 : 2;
        int counter=0;
        for(int i=0;i<row-3;i++){
            int k=0;
            for(int j=0;j<col-3;j++){
                if(board[i+k][j+k]==num){
                    counter++;
                }else{
                    counter=0;
                }
                k++;
                if (counter == 4) {
                    System.out.printf("RIGHT DIAGONAL!!");
                    return true;
                }
            }

        }
        return  false;
    }
    public static boolean leftDiagonal() {
        int num = isRedTurn ? 1 : 2;

        for (int i = 0; i < row - 3; i++) {
            for (int j = 3; j < col; j++) {//3 le başlamazsan zaten 4 tane olmuyor
                int counter = 0;
                for (int k = 0; k < 4; k++) {
                    if (board[i + k][j - k] == num) {
                        counter++;
                    } else {
                        break;
                    }
                    if (counter == 4) {
                        System.out.printf("LEFT DIAGONAL!!!");
                        return true;
                    }
                }
            }
        }
        return false;
    }


}



