package day25_Random_Math_Date_Classes;

import java.util.Random;
import java.util.Scanner;

public class C04_Zar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("iki zar toplamini girin");
        int zarToplami = scan.nextInt();

        Random random = new Random();


        int denemeSayisi=0;

        while (true){
            denemeSayisi++;
            int sayi1 = random.nextInt(6)+1;
            int sayi2 = random.nextInt(6)+1;

            if ((sayi1+sayi2)==zarToplami){
                System.out.println("rasgele atilan zarlarin toplami = "+ sayi1+" "+sayi2);
                break;
            }


        }
        System.out.println("denemeSayisi = " + denemeSayisi);
    }
}
