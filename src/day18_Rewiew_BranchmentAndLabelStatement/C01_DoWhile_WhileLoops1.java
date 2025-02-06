package day18_Rewiew_BranchmentAndLabelStatement;

import java.util.Scanner;

public class C01_DoWhile_WhileLoops1 {
    public static void main(String[] args) {
        // do - while loop ile verilen sayıdan başlayıp, birer azaltarak
        // 3'e kadar olan sayıları yazdıralım..

        Scanner sayiGir = new Scanner(System.in);
        System.out.print("Bir tam sayı giriniz : ");
        int sayi = sayiGir.nextInt();

        do {
            System.out.println(sayi);
            sayi--;
        } while (sayi > 3);

        System.out.print("Bir tam sayı giriniz : ");
        sayi = sayiGir.nextInt();

        while (sayi > 3) {
            System.out.println(sayi);
            sayi--;
        }
    }
}
