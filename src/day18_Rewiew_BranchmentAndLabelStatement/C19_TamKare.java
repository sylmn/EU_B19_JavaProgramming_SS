package day18_Rewiew_BranchmentAndLabelStatement;

import java.util.Scanner;

public class C19_TamKare {
    public static void main(String[] args) {
        /**
         * Soru 5- Kullanicidan bir pozitif sayi isteyin, verilen sayı tam kare değilse kullanıcı sayı girmeye devam etsin,
                   tam kare ise : “Girilen sayı 2 sayısının tam karesidir.” yazdırsın..
                   Ornek : input : 16,  output : Girilen sayı 4 sayısının tam karesidir.
         */

        Scanner scan = new Scanner(System.in);
        /**
        while (true){
            System.out.println("Lütfen bir sayı girin. Tam kare olup olmadığını söyleyeyim.");
            int sayi = scan.nextInt();
            if (sayi == (int)Math.sqrt(sayi)*Math.sqrt(sayi)) {
                System.out.println("Sayi" + (int) Math.sqrt(sayi) + " sayinin tam karesidir");
                break;
            }else {
                System.out.println("girilen sayi tam kare değildir.");
            }
        }*/
        outer:
        while (true) {
            System.out.println("Lütfen bir sayı girin. Tam kare olup olmadığını söyleyeyim.");
            int sayi = scan.nextInt();
            for (int i = 1; i < sayi ; i++) {
                if (i * i == sayi){
                    System.out.println("Sayi " + i + " sayinin tam karesidir");
                    break outer;
                }
            }
            System.out.println("Tam kare değildir.");
        }
    }
}
