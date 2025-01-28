package day07_TypeCasting;

import java.util.Scanner;

public class C07_ScannerTask2 {
    public static void main(String[] args) {

        // Kullanicidan ismini, soyismini ve yasini alip, asagidaki formatta yazdirin.
        // Isminiz : Himmet
        // Soyisminiz : Abi
        // Yasiniz : 38
        // Dogum Yeriniz : Kayseri
        // Kaydiniz basariyla tamamlanmistir.

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen adınızı giriniz        : ");
        String adı = scan.nextLine();

        System.out.print("Lütfen soyadınızı giriniz     : ");
        String soyadı = scan.nextLine();

        System.out.print("Lütfen yaşınızı girin         : ");
        int yası = scan.nextInt();

        scan.nextLine();
        System.out.print("Lütfen doğum yerinizi girin     : ");
        String dogumYeri = scan.nextLine();

        System.out.println("İsminiz         : " + adı);
        System.out.println("Soyisminiz      : " + soyadı);
        System.out.println("Yaşınız         : " + yası);
        System.out.println("Dogum Yeriniz   : " + dogumYeri);
        System.out.println("Kaydiniz basariyla tamamlanmistir.");

    }
}
