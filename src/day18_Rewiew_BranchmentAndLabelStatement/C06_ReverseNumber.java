package day18_Rewiew_BranchmentAndLabelStatement;

import java.util.Scanner;

public class C06_ReverseNumber {
    public static void main(String[] args) {
        // verilen sayıyı tersten yazan bir döngü yazınız
        // 123 --> 321
        // 720 --> 27  // while loop

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir tam sayı giriniz : ");
        int sayi = scanner.nextInt();
        int tersSay = 0;

        while (sayi != 0) {
            int sonHane = sayi % 10;
            System.out.println("sonHane = " + sonHane);
            tersSay = tersSay * 10 + sonHane;
            sayi /= 10;

            System.out.println("tersSay = " + tersSay);
        }

    }
}
