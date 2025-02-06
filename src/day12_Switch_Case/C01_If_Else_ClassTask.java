package day12_Switch_Case;

import java.util.Scanner;

public class C01_If_Else_ClassTask {
    public static void main(String[] args) {
        /**
         Verilen bir sayı eğer 3'e bölünüyorsa cızz yazsın,
         Eğer 5'e bölünüyorsa bızz yazsın,
         Eğer hem 3'e hem 5'e bölünüyorsa cızzbızz yazsın,
         Eğer 3'e ve 5'e bülünmüyorsa bölünmez yazsın,
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int girilenSayi = scan.nextInt();

        if (girilenSayi % 3 == 0 && girilenSayi % 5 == 0) {
            System.out.println("cızzbızz");

        } else if (girilenSayi % 3 == 0) {
            System.out.println("cızz");

        } else if (girilenSayi % 5 == 0) {
            System.out.println("bızz");
        } else {
            System.out.println("bölünmez");
        }

    }
}
