package day25_Random_Math_Date_Classes;

import java.util.Random;
import java.util.Scanner;

public class C04_Dice {
    public static void main(String[] args) {

        System.out.print("Lütfen 2 zar ile ulaşmak istediğiniz sayıyı geriniz : ");
        Scanner sc = new Scanner(System.in);
        int toplamZar = sc.nextInt();

        int zar1, zar2, denemeSayisi = 0;

        Random random = new Random();

        do {
            denemeSayisi++;
            zar1 = random.nextInt(6) + 1;
            zar2 = random.nextInt(6) + 1;
            System.out.println(zar1 + " + " + zar2 + " = " + (zar1 + zar2));
        } while ((zar1 + zar2) != toplamZar);

        System.out.println("Hedeflenen zar toplamına " + denemeSayisi + " denemede ulaştınız.");
    }
}
