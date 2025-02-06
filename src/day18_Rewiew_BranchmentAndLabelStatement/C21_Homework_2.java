package day18_Rewiew_BranchmentAndLabelStatement;

import java.util.Scanner;

public class C21_Homework_2 {
    public static void main(String[] args) {
        /**
         * Soru 2- While loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun.
         */

        Scanner scan = new Scanner(System.in);
        int rakamToplami = 0;
        int index = 0;
        while (index < 5) {
            //rakamToplami = 0;
            System.out.println("Lütfen bir sayi girin, size rakamları toplamını vereyim. :)");
            int girilenSayi = scan.nextInt();
            int ilkHali = girilenSayi;
            girilenSayi = Math.abs(girilenSayi);
            while (girilenSayi > 0) {
                rakamToplami += girilenSayi % 10;
                girilenSayi /= 10;
            }
            System.out.println("Girdiğiniz " + ilkHali + " sayısının rakamları toplami = " + rakamToplami);
            index++;
        }
    }
}

