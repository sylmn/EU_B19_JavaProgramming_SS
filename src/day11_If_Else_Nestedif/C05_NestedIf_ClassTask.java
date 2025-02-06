package day11_If_Else_Nestedif;

import java.util.Scanner;

public class C05_NestedIf_ClassTask {
    public static void main(String[] args) {

        /**
         * Bir havuz girişte kullanıcıya 18 yaşında olup olmadığını sorun
         * 18 yaşın altında ise giremezsiniz şeklinde ikaz verip
         * 18 ve üzerinde ise yanında bayan olup olmadığını sorun
         * Bayan yok ise giremesin, bayan var ise yüzme bilip bilmediğiniz sorun
         * Yüzme bilmiyor ise yine giriş yapamasın
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Yaşınızı girin : ");
        int age = scan.nextInt();

        if (age >= 18) {
            System.out.println("Yanınızda bayan var mı? Evet / Hayır");
            String cevapBayan = scan.next();

            if (cevapBayan.equalsIgnoreCase("evet")) {
                System.out.println("Yüzme biliyor musunuz? Evet/Hayır");
                String cevapYuzme = scan.next();

                if (cevapYuzme.equalsIgnoreCase("evet")) {
                    System.out.println("Havuzumuza hoş geldiniz.");

                } else {
                    System.out.println("Yüzme bilmediğinizde GİREMEZSİNİZ. ");}

            } else if (cevapBayan.equalsIgnoreCase("hayır")) {
                System.out.println("Yanınızda bayan yok. GİREMEZSİNİZ");

            } else {
                System.out.println("Evet veya hayır girmediniz.");}

        } else {
            System.out.println("Giremezsiniz.");
        }
    }
}
