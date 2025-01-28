package day14_Review;

import java.util.Scanner;

public class C01_GeometricShape {
    public static void main(String[] args) {
//verilen kenar sayısından şeklin hangi geometrik şekil olduğunu tespit eden bir program yazın,
        //3-6 arası kenar sayısı kabul etsin

        Scanner scan=new Scanner(System.in);
        System.out.print("Kenar sayısını girin : ");

        int kenarSayisi= scan.nextInt();
        String sekil="";

        if (kenarSayisi == 3){
            sekil = "Bu bir üçgendir. ";

        } else if (kenarSayisi==4) {
            sekil = "Bu bir dörtgendir.";

        }else if (kenarSayisi==5) {
            sekil = "Bu bir beşgendir.";

        }else if (kenarSayisi==6) {
            sekil = "Bu bir altıgendir.";
        }else {
            System.out.println("Belirlenmemiş şekil.");
        }
        if (kenarSayisi>=3 && kenarSayisi<=6){
            //System.out.println("Bu bir "+kenarSayisi+" gendir.");
            System.out.println("Bu bir " + sekil);
        }
    }
}
