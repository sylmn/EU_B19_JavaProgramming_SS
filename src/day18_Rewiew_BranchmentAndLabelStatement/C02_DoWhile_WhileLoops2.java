package day18_Rewiew_BranchmentAndLabelStatement;

import java.util.Scanner;

public class C02_DoWhile_WhileLoops2 {
    public static void main(String[] args) {
        /**
         * koşulun baştan bilindiği ve döngünüün hiç çalışmama ihtimali olduğunda
         * while kullanılır
         * Örneğin : Kullanıcıdan geçerli bir sayı girilmesi istendiğinde
         */
        Scanner sc = new Scanner(System.in);
        int sayi = 0;

        while (sayi <= 0){
            System.out.print("Lütfen pozitif bir sayı giriniz : ");
            sayi = sc.nextInt();
        }
        System.out.println(sayi + " girilmiştir.");

        /**
         * Kullancıya bir menü bilgisi vverilmek istendiğinde
         * Do-while kullanırız. Kullanıcı hatalı girse bile menüyü görür.
         */

        int secim;
        do {
            System.out.println("1- Başla");
            System.out.println("2- Çıkış");
            secim = sc.nextInt();
        }while (secim != 1 && secim != 2);

        System.out.println("Seçilen menü : "+secim);
    }
}
