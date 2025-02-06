package day19_Methods1;

import java.util.Scanner;

public class C15_Task2 {
    public static void main(String[] args) {
        /**
         * Write a method that calculates the sum of 3 numbers
         * sumOfNumbers();
         */
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Devam etmek için 1 ve çıkmak için 0 tuşla");
            int secim = scan.nextInt();
            if (secim == 1) {
                sumOfNumbers();
            } else break;
        }
    }
    private static void sumOfNumbers() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Üç sayı giriniz. Toplamını vereyim.");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();
        int sayi3 = scan.nextInt();
        int toplam = sayi1+sayi2+sayi3;
        System.out.println("Girdiğiniz üç sayının toplamı = "+toplam);
    }
}
