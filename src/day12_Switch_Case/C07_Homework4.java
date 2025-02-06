package day12_Switch_Case;

import java.util.Scanner;

public class C07_Homework4 {
    public static void main(String[] args) {

        /** TASK 4 :
        - Kullanicidan aldigi urun adedi ve urun fiyatini alin,
        - Kullaniciya musteri karti olup olmadigini sorun.

            Musteri karti varsa;    10 urun veya fazla alirsa %20,
                                    10 urunden az alirsa %15 indirim yapin,
            Musteri karti yoksa;    10 urun veya fazla alirsa %15,
                                    10 urunden az %10 indirim yapin
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Ürün adedini girin");
        int urunAdedi = scan.nextInt();
        System.out.println("Ürün fiyatını girin");
        int urunFiyatı = scan.nextInt();
        scan.nextLine();
        System.out.println("Müsteri kartınız var mı? Evet/Hayır");
        String kartVarMi = scan.nextLine();

        if (kartVarMi.equalsIgnoreCase("evet")){
            if (urunAdedi>=10){
                int normalUrunFiyatToplami = urunFiyatı*urunAdedi;
                double indUrunFiyToplami = normalUrunFiyatToplami-(normalUrunFiyatToplami*0.20);
                System.out.println("Normalde "+normalUrunFiyatToplami+" TL ödeyecektiniz. Ancak \n" +
                        indUrunFiyToplami+" TL ödeyeceksiniz. 10 üründen fazla alana %20 iskonto yapılıyor.");
            }else {
                int normalUrunFiyatToplami = urunFiyatı*urunAdedi;
                double indUrunFiyToplami = normalUrunFiyatToplami-(normalUrunFiyatToplami*0.15);
                System.out.println("Normalde "+normalUrunFiyatToplami+" TL ödeyecektiniz. Ancak \n" +
                        indUrunFiyToplami+" TL ödeyeceksiniz. 10 üründen az alana %15 iskonto yapılıyor.");
            }
        }else {
            if (urunAdedi>=10){
                int normalUrunFiyatToplami = urunFiyatı*urunAdedi;
                double indUrunFiyToplami = normalUrunFiyatToplami-(normalUrunFiyatToplami*0.15);
                System.out.println("Normalde "+normalUrunFiyatToplami+" TL ödeyecektiniz. Ancak \n" +
                        indUrunFiyToplami+" TL ödeyeceksiniz. Müsteri kartiniz olmadığı için \n" +
                        "10 üründen fazla alana %15 iskonto yapılıyor.");
            }else {
                int normalUrunFiyatToplami = urunFiyatı*urunAdedi;
                double indUrunFiyToplami = normalUrunFiyatToplami-(normalUrunFiyatToplami*0.10);
                System.out.println("Normalde "+normalUrunFiyatToplami+" TL ödeyecektiniz. Ancak \n" +
                        indUrunFiyToplami+" TL ödeyeceksiniz. Müsteri kartiniz olmadığı için \n" +
                        "10 üründen az alana %10 iskonto yapılıyor.");
            }
        }
    }
}
