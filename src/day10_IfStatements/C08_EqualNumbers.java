package day10_IfStatements;

import java.util.Scanner;

public class C08_EqualNumbers {
    public static void main(String[] args) {
        /**
         * Ekrandan 3 sayı alın. Eşit olan sayıyı ekrana getiren bir program yazın.
         * min 2 sayı eşit olmalı.
         * Eşit sayı yok ise ekrana 'eşit sayı yoktur.' yazdırsın.
         * 1, 2, 3   eşit sayı yok
         * 1, 2, 2   2
         * 2, 2, 2   2
         * 2, 3, 2   2           */

        Scanner scan = new Scanner(System.in);
        System.out.println("üç sayı girin eşit varsa eşit olanı yazayım. ilk sayı : ");
        int sayi1 = scan.nextInt();

        System.out.println("ikinci sayı : ");
        int sayi2 = scan.nextInt();

        System.out.println("üçüncü sayı : ");
        int sayi3 = scan.nextInt();

        if (sayi1 == sayi2) {
            System.out.println(sayi1);

        } else if (sayi2 == sayi3) {
            System.out.println(sayi2);

        } else if (sayi1 == sayi3) {
            System.out.println(sayi1);

        } else {
            System.out.println("eşit sayı yoktur");
        }
    }
}
