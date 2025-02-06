package day19_Methods1;

import java.util.Scanner;

public class C03_UniqueNumber {
    public static void main(String[] args) {
        farklıSayilarKac();
    }

    /**
     * verilen üç sayi içerisinde kaç farklı sayi olduğunu yazdıran metod nedir?
     */

    public static void farklıSayilarKac() {

        Scanner scan = new Scanner(System.in);
        System.out.println("üç sayı giriniz");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();
        int sayi3 = scan.nextInt();
        int sonuc;

        if (sayi1 == sayi2 && sayi2 == sayi3) {
            sonuc = 1;
            System.out.println("bir farklı sayi vardır");

        } else if (sayi1 == sayi2 && sayi2 != sayi3) {
            sonuc = 2;
            System.out.println("iki farklı sayi vardır");

        } else {
            sonuc =3;
            System.out.println("üç farklı sayı vardır");
        }
        //sonuc = (sayi1 == sayi2 && sayi2 == sayi3) ? 1: (sayi1 == sayi2 && sayi2 != sayi3 ) ? 2: 3;
    }
}

