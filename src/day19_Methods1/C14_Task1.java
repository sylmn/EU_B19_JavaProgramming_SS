package day19_Methods1;

import java.util.Scanner;

public class C14_Task1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Devam etmek için 1 ve çıkmak için 0 tuşla");
            int secim = scan.nextInt();
            if (secim == 1) {
                greatNumber();
            } else break;
        }
    }
    public static void greatNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.println("İki sayı giriniz. Hangisinin büyük olduğunu söyleyeyim: ");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();

        if (sayi1 == sayi2) {
            System.out.println("Girdiğiniz iki sayı birbirine eşittir.");

        } else if (sayi1 > sayi2) {
            System.out.println(sayi1 + " büyük sayıdır.");

        } else {
            System.out.println(sayi2 + " büyük sayıdır.");
        }
    }
}
