package day15_forLoops;

import java.util.Scanner;

public class C09_SayiBasamakDegerToplami {
    public static void main(String[] args) {
        //KLAVYEDEN GİRİLEN SAYİNİN BASAMAK DEGERİNİN TOPLAM DEGERİNİ VEREN KOD
        // meraklısına sayı kaç basamaklı onu da söylesin

        Scanner scan =new Scanner(System.in);
        System.out.print("Lütfen bir sayi girin. Basamak değerini ve basamak sayılarının " +
                "\n toplamını vereyim : ");

        int sayi= scan.nextInt();
        int basamak = 0;
        int toplam = 0;
        int birler;

        for (;sayi>0; sayi/=10) {

                birler = sayi % 10;
                basamak++;
                toplam = birler + toplam;
            System.out.println("here");
            }

        System.out.println("toplam = " + toplam);
        System.out.println("basamak = " + basamak);


    }
}
