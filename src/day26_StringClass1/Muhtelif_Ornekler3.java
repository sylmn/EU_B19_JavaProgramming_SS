package day26_StringClass1;

import java.util.Scanner;

public class Muhtelif_Ornekler3 {
    public static void main(String[] args) {
         /**
          * Orta Seviye Sorular

          * Kullanıcıdan bir cümle al ve kelimeleri ters sırada ekrana yazdır.

          * Kullanıcıdan bir e-posta adresi al ve geçerli olup olmadığını kontrol et.
          (Geçerli bir e-posta "@ ve . içermelidir.")

          * Kullanıcıdan bir cümle al ve tüm kelimelerin ilk harflerini büyük yaparak yazdır.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir kelime girin ve palindrom olup olmadığını bildireyim.");
        String girilen = scan.next();
        String reverse = "";
        for (int i = girilen.length()-1; i >=0 ; i--) {
            reverse+=girilen.charAt(i);
        }
        if (girilen.equalsIgnoreCase(reverse)){
            System.out.println("Bu kelime palindrom dur.");
        }else {
            System.out.println("Bu kelime palindrom degildir");
        }
        System.out.println("---------------------------------");
        scan.nextLine();
        System.out.println("Bir cümle girin ve içinde geçen sesli harfleri sayayim.");
        String cumle = scan.nextLine().toLowerCase();
        int sesliHarfSayac=0;
        /*
        for (int i = 0; i <cumle.length() ; i++) {
            if (cumle.charAt(i)=='a' || cumle.charAt(i)=='e'||cumle.charAt(i)=='i'||cumle.charAt(i)=='u'||cumle.charAt(i)=='ü'
            ||cumle.charAt(i)=='o'||cumle.charAt(i)=='ö'){
                sesliHarfSayac++;
            }
        }
        */

        String sesliHarfler = "aeıioöuü";
        for (int i = 0; i < cumle.length(); i++) {
            if (sesliHarfler.contains(String.valueOf(cumle.charAt(i)))) {
                sesliHarfSayac++;
            }
        }
        System.out.println("sesliHarfSayac = " + sesliHarfSayac);
    }
}
