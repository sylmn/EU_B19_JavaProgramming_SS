package day07_TypeCasting;

import java.util.Scanner;

public class C05_ScannerTask {
    public static void main(String[] args) {

        /**kullanıcıdan bir sayı al, sayıyı ikiyle topla karesini al */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen bir sayı girin ve ikiyle toplanıp karesini alıp sonucunu size bildireyim.");
        int data = scan.nextInt();

        int islem = (data + 2) * (data + 2);
        System.out.println("(" + data + "+2)*(" + data + "+2) işleminin sonucu = " + islem);

        int ikiFazlası = data + 2;
        System.out.println("Math.pow() = " + Math.pow(ikiFazlası, 2));

    }
}
