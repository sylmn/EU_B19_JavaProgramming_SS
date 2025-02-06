package day17_DoWhileLoops;

import java.util.Scanner;

public class C01_WhileLoops {
    public static void main(String[] args) {
        /**
         * Do-While Loops
         * - Loops tekrar eden ayni islemleri defalarca yazmadan islem yapmamizi saglayan bir fonksiyon
         *      - bir sayi araliginda, birer arttirarak bir sayiyi bulma veya o sayilari kullanma
         *      - bir uygulamada, son kullanicidan input alarak isleme sokma ve bu isi tekralama
         * - While Loops : while(Kosul) olacak sekilde, kosul true, dogru iken devam eden,
         *      ta ki kosul false, yanlis olana kadar devam edecek olan looplardir.
         *      for(assign ; kosul ; increment/decrement) {
         *          // code
         *      }
         *      // assign
         *      while(kosul) {
         *          // code
         *          // increment/decrement
         *      }
         */

        Scanner scanner = new Scanner(System.in);

        int sifre = 1234;

        for (int denemeSayisi = 1; denemeSayisi <= 3; denemeSayisi++) {

            if (denemeSayisi == 3)
                System.out.println("Dikkat, bu son hakkiniz!");
            System.out.print("Lütfen sifrenizi giriniz : ");
            int girilenSifre = scanner.nextInt();

            if (girilenSifre == sifre) {
                System.out.println("BASARILI");
                System.out.println("Hesaba yonlendiriliyorsunuz!");
                break;
            } else {
                System.out.println("!!! BASARISIZ Deneme !!!");
                System.out.println("Deneme sayisi : = " + denemeSayisi);
                if (denemeSayisi != 3) {
                    continue;
                }
            }
            System.out.println("Kartiniz bloke oldu");
            System.out.print("Lütfen bankamiza basvurunuz!");
        } // break noktasi

        /** continue kullanmadan

         for(int denemeSayisi=1;denemeSayisi<=3;denemeSayisi++){
         System.out.print("Lütfen sifrenizi giriniz : ");
         int girilenSifre = scanner.nextInt();

            if(girilenSifre == sifre) {
            System.out.println("BASARILI");
            System.out.println("Hesaba yonlendiriliyorsunuz!");
            break;
            } else {
            System.out.println("!!! BASARISIZ Deneme !!!");
            }

            if(denemeSayisi == 3) {
            System.out.print("Kartiniz bloke oldu");
            System.out.print("Lütfen bankamiza basvurunuz!");
            }
         } // break noktasi
         */
    }

    /**
     * summarize 2 int numbers
     *
     * @param a
     * @param b
     * @return
     */
    public static int sumNumbers(int a, int b) {
        return a + b;
    }
}
