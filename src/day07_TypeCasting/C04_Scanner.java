package day07_TypeCasting;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {

        //1. Scanner sınıfından bir obje oluşturuyoruz
        Scanner scan=new Scanner(System.in);

        //2. Kullanıcıyı bilgilendir. Ne istediğini söyle
        System.out.println("Lütfen isminizi giriniz : ");

        //3. Girilen veriyi içine koyabileceğimiz uygun bir değişken oluştur.
        //scanner uygun methodu ile veriyi değişken içerisine yaz

        String name = scan.nextLine();
        //scan.next();       ilk boşluğa kadar alır
        //scan.nextLine();   ilk entera kadar alır
        System.out.println("İsminiz : " + name);

        //4. close scanner
        //scan.close();
    }
}
