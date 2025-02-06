package day18_Rewiew_BranchmentAndLabelStatement;

import java.util.Scanner;

public class C22_Homework_3 {
    public static void main(String[] args) {
        /**
         * Soru 3- Kullanicidan toplanmak uzere pozitif tamsayilar isteyin.
         Kullaniciya bitirmek istediginde 0'a basmasini soyleyin.
         Kullanici bitirmek istediginde toplam kac adet pozitif tam sayi girdigini ve bunlarin toplaminin
         kac oldugunu yazdirin. Kullanici negatif sayi girerse "negatif sayi kullanamazsiniz " yazdirin,
         bu negatif sayiyi sayi adedine ve toplama eklemeyin
         */

        Scanner scan = new Scanner(System.in);
        int kacSayi = 0;
        int toplam = 0;

        while (true) {
            System.out.println("Toplanmasını istediğiniz pozitif tam sayı giriniz. ");
            int girilenSayi = scan.nextInt();

            if (girilenSayi < 0) {
                System.out.println("Pozitif sayi girmeniz gerekiyor.");
                continue;
            } else if (girilenSayi == 0) {
                break;
            }
            else {
                toplam += girilenSayi;
                kacSayi++;
            }

        }
        System.out.print("Şimdiye kadar " + kacSayi + " sayi girdiniz. Toplamları = " + toplam);
    }
}
