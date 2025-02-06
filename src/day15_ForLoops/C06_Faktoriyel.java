package day15_ForLoops;

import java.util.Scanner;

public class C06_Faktoriyel {
    public static void main(String[] args) {

        //girilen sayının faktöryel değerini  bulunuz

        Scanner scan = new Scanner(System.in);
        System.out.println("Faktoryeli alınacak pozitif tam sayıyı giriniz");

        int girilenSayi = scan.nextInt();
        int sonuc = 1;

        for (int i = girilenSayi; i >= 1; i--) {
            sonuc *= i;
        }
        System.out.println("sonuc = " + sonuc);
    }
}
