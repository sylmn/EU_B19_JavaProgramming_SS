package day12_Switch_Case;

import java.util.Scanner;

public class C05_Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Hesap Makinası");

        int sonuc = 0;
        System.out.print("1. sayiyi girin : ");
        int sayi1 = scan.nextInt();

        scan.nextLine();

        System.out.print("Bir işlem operatörü girin -> '+', '-', '*', '/' : ");
        String islemOperatoru = scan.nextLine();

        System.out.print("2. sayiyi girin : ");
        int sayi2 = scan.nextInt();

        switch (islemOperatoru) {
            case "+" -> sonuc = sayi1 + sayi2;
            case "-" -> sonuc = sayi1 - sayi2;
            case "*" -> sonuc = sayi1 * sayi2;
            case "/" -> {
                if (sayi2 == 0) {
                    System.out.println("sayi2 0 olamaz...tekrar giriniz");
                    sayi2 = scan.nextInt();
                }
                sonuc = sayi1 / sayi2;
            }
            default -> System.out.println("Yanlış operatör girdiniz");

        }
        System.out.println("sonuc = " + sonuc);
    }
}
