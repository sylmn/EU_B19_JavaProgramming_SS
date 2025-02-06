package day15_ForLoops;

import java.util.Scanner;

public class C03_ForLoop3 {
    public static void main(String[] args) {

        //dongü 0'dan 50'a indexi yazdırın
        for (int i = 0; i <= 50; i++) {
            System.out.println("i = " + i);
        }

        System.out.println("////////////////////////");

        //dongü 10'dan 0'a indexi yazdırın
        for (int i = 10; i >= 0; i--) {
            System.out.println("i = " + i);
        }

        System.out.println("//////////////////////////");

        //28'den 97'e kadar olan sayıları 8'er yazdıralım..
        for (int i = 28; i <= 97; i += 8) {
            System.out.println("i = " + i);
        }

        System.out.println("///////////////////////");

        //97'den 28'e kadar olan sayıları 8'er yazdıralım..
        for (int i = 97; i >= 28; i -= 8) {
            System.out.println("i = " + i);
        }

        //1'den 50'ye kadar olan sayıların toplamı nedir?
        //gauss formülü -> 1'den n'e kadar sayıların top : n*(n+1)/2
        System.out.println(50 * 51 / 2);

        /*
        int i =0;
        for (i++; i < 97; i +=8) {    // burada i++ sadece bir ker çalışır.
            System.out.println("i = " + i);
        }*/

        int toplam = 0;
        for (int i = 1; i <= 50; i++) {
            toplam = i + toplam;
        }
        System.out.println("toplam = " + toplam);

        toplam = 0;
        for (int i = 1; i <= 10; i += 2) {
            toplam = i + toplam;
        }
        System.out.println("toplam = " + toplam);
        System.out.println("////////////////////////");

        //verilen sayıya kadar olan sayıları toplayan kodu yazınız.
        //Scanner kullanalım.
        Scanner scan = new Scanner(System.in);
        System.out.println("sayi girin");
        int girilenSayi = scan.nextInt();
        toplam = 0;
        for (int i = 1; i <= girilenSayi; i += 2) {
            toplam = i + toplam;
        }
        System.out.println(girilenSayi + "'e kadar olan sayıların toplamı = " + toplam);

    }
}
