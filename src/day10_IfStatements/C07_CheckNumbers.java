package day10_IfStatements;

import java.util.Scanner;

public class C07_CheckNumbers {
    public static void main(String[] args) {
        /**
         Bir program yazın 2 tane numara kabul etsin ve büyük olanı versin.
         eşit ise eşit yazdırsın.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı girin");
        int sayi1 = scan.nextInt();

        System.out.println("Bir sayı daha girin; büyük olanı yazdırayım");
        int sayi2 = scan.nextInt();

        if (sayi1 > sayi2) {
            System.out.println("büyük sayi = " + sayi1);

        } else if (sayi2 > sayi1) {
            System.out.println("Büyük sayi = " + sayi2);

        } else {
            System.out.println("sayılar eşit");
        }

    }
}

