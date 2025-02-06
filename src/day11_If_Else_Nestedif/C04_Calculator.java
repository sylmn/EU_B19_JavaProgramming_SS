package day11_If_Else_Nestedif;

import java.util.Scanner;

public class C04_Calculator {
    public static void main(String[] args) {

        /**     +,-,*,/
         * 4 işlem yapacak şekilde bir hesap makinesi yapın
         * Kullanıcıdan 2 sayı alın
         * Yapmak istediği işlemi seçsin +,-,*,/
         * Hatalı işlem girişlerinde kullanıcıya uyarı verin
         * Ekrana sonuç döndüren programı yazınız.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Hesap Makinasına hoş geldiniz. Yapmak istediğiniz işlemi seçin");
        String islem = scan.nextLine();

        System.out.print("ilk sayıyı girin : ");
        double sayi1 = scan.nextDouble();

        System.out.print("ikinci sayıyı girin : ");
        double sayi2 = scan.nextDouble();

        if (islem.equals("+")) {
            System.out.println(sayi1 + sayi2);

        } else if (islem.equals("-")) {
            System.out.println(sayi1 - sayi2);

        } else if (islem.equals("*")) {
            System.out.println(sayi1 * sayi2);

        } else if (islem.equals("/")) {

            if (sayi2 == 0) {
                System.out.print("sayi 2 yi tekrar girin : ");
                sayi2 = scan.nextDouble();
            }
            System.out.println(sayi1 / sayi2);

        } else {
            System.out.println("Hatalı işlem girdiniz");
        }
    }
}
