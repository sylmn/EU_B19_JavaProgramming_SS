package day11_If_Else_Nestedif;

public class C03_ElseIf_Examples {
    public static void main(String[] args) {

        /**
         * Ayşe'nin cep harçlığı 5 liradan az ise babası 10 tl versin.
         * 50 liradan fazla ise babası 20 tl sini alsın.
         * Aksi durumda babası para vermesin ve almasın  */

        int aysePara = 35;

        if (aysePara < 5) {
            aysePara += 10;

        } else if (aysePara > 50) {
            aysePara -= 20;

        } else {
            aysePara = aysePara;
        }
        System.out.println("aysePara = " + aysePara);

        /**
         * 3 adet iç açı olsun. Bunun üçgen olup olmadığını kontrol edelim.      */

        int x, y, z;
        x = 70;
        y = 60;
        z = 50;

        int toplam = 180;
        boolean durum = toplam == 180;

        if (durum) {
            System.out.println("bu bir üçgendir.");

        } else {
            System.out.println("bu bir üçgen değildir.");
        }
    }
}
