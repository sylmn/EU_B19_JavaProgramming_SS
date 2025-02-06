package day18_Rewiew_BranchmentAndLabelStatement;

import java.util.Scanner;

public class C04_CarpanlaraAyirma {
    public static void main(String[] args) {
        // bir sayının çarpanlarını yazdıran bir döngü kurgulayin
        // 10 --> 1 2 5 10

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir tam sayı giriniz : ");
        int sayi = scanner.nextInt();
        String carpanlar = "";

        for (int i = 1; i <=sayi ; i++) {
            if (sayi % i == 0){
                carpanlar += i+" ";
            }
        }
        System.out.println("carpanlar = " + carpanlar);
    }
}
