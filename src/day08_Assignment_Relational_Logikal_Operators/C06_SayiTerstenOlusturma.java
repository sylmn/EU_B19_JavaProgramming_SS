package day08_Assignment_Relational_Logikal_Operators;

import java.util.Scanner;

public class C06_SayiTerstenOlusturma {
    public static void main(String[] args) {

        // Homework: verilen 3 basamaklı sayıyı tersten olusturan kodu yazın.
        // 123  --> 321

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen üç basamaklı bir sayı girin, \n size o sayının tersini yazayım :");

        int girilenSayi = scan.nextInt();
        int basamak, tersSayi;

        tersSayi = 0;
        basamak = girilenSayi % 10; //3

        tersSayi = tersSayi * 10 + basamak; //3
        girilenSayi /= 10;  //12
        basamak = girilenSayi % 10; //2

        tersSayi = tersSayi * 10 + basamak; //32
        girilenSayi /= 10; //1
        basamak = girilenSayi;

        tersSayi = tersSayi * 10 + basamak;

        System.out.println("tersSayi = " + tersSayi);
    }
}
