package day11_If_Else_Nestedif;

import java.util.Scanner;

public class C02_Homework {
    public static void main(String[] args) {

        /** Task :
         * 2 adet vize notu alin. Bir adet final notu alın.
         * Vizeler ortalamaya %20 etki ediyor. Final ise %60 etki ediyor.
         * Ortalamayı hesaplayın. Geçme notunu yazdırın.

         90 ve üzeri A
         80 ve üzeri B
         70 ve üzeri C
         60 ve üzeri D
         60 altı F  */

        Scanner scan = new Scanner(System.in);
        System.out.println("1. Vize Notunu girin : ");
        double vize1 = scan.nextDouble();

        System.out.println("2. vize Notunu girin : ");
        double vize2 = scan.nextDouble();

        System.out.println("Final notunu girin : ");
        double finalNotu = scan.nextDouble();

        double ortalama = vize1 * 0.2 + vize2 * 0.2 + finalNotu * 0.6;

        if (ortalama >= 90 && ortalama <= 100) {
            System.out.println("Geçme Notu A");

        } else if (ortalama >= 80 && ortalama < 90) {
            System.out.println("Geçme Notu B");

        } else if (ortalama >= 70 && ortalama < 80) {
            System.out.println("Geçme Notu C");

        } else if (ortalama >= 60 && ortalama < 70) {
            System.out.println("Geçme Notu D");

        } else if (ortalama >= 0 && ortalama < 60) {
            System.out.println("Dersten kaldınız. Geçme Notunuz F");

        } else {
            System.out.println("Notları yanlış girdiniz");
        }
    }
}
