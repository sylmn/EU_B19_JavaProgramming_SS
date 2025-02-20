package day26_StringClass1;

import java.util.Scanner;

public class Muhtelif_Ornekler {
    public static void main(String[] args) {
        /**
         * Temel Sorular

         * Kullanıcıdan bir kelime al ve bu kelimenin uzunluğunu ekrana yazdır.+

         * Kullanıcıdan bir cümle al ve tüm harfleri büyük harfe çevirerek ekrana yazdır.+

         * Kullanıcıdan bir kelime al ve ters çevirerek ekrana yazdır.+

         * Kullanıcıdan bir kelime al ve kelimenin ilk harfini büyük, geri kalanını küçük yaparak yazdır.+

         * Kullanıcıdan bir cümle al ve kaç adet boşluk olduğunu bul.+
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir kelime girin kelimede kac harf oldugunu bildireyim.");
        String girilen = scan.next();
        System.out.println("Girdiginiy kelime " + girilen.length()+" harften olusmaktadir.");

        System.out.println("----------------------------------");

        scan.nextLine();
        System.out.println("Bir cumle girin hepsini buyuk harfle yazayim.");
        String cumle = scan.nextLine();
        System.out.println(cumle.toUpperCase());

        System.out.println("----------------------------------");

        System.out.println("Bir kelime girin tersini yazayim.");
        String kelime = scan.next();
        String reverse = "";
        for (int i = kelime.length()-1; i >=0 ; i--) {
             reverse +=kelime.charAt(i);
        }
        System.out.println("tersi = " + reverse);

        System.out.println("------------------------------------");

        System.out.println("Bir kelime girin ilk harfini büyük geri kalanını küçük yazayim.");
        String kelime2 = scan.next();
        String sonuc = kelime2.substring(0, 1).toUpperCase() + kelime2.substring(1).toLowerCase();
        System.out.println("sonuc = " + sonuc);

        System.out.println("------------------------------------");
        scan.nextLine();

        System.out.println("Bir cümle girin ve kaç adet boşluk olduğunu bulayim.");
        String cumle2 = scan.nextLine();
        int bosluk=0;
        for (int i = 0; i <cumle2.length() ; i++) {

            if (cumle2.charAt(i)==' '){
                bosluk++;
            }
        }
        System.out.println("bosluk sayisi = " + bosluk);


        //int alternatifBosluk = cumle2.length() - cumle2.replace(" ", "").length();

    }
}
