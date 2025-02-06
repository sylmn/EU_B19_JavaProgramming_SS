package day15_ForLoops;

import java.util.Scanner;

public class C09_SayiBasamakDegerToplami {
    public static void main(String[] args) {
        /**
         * klavyeden girilen sayının basamak değeri toplamını veren kod?
         * Örn : 123 --> 1+2+3 = 6
         * 45897 --> 4+5+8+9+7 = 33
         * 10.000.000 --> 1+0+0... = 1
         * meraklısına : aynı loop içinde basamak sayısını da bulabilirsiniz..
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir sayi girin. Basamak değerini ve basamak sayılarının " +
                "\n toplamını vereyim : ");

        int sayi = scan.nextInt();
        int basamak = 0;
        int toplam = 0;

        for (; sayi > 0; sayi /= 10) {
            basamak++;
            toplam = toplam + sayi % 10;
        }
        System.out.println("Basamak değerleri Toplamı = " + toplam);
        System.out.println("Basamak sayısı = " + basamak);
        /**
         * 1. step kullanicidan input al
         * 2. loop icerisinde inputun uzunlugunu kaydet
         * 3. loop icerisinde her bir basamagin degerini alarak bir degiskende tut
         *      int basamakSayisi = 0;
         *      int basamakDegerleriToplami = 0;
         *      for(int i=number;0<i;){
         *             // 163%10 = 3, 18954%10=4
         *             // 123
         *             // %10 : 10'a bölümünden kalani verecek
         *             // number%10 = 3
         *             // number = number/10 = 12
         *             // number%10 = 2
         *             // number = number/10 = 1
         *             // number%10 = 1
         *             // number = number/10 = 0
         *             basamakSayisi++;
         *             basamakDegerleriToplami = basamakDegerleriToplami + i%10;
         *             i/=10; // i=i/10
         *         }
         * 4. print : basamak degerleri toplamini ve basamak sayisini yazdir
         */
    }
}
