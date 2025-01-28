package day15_forLoops;

import java.util.Scanner;

public class C03_ForLoop3 {
    public static void main(String[] args) {

        for (int i = 10; i >= 0; i --){

            System.out.println("i = " + i);
        }
        System.out.println("//////////////////////////");
        for (int i = 28; i <= 97; i +=8) {
            System.out.println("i = " + i);
        }
        System.out.println("///////////////////////");
        for (int i = 97; i >= 28; i -=8) {
            System.out.println("i = " + i);
        }
        /*
        int i =0;
        for (i++; i < 97; i +=8) {    // burada i++ sadece bir ker çalışır.
            System.out.println("i = " + i);
        }*/

        int toplam = 0;
        for (int i = 1; i <= 50 ; i++) {
            toplam=i+toplam;
        }
        System.out.println("toplam = " + toplam);

        toplam = 0;
        for (int i = 1; i <= 10 ; i+=2) {
            toplam=i+toplam;
        }
        System.out.println("toplam = " + toplam);
        System.out.println("////////////////////////");

        Scanner scan = new Scanner(System.in);
        System.out.println("sayi girin");
        int girilenSayi=scan.nextInt();
        toplam = 0;
        for (int i = 1; i <= girilenSayi ; i+=2) {
            toplam=i+toplam;
        }

    }
}
