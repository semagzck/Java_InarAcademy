package chapters.chapter_08;
import java.util.Scanner;

public class Exercise_17 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of banks and the limit: ");

        int numberOfBanks = input.nextInt();
        double limit = input.nextDouble();
        double[][] banks = new double[numberOfBanks][];

        for (int i = 0; i < numberOfBanks; i++) {
            banks[i] = getBanksCircumstancesFromUser(i);
        }
        boolean[] unsafeBanks = checkBanks(banks, limit);
        displayUnsafeBanks(unsafeBanks);
    }

    public static boolean[] checkBanks(double[][] banks, double limit) { //mal varlığını limitle kıyaslayacağım
        double asset;
        boolean[] unsafeBanks = new boolean[banks.length]; //hepsi bir varsayım güvenilir gibi
//unsafede güvenilir olmayan bankaları tutacağım

        for (int i = 0; i < banks.length; i++) { //bütün bankalara tek tek gideceğim
            if (unsafeBanks[i]) {
                continue;
            }
            asset = banks[i][0]; //önce mal varlığına  bizim bannesımız


            //bu döngü hangi bankaya brç verdiğimi kontrol ediyor

            for (int j = 1; j < banks[i].length; j += 2) {//bankanınvarlığını hesapladım aradaki sayıları toplayıp liitle kıyasla
                if (!unsafeBanks[(int)(banks[i][j])]) //banka güvenilir mi?
                    asset += banks[i][j + 1];  //güvenilirse mal varlığına ekle,güvenilir değilse girmeeyecek
            }

            if (asset < limit) {      //varlığım limitin altındaysa güvenlir değil her şeyi sıfırdan kontrol et
                unsafeBanks[i] = true;
                i = -1;
            }
        }
        return unsafeBanks;
    }

    public static void displayUnsafeBanks(boolean[] unsafeBanks) {
        System.out.print("Unsafe banks are ");
        for (int i = 0; i < unsafeBanks.length; i++) {
            if (unsafeBanks[i]) {
                System.out.print(i + " ");
            }
        }
    }

    public static double[] getBanksCircumstancesFromUser(int i) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the borrower numbers of bank " + i + ": "); // i ye borcu olan bankaların
        int borrower = input.nextInt();

        double[] borrowers = new double[borrower * 2 + 1]; //banka adı ve miktarı olacak (+1 şu anki para miktarı)

        System.out.println("Enter the balance of bank " + i + ": ");
        borrowers[0] = input.nextDouble();

        System.out.println("Enter the banks and their debt's amount to bank " + i + ": ");
        for (int j = 1; j < borrowers.length; j++) { //ilk elemanı atadığımız çin 1 den başladık
            borrowers[j] = input.nextDouble();
        }

        return borrowers;
    }
}

