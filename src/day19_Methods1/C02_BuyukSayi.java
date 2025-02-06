package day19_Methods1;

import java.util.Scanner;

public class C02_BuyukSayi {
    public static void main(String[] args) {
        buyukSayi();
        buyukSayi();
    }
    /**
     * Girilen iki sayıdan büyük olanını yazdıran metod nedir?
     */

    public static void buyukSayi (){
        Scanner scan = new Scanner(System.in);
        System.out.println("İki sayi giriniz");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();
        if (sayi1>=sayi2){
            System.out.println(sayi1+" büyük olan sayidir");
        }else {
            System.out.println(sayi2+" büyük olan sayidir.");
        }
    }
}
